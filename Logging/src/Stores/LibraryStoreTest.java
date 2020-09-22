package Stores;


import static org.mockito.Mockito.*;

import Managers.LibraryManager;
import org.junit.jupiter.api.Test;
import DBhelpers.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryStoreTest {

    @Test
    void returnsBookDBTest() {


    }

    @Test
    void createLoanDBTest() {
    }


    @Test
    void getAllBooksTest() {
        //LibraryStore library = mock(LibraryStore.class);
        LibraryStore library = new LibraryStore();


        for (int i = 0; i < library.getAllBooks().size(); i++) {
            System.out.println(library.getAllBooks().get(i).getTitle());
        }


    }

    @Test
    void getAllItemsTest() {
        LibraryStore library = new LibraryStore();

        for (int i = 0; i < library.getAllItems().size(); i++) {
            System.out.println(library.getAllItems().get(i).getId());
        }
    }

    @Test
    void getAllLoansTest() {
        LibraryStore library = new LibraryStore();

        for (int i = 0; i < library.getAllLoans().size(); i++) {
            System.out.println(library.getAllLoans().get(i).getLoanID());
        }
    }


    @Test
    void SearchBookTest() {
        LibraryStore library = mock(LibraryStore.class);
        LibraryManager manager = new LibraryManager(library);
        ArrayList<Book> bookArrayList = new ArrayList<Book>();
        bookArrayList.add(new Book("En bur av guld", 7, "Camilla Läckberg", 978915));
        bookArrayList.add(new Book("Brevvännerna", 4, "Eli Åhman Owetz", 978913));
        bookArrayList.add(new Book("Det första chiffret", 2, "Denise Rudberg", 978009));
        bookArrayList.add(new Book("Educated", 1, "Tara Westover", 978152));
        bookArrayList.add(new Book("The path made clear", 5, "Oprah Winfrey", 978144));
        bookArrayList.add(new Book("Milk and hooney", 10, "Rubi Kaur", 978914));
        bookArrayList.add(new Book("Kudos", 3, "Rachel Cusk", 978057));
        bookArrayList.add(new Book("The Mister", 2, "E L James", 978178));
        bookArrayList.add(new Book("Outline", 3, "Rachel Cusk", 978058));
        bookArrayList.add(new Book("Fire and blood", 6, "George R R Martin", 978000));

        when(library.getAllBooks())
                .thenReturn(bookArrayList);


        assertEquals(manager.searchBook("Outline").getIsbn(), 978058);

    }

    @Test
    void checkAvailableBooksTest() {
        LibraryStore library = mock(LibraryStore.class);
        LibraryManager manager = new LibraryManager(library);
        ArrayList<Item> itemArrayList = new ArrayList<Item>();
        itemArrayList.add(new Item(000001,true,978913));
        itemArrayList.add(new Item(000002,true ,978913));
        itemArrayList.add(new Item(000003,true ,978915));
        itemArrayList.add(new Item(000004,true ,978915));
        itemArrayList.add(new Item(000005,true ,978913));
        itemArrayList.add(new Item(000006,true ,978913));
        itemArrayList.add(new Item(000007,true ,978009));
        itemArrayList.add(new Item(000010,true ,978144));

        when(library.getAllItems())
                .thenReturn(itemArrayList);

        int[] ids = new int[]{000001,000002,000005,000006};

        int[]actual = new int[4];

        for (int i = 0; i < manager.checkAvailableBook(978913).size();i++){
            actual[i] = manager.checkAvailableBook(978913).get(i).getId();
        }


       assertArrayEquals(ids, actual);
    }

    @Test
    void bajs() {
        LibraryStore library = new LibraryStore();
        library.bajs();
    }
}