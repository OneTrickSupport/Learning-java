
package Managers;

import DBhelpers.Book;
import DBhelpers.Item;
import DBhelpers.Loan;
import DBhelpers.Member;
import Interfaces.ILibraryStore;
import Stores.LibraryStore;

import java.util.ArrayList;
import java.util.Random;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LibraryManager {
    Logger logger = LogManager.getLogger(LibraryManager.class.getName());


    LibraryStore libraryStore;

    public LibraryManager(LibraryStore ls) {
        libraryStore = ls;
    }


    public Book searchBook(String title) {
        logger.info("Start with loading in book");
        ArrayList<Book> books = libraryStore.getAllBooks();


        Book temp = new Book();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle() == title) {
                logger.info("found book");
                temp = books.get(i);
                break;
            }
        }
        logger.info("ended");
        return temp;
    }

    public ArrayList<Item> checkAvailableBook(int ISBN) {
        ArrayList<Item> items = libraryStore.getAllItems();

        ArrayList<Item> tmp = new ArrayList<>();
        ArrayList<Item> tmp1 = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getISBN() == ISBN) {
                tmp.add(items.get(i));
            }
        }
        for (int i = 0; i < tmp.size(); i++) {
            if (tmp.get(i).isAvailable() == true) {
                tmp1.add(tmp.get(i));
            }
        }

        return tmp1;
    }


    public Item getitem(int itemId) {
        ArrayList<Item> items = libraryStore.getAllItems();

        Item tmp = null;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == itemId) {
                tmp = items.get(i);
            }
        }


        return tmp;
    }


    public Loan getloanfromitem(int itemId) {
        ArrayList<Loan> loans = libraryStore.getAllLoans();
        Loan temp = null;

        for (int i = 0; i < loans.size(); i++) {
            if (itemId == loans.get(i).getItemID()) {
                temp = loans.get(i);
            }
        }

        return temp;
    }


    public void createLoan(Item item, Member member) {

        libraryStore.createLoanDB(item.getId(), member.getId(), generateloanID());

    }

    public int generateloanID() {

        ArrayList<Integer> idArray = new ArrayList();

        for (int i = 0; i < libraryStore.getAllLoans().size(); i++) {
            idArray.add(libraryStore.getAllLoans().get(i).getLoanID());
        }

        int Id = 0;

        Boolean ledig = false;
        while (ledig = false) {

            Random rnd = new Random();
            Id = rnd.nextInt(9999);
            if (Id < 1000) {
                Id += 1000;
            }

            Boolean upptagen = false;
            int[] array = idArray.stream().mapToInt(i -> i).toArray();

            for (int i = 0; i < array.length; i++) {
                if (array[i] == Id) {
                    upptagen = true;
                }
            }

            if (upptagen == false) {
                ledig = true;
            }
        }

        return Id;
    }

    public boolean returnBook(Item item) {
        int tmp = 0;
        for (int i = 0; i < libraryStore.getAllLoans().size(); i++) {
            if (libraryStore.getAllLoans().get(i).getItemID() == item.getId()) {
                tmp = libraryStore.getAllLoans().get(i).getLoanID();
            }
        }
        if (tmp == 0) {
            return false;
        }
        libraryStore.returnsBookDB(item.getId(), tmp);

        return true;
    }
}
