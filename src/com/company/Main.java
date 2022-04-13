package com.company;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.KMC.jdbc.Statement;

public class Main {

    public static void main(String[] args)
    {
        String url = "jdbc:mysq://localhost:3307/KMC";
        String uname = "root";
        String pass = "";
        String qyery = "select ";

    }
    Class.forname("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(url, uname, pass);
    Statement st= con.createStatement();
    ResultSet rs = st.executeQuery(query);

String name =rs.getString("username");
System.out.println();

    }

//            {
//                String url="jdbc:C://oraclexe://localhost:8080?user=system&password=system";
//                String query="insert into kmc.kmc values(21,'sidh',80,'jdbc','kmc')";
//                try
//                {
//                    Connection connection=DriverManager.getConnection(url);
//                    System.out.println("step1");
//                    java.sql.Statement statement=connection.createStatement();
//                    System.out.println("step2");
//                    statement.executeUpdate(query);
//                    System.out.println("step3");
//                    connection.close();
//                    System.out.println("step5");
//                }
//                catch (SQLException e)
//                {
//                    e.printStackTrace();
//
//
//
//    }
//}}}
