package Stores;

import DBhelpers.Book;
import DBhelpers.Item;
import DBhelpers.Loan;
import DBhelpers.Member;
import Interfaces.ILibraryStore;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class LibraryStore implements ILibraryStore {
    ArrayList<Book> books;
    ArrayList<Item> items;
    ArrayList<Loan> loans;


    @Override
    public ArrayList<Book> searchBook(String title) {

        ArrayList<Book> temp = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle() == title) {
                temp.add(books.get(i));
            }
        }
        return temp;
    }

    @Override
    public ArrayList<Item> checkAvailableBook(int ISBN) {

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

    @Override
    public boolean returnsBook(int itemId) {
        Loan tmploan = getloanfromitem(itemId);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivrutin laddad!");
        } catch (ClassNotFoundException e) {
            System.out.println("Misslyckades att ladda drivrutinen");
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {
            System.out.println("YES!");

            Statement stt = conn.createStatement();
            stt.executeQuery("UPDATE item set Available = true where ID =" + itemId);

            Statement stt1 = conn.createStatement();
            stt1.executeQuery("DELETE loan where LoanID = " + tmploan.getLoanID());


        } catch (SQLException e) {
            System.out.println("Det sekt bajs " + e.getMessage());
        }


        return true; //ska fixas
    }

    @Override
    public void createLoan(int itemId, int memberId) {

        String date = LocalDate.now().toString();


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivrutin laddad!");
        } catch (ClassNotFoundException e) {
            System.out.println("Misslyckades att ladda drivrutinen");
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {
            System.out.println("YES!");

            Statement stt = conn.createStatement();
            stt.executeQuery("INSERT into loan VALUES(" + date + generateLoanID() + memberId + itemId + ")");


        } catch (SQLException e) {
            System.out.println("Det sekt bajs " + e.getMessage());
        }


    }

    @Override
    public Loan getloanfromitem(int itemId) {
        Item tmp = getitem(itemId);
        Loan temp = null;

        for (int i = 0; i < loans.size(); i++) {
            if (itemId == loans.get(i).getItemID()) {
                temp = loans.get(i);
            }
        }

        return temp;
    }

    @Override
    public Item getitem(int itemId) {
        ArrayList<Item> tmp = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == itemId) {
                tmp.add(items.get(i));
            }
        }


        return tmp.get(0);
    }

    public int generateLoanID() {
        ArrayList<Integer> IdArray = new ArrayList<>();
        int Id = 0;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {

            PreparedStatement IDStatement = conn.prepareStatement("SELECT loan.LoanID from library.loan");
            ResultSet result = IDStatement.executeQuery();

            while (result.next()) {
                IdArray.add(result.getInt(1));
            }
        } catch (SQLException e) {
            System.out.println("Det sekt sig " + e.getMessage());
            throw new NullPointerException();
        }

        Boolean ledig = false;
        while (ledig = false) {

            Random rnd = new Random();
            Id = rnd.nextInt(9999);
            if (Id < 1000) {
                Id += 1000;
            }

            Boolean upptagen = false;
            int[] array = IdArray.stream().mapToInt(i -> i).toArray();

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

}
