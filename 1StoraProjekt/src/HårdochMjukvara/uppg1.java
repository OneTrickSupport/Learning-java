package Labb3;



import java.sql.*;

public class uppg1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivrutin laddad!");
        } catch (ClassNotFoundException e) {
            System.out.println("Misslyckades att ladda drivrutinen");
        }

        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/musikdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")) {
            System.out.println("YES!");

           Statement statement = conn.createStatement();

           ResultSet result = statement.executeQuery("select * from artist");
            System.out.println();
            System.out.println("Artister");
            System.out.println("=========");
            System.out.println();

            while (result.next()){
               System.out.println(result.getString(1) + " (" + result.getString(2) + ") : " + result.getString(3));
            }
            System.out.println();
            System.out.println("Album");
            System.out.println("=========");
            System.out.println();

            result = statement.executeQuery("select * from album");

            while (result.next()){
                System.out.println(result.getString(1) + ": " + "(" + result.getString(2) + ") : " + result.getString(3));
            }


        } catch (
                SQLException e) {
            System.out.println("Det sekt sig " + e.getMessage());

        }

    }
}
