package Labb2;


import java.util.Iterator;

public class Kedja<E extends Comparable<E>> implements Iterable<E> {

private Node<E> huvud;
private Node<E> svans;
private int size = 0;


public void addFirst(E e){
    Node<E> newNode = new Node<>(e);
    newNode.next = huvud;
    huvud = newNode;
    size++;

    if(svans == null){
        svans = huvud;
    }
}

public void addLast(E e){
    Node<E> newNode = new Node<>(e);
    if(svans==null){
        huvud = svans = newNode;
    }
    else {
        svans.next = newNode;
        svans = newNode;
    }
    size++;
}

public void addAt(int index, E e){
    if(index == 0){
        addFirst(e);
    }
    else if(index >= size){
        addLast(e);
    }
    else {
        Node<E> current = huvud;
        for (int i = 1; i < index ; i++) {
            current = current.next;
        }
        Node<E> tmp = current.next;
        current.next = new Node<>(e);
        (current.next).next = tmp;
        size++;
    }
}

public E removeFirst(){
    if(size == 0){
        return null;
    }else {
        Node<E> tmp = huvud;
        huvud = huvud.next;
        size--;
        if(huvud == null){
            svans = null;
        }
        return tmp.data;
    }
}

public E removeLast(){
    if(size == 0)return null;
    else if(size == 1){
        Node<E> tmp = huvud;
        huvud = svans = null;
        size = 0;
        return tmp.data;
    }
    else {
        Node<E> current = huvud;

        for (int i = 1; i < size-2; i++)
            current = current.next;

        Node<E> tmp = svans;
        svans = current;
        svans.next = null;
        size--;
        return tmp.data;
    }
}

    public Node getHuvud() {
        return huvud;
    }

    public void setHuvud(Node huvud) {
        this.huvud = huvud;
    }

    public Node getSvans() {
        return svans;
    }

    public void setSvans(Node svans) {
        this.svans = svans;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public E removeAt(int index){
    if(index < 0 || index >= size) return null;
    else if(index == 0) return removeFirst();
    else if(index == size - 1) return  removeLast();
    else {
        Node<E> previous = huvud;

        for (int i = 0; i < index ; i++) {
            previous = previous.next;
        }

        Node<E> current = previous.next;
        previous.next = current.next;
        size--;
        return current.data;
    }


}

public void addInorder(E e){
    Node<E> newNode = new Node<>(e);
    if(huvud == null){
        huvud = newNode;
        svans = newNode;
    }
    else if(newNode.data.compareTo(huvud.data) <= 0 ){
        newNode.next = huvud;
        huvud = newNode;
    }
    else if(newNode.data.compareTo(huvud.data) > 0){
        Node<E> current = huvud;
        while (current.next != null &&
        current.next.data.compareTo(newNode.data) <= 0){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

        
    }
    size++;

}
    public boolean contains(E e) {
        Node search = huvud;
        while(search!=null) {
            if(search.data.equals(e)){
                return true;
            }
            search = search.next;
        }
        return false;
    }





    @Override
            public Iterator<E> iterator () {
                return new LinkedListIterator();
            }
            private class LinkedListIterator implements Iterator<E>{
    private Node<E> current = huvud;


                @Override
                public boolean hasNext() {
                    return (current != null);
                }

                @Override
                public E next() {
                    E e = current.data;
                    current = current.next;
                    return e;
                }
            }
        }

