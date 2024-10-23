package com.xworkz.tourism;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementInsertData {


    public static void main(String[] args) {

        System.out.println("load and register driver");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("get connection from database");

        String jdbcurl="jdbc:mysql://localhost:3306/tourism";
        String userName="root";
        String password="Xworkzodc@123";


       // String insertDataQuery="INSERT INTO WATERFALL(id,name,river_name,place,state,pincode)VALUES(1,'jog falls','Sharavati','sagara','karnataka',577201)";
       // String insertDataQuery1="INSERT INTO WATERFALL(id,name,river_name,place,state,pincode)VALUES(2,'magod falls','bedti','yellapura','karnataka',577202),(3,'Apsarakonda falls','sharavati','honnavara','karnataka',577203)";
       //  String insertDataQuery2="INSERT INTO WATERFALL(id,name,river_name,place,state,pincode)VALUES(4,'abbey falls','Sharavati','madikeri','karnataka',577204)";
        String insertDataQuery3="INSERT INTO WATERFALL(id,name,river_name,place,state,pincode)VALUES(5,'unchalli falls','aghanashini','sirsi','karnataka',577205)";

        Connection connection1=null;
        Statement statement1=null;

        try {
       Connection connection= DriverManager.getConnection(jdbcurl,userName,password);
            System.out.println("create statement");
      Statement statement= connection.createStatement();
            System.out.println("execute the sql query");
//         boolean result=   statement.execute(insertDataQuery);
//            System.out.println(result);
//            int result1=   statement.executeUpdate(insertDataQuery1);
//            System.out.println(result1);

//            boolean result3=statement.execute(insertDataQuery2);
//            System.out.println(result3);

            int result4=statement.executeUpdate(insertDataQuery3);
           System.out.println(result4);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        finally {
            try {
                System.out.println("connection are closed");
                if(connection1!=null)
                connection1.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                System.out.println("statement closed");
                if(statement1!=null)
                statement1.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }












    }
}
