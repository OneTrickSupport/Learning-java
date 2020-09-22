package Labb2;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Hashtabell<E extends Comparable<E>> implements Iterable<E> {
     private LinkedList<E>[] hashtabell;
     private int storlek = 31;
     private int antalElement = 0;

     public Hashtabell (){
       hashtabell = new LinkedList[storlek];
    }



    private int hash(E e) {
        int h = e.hashCode();
        if(h < 0) {
            h = -h;
        }
        return h % storlek;
    }

    public void add(E e)  {
        int hink = hash(e);
        if(contains(e)){
            return;
        }
        if(hashtabell[hink] == null) {
            hashtabell[hink] = new LinkedList<E>();
        }
        hashtabell[hink].add(e);
        antalElement++;
    }

    public boolean remove(E e){
         int hink = hash(e);
         if(!contains(e)){
             return false;
         }
         if(hashtabell[hink] != null){
             int c = 0;
             E current = e;
             for (int i = 0; i < hashtabell[hink].size() ; i++, c++) {
                if( hashtabell[hink].get(i).equals(current)){
                    break;
                }
                current = hashtabell[hink].get(i);

             }
             hashtabell[hink].set(c, null);


         }
        antalElement--;
         if(hashtabell[hink].isEmpty()){
             hashtabell[hink] = null;
             storlek--;
         }return true;
    }


    public boolean contains(E e) {
        int pos = hash(e);
        if(hashtabell[pos] != null) {
            LinkedList<E> bucket = hashtabell[pos];
            return bucket.contains(e);
        }
        return false;
    }

    public void visaHashtabell() {
        for(int i = 0; i < storlek; i++) {
            System.out.print("[" + i + "]: ");
            if(hashtabell[i] == null) {
                System.out.print("null");
            } else {
                for (E e : hashtabell[i]) {
                    System.out.print(e + " -> ");
                }
            }
            System.out.println();
        }
    }


private ArrayList<E> setTolist(){
         ArrayList<E> list = new ArrayList<>();

    for (int i = 0; i < storlek ; i++) {
        if(hashtabell[i] != null){
            for (E e: hashtabell[i]){
                list.add(e);
            }
        }
    }return list;
}

private void rehash(){
         ArrayList<E> list = setTolist();
         storlek <<= 1;
         hashtabell = new LinkedList[storlek];
         antalElement = 0;

       for (E element: list){
           add(element);
       }

}

public E min(){
         int i = 0;
         int k = 0;
         E current = null;

    for (int j = 0; j < storlek ; j++) {
        if(hashtabell[j] != null){
            current = hashtabell[j].getFirst();
        }
    }

         for (LinkedList<E> e: hashtabell){
             if(e != null) {
                 for (E tmp : e) {
                 if (tmp.compareTo(current) < 0) {
                     current = tmp;
                 }
                 i++;
             }}
         }
         return current;

}

    public E max(){
        int i = 0;
        int k = 0;
        E current = null;

        for (int j = 0; j < storlek ; j++) {
            if(hashtabell[j] != null){
                current = hashtabell[j].getFirst();
            }
        }

        for (LinkedList<E> e: hashtabell){
            if(e != null) {
                for (E tmp : e) {
                    if (tmp.compareTo(current) > 0) {
                        current = tmp;
                    }
                    i++;
                }}
        }
        return current;

    }


















    @Override
    public Iterator<E> iterator() {
        return new HashIterator(this);
    }
    private class HashIterator implements Iterator<E>{

         private ArrayList<E> list;
         private int current = 0;
         private Hashtabell<E> set;

         public HashIterator(Hashtabell<E> set){
             this.set = set;
             list = setTolist();
         }

        @Override
        public boolean hasNext() {
            return current < list.size();
        }

        @Override
        public E next() {
            return list.get(current++);
        }


    }
}
