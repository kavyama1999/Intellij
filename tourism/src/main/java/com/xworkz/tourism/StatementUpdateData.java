package com.xworkz.tourism;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementUpdateData {
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


        String updateQuey="UPDATE waterfall set name='gaganachukki' where id=5";

        Connection connection1=null;
        Statement statement1=null;

        try {
            Connection connection= DriverManager.getConnection(jdbcurl,userName,password);
            System.out.println("create statement");
            Statement statement= connection.createStatement();
            System.out.println("execute the sql query");

            int result4=statement.executeUpdate(updateQuey);
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
