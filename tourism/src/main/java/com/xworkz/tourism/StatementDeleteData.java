package com.xworkz.tourism;

import java.sql.*;

public class StatementDeleteData {

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


        String deleteDataQuery="DELETE from waterfall where id=3 ";

        Connection connection1=null;
        Statement statement1=null;

        try {
            Connection connection= DriverManager.getConnection(jdbcurl,userName,password);
            System.out.println("create statement");
            Statement statement= connection.createStatement();
            System.out.println("execute the sql query");

//            int result= statement.executeUpdate(deleteDataQuery);
//            System.out.println(result);

            boolean result=statement.execute(deleteDataQuery);
            System.out.println(result);


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
