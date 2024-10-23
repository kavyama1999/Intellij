package com.xworkz.preparedStatement;

import java.sql.*;

public class PreparedStatementDeleteData {

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


        String deleteDataQuery="DELETE from waterfall where id=? ";

        Connection connection1=null;
        PreparedStatement PreparedStatement1=null;

        try {
            Connection connection= DriverManager.getConnection(jdbcurl,userName,password);
            System.out.println("create statement");
            PreparedStatement preparedStatement= connection.prepareStatement(deleteDataQuery);
            System.out.println("execute the sql query");

            preparedStatement.setInt(1,1);
            boolean result=preparedStatement.execute(deleteDataQuery);
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
                if(PreparedStatement1!=null)
                    PreparedStatement1.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
