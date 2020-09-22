package labb1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayTest {

    IntArray a = new IntArray();
    IntArray b = new IntArray();

    @Test
    void getAverage() throws ArrayExeption {
        assertEquals(2, a.getAverage());

    }
    @Test
    void getAverage_Tom() throws ArrayExeption {
        a.arr = new  int[]{};
        assertThrows(ArrayExeption.class, () -> {
            a.getAverage();
        });
    }

    @Test
    void findPositions() {
        assertArrayEquals(new int[]{1,3,4}, a.findPositions(2));
        assertArrayEquals(new int[]{}, a.findPositions(0));

    }
    @Test
    void findPositon_Tom(){
        a.arr = new int[] {};
        assertArrayEquals(new int[]{}, a.findPositions(9));
    }

    @Test
    void appendLast() {
        a.appendLast(5);

        assertArrayEquals(new int[]{1,2,3,2,2,5}, a.arr);

        //assertArrayEquals(new int[]{5}, a.arr);

    }
    @Test
    void appendLast_Tom(){
        a.arr = new int[]{};
        a.appendLast(10);
        assertEquals(10, a.arr[a.arr.length-1]);
    }

    @Test
    void insertAt() throws ArrayExeption {
        a.insertAt(2,10);
        assertArrayEquals(new int[]{1,2,10,3,2,2}, a.arr);
        assertThrows(ArrayExeption.class, () -> {
            a.insertAt(-1,10);
        });

    }
    @Test
    void  insertAt_Tom() throws ArrayExeption {
        a.arr = new int[]{};
        a.insertAt(0,10);
        assertEquals(10, a.arr[0]);
    }

    @Test
    void getAt() throws ArrayExeption {
        assertEquals(3, a.getAt(2));
        assertThrows(ArrayExeption.class, () -> {
           a.getAt(-1);
        });
        assertThrows(ArrayExeption.class, () -> {
          a.getAt(10);
        });
    }

    @Test
    void setAt() throws ArrayExeption {
        b.setAt(2,10);
        assertArrayEquals(new int[]{1,2,10,2,2}, b.arr);
        assertThrows(ArrayExeption.class, () -> {
            a.setAt(-1, 2);
        });

    }
    @Test
    void  setAt_Tom() throws ArrayExeption {
        a.arr = new int[1];
        a.setAt(0,10);
        assertEquals(10, a.arr[0]);
    }

    @Test
    void deleteAt() throws ArrayExeption {
        assertThrows(ArrayExeption.class, () -> {
            a.getAt(-1);
        });
        assertThrows(ArrayExeption.class, () -> {
            a.getAt(10);
        });
        assertThrows(ArrayExeption.class, () -> {
            a.getAt(6);
        });
        a.deleteAt(2);
        assertArrayEquals(new int[]{1,2,2,2}, a.arr);

    }
}