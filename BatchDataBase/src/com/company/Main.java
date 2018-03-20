package com.company;

import java.sql.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int id;
        int room;
        Main main=new Main();
        System.out.println("Enter you name here");
        Scanner scanner=new Scanner(System.in);
        name=scanner.nextLine();
        System.out.println("Enter your id here!");
        id=scanner.nextInt();
        System.out.println("Enter you room here");
        room=scanner.nextInt();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest","root","");
//            Statement stt=connection.createStatement();
//            //stt.addBatch("INSERT into students VALUES ('Khem','117','5')");
//            stt.addBatch("UPDATE students SET id='110' WHERE name = 'Khem'");
//            stt.executeBatch();

//            LinkedList<String>queryList=new LinkedList<String>();
//            queryList.add("INSERT into students values ('Vignesh','117','5')");
//            queryList.add("INSERT into students values ('Longha','118','3')");
//
//            stt.addBatch(queryList.get(0));
//            stt.addBatch(queryList.get(1));
//
//            stt.executeBatch();



            PreparedStatement ps=connection.prepareStatement("INSERT INTO students VALUES (?,?,?)");
            ps.setString(1,name);
            ps.setInt(2,id);
            ps.setInt(3,room);

            ps.addBatch();
            ps.executeBatch();
//            ps.setString(1,"Sak");
//            ps.setInt(2,130);
//            ps.setInt(3,3);
//
//            ps.addBatch();
//
//            ps.setString(1,"Shotay");
//            ps.setInt(2,131);
//            ps.setInt(3,2);
//
//            ps.addBatch();
//
//            ps.executeBatch();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
