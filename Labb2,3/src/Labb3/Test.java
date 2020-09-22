package Labb3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivrutin laddad!");
        } catch (ClassNotFoundException e){
            System.out.println("Misslyckades att ladda drivrutinen");
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/musik?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Mammapappa1")){
            System.out.println("YES!");
        }catch (SQLException e){
            System.out.println("Det sekt sig " + e.getMessage());

        }
    }
}
