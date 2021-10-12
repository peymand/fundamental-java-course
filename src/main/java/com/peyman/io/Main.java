package com.peyman.io;

import com.mysql.cj.jdbc.Driver;
import com.peyman.model.Person;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.*;

public class Main {


    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        JTextField name =  new JTextField(10);
        JTextField family =  new JTextField(10);
        frame.add(name);
        frame.add(family);
        JButton get = new JButton("GET");
        JButton save = new JButton("SAVE");
        frame.add(save);
        frame.add(get);


        get.addActionListener(e -> {
            for (Person allPerson : DBUtil.getAllPerson()) {
                System.out.println(allPerson);
            }
        });

        save.addActionListener( e -> {
            Person person = new Person(name.getText(),family.getText());
            try {
//                DBUtil.save(person);

                FileUtil.writeToFile(person.toString(), new File("src/main/resources/dummy.txt"));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame,"File is not Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });


        com.peyman.data.Person person = new com.peyman.data.Person("ali","alavi");
        FileUtil.writeToBinFile(person , new File("src/main/resources/data.ser"));
        com.peyman.data.Person p = (com.peyman.data.Person) FileUtil.readFromBinFile(new File("src/main/resources/data.ser"));
        System.out.println(p);

    }

}
