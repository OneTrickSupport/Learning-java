package Stores;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import DBhelpers.Book;
import DBhelpers.Item;
import DBhelpers.Loan;
import DBhelpers.Member;
import Interfaces.ILibraryStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class LibraryStore {
    Logger logger = LogManager.getLogger(LibraryStore.class.getName());
   /* ArrayList<Book> books;
    ArrayList<Item> items;
    ArrayList<Loan> loans;


    public LibraryStore(){
        books = new ArrayList<>();
        items = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public LibraryStore(ArrayList<Book> books) {
        this.books = books;

    }*/


    public void bajs() {
        logger.info("ino");
        logger.debug("Debug");
        logger.error("error");
    }


    public boolean returnsBookDB(int itemId, int loanID) {
        logger.info("delets loan and items get avalible");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {
            System.out.println("YES!");

            Statement stt = conn.createStatement();
            stt.executeQuery("UPDATE item set Available = true where ID =" + itemId);

            Statement stt1 = conn.createStatement();
            stt1.executeQuery("DELETE loan where LoanID = " + loanID);


        } catch (SQLException e) {
            System.out.println("Det sekt bajs " + e.getMessage());
        }


        return true; //ska fixas
    }


    public void createLoanDB(int itemId, int memberId, int loanid) {

        String date = LocalDate.now().toString();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {
            System.out.println("YES!");

            Statement stt = conn.createStatement();
            stt.executeQuery("INSERT into loan VALUES(" + date + loanid + memberId + itemId + ")");


        } catch (SQLException e) {
            System.out.println("Det sekt bajs " + e.getMessage());
        }


    }


    public ArrayList<Book> getAllBooks() {
        logger.debug("Reads in books from database");
        ArrayList<Book> tmp = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {

            PreparedStatement IDStatement = conn.prepareStatement("SELECT * from library.book");
            ResultSet result = IDStatement.executeQuery();

            while (result.next()) {
                tmp.add(new Book(result.getString(1), result.getInt(2), result.getString(3), result.getInt(4)));
            }

        } catch (SQLException e) {
            System.out.println("Det sekt sig " + e.getMessage());
            logger.error("Could not load books");
            throw new NullPointerException();
        }
        logger.debug("Ended");
        return tmp;

    }

    public ArrayList<Loan> getAllLoans() {
        ArrayList<Loan> tmp = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {

            PreparedStatement IDStatement = conn.prepareStatement("SELECT * from library.loan");
            ResultSet result = IDStatement.executeQuery();

            while (result.next()) {
                tmp.add(new Loan(result.getDate(1), result.getInt(2), result.getInt(3), result.getInt(4)));
            }
        } catch (SQLException e) {
            System.out.println("Det sekt sig " + e.getMessage());
            throw new NullPointerException();
        }
        return tmp;

    }

    public ArrayList<Item> getAllItems() {
        ArrayList<Item> tmp = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {

            PreparedStatement IDStatement = conn.prepareStatement("SELECT * from library.item");
            ResultSet result = IDStatement.executeQuery();

            while (result.next()) {
                tmp.add(new Item(result.getInt(1), result.getBoolean(2), result.getInt(3)));
            }
        } catch (SQLException e) {
            logger.error("Databasuppkopplingen funkar inte");
            throw new NullPointerException();
        }
        return tmp;
    }

}
