package com.peyman.io;

import com.peyman.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
    static Connection con;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234567");
            System.out.println("Connected!!!");
        } catch (SQLException e) {
            System.out.println("Could not Connect");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> getAllPerson() {
        List<Person> people = new ArrayList<>();

        try {

            Statement statement = con.createStatement();
            ResultSet set = statement.executeQuery("SELECT * from PERSON");
            while (set.next()) {
                String name = set.getString(1);
                String family = set.getString(2);
                Person person = new Person(name, family);
                people.add(person);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return people;

    }


    public static void save(Person person) throws SQLException {

        PreparedStatement ps =  con.prepareStatement("INSERT into person(name, family) values(? , ?)");
        ps.setString(1, person.getName());
        ps.setString(2, person.getFamily());
        ps.executeUpdate();

    }
}
