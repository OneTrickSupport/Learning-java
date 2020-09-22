/*Kurs: 1IK143
Laboration: Labb5:4
Kursdeltagare: Karl Nilros
HT18 och 2018-10-12*/

import java.util.Arrays;
import java.util.Random;

public class uppgift4 {
    public static void main(String[] args) {
        Random slump = new Random();
        int[] arr1 = new int[10000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[10000];

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = slump.nextInt();
        }

        System.arraycopy(arr1, 0, arr2, 0, 10000);
        System.arraycopy(arr1, 0, arr3, 0, 10000);


        Bubbelsort(arr1);
        selektionsort(arr2);
        datorn(arr3);

    }


    public static void Bubbelsort(int[] enArray) {
        long starttid = System.nanoTime();
        int tmp = 0;
        for (int k = 1; k < enArray.length; k++) {
            for (int i = 0; i < enArray.length-1; i++) {
                if (enArray[i] > enArray[i + 1]) {
                    tmp = enArray[i];
                    enArray[i] = enArray[i + 1];
                    enArray[i + 1] = tmp;
                }
            }
        }
        System.out.print("Bubbelsortering: ");
        System.out.println(System.nanoTime() - starttid);

    }
    public static void selektionsort(int[] enArray) {
        long starttid = System.nanoTime();
        for (int i = 0; i < enArray.length - 1; i++) {
            int numinsta = enArray[i];
            int index = i;
            for (int j = i + 1; j < enArray.length; j++) {
                if (numinsta > enArray[j]) {
                    numinsta = enArray[j];
                    index = j;
                }
            }
            if (index != i) {
                enArray[index] = enArray[i];
                enArray[i] = numinsta;
            }

        }
        System.out.print("Urvalssortering: ");
        System.out.println(System.nanoTime() - starttid);

    }
    public static void datorn(int[] enArray){
        long starttid = System.nanoTime();
        Arrays.sort(enArray);
        System.out.print("Intern quicksort: ");
        System.out.println(System.nanoTime() - starttid);
    }



}
