package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class Query {


    public static Connection getConnection() throws Exception {
        try {
            //String driver="com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/evaluator";
            String userName = "root";
            String password = "";
            //Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, userName, password);
            System.out.println("connected");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static List<String> getInfo(Integer id) throws Exception {

        Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement("SELECT interst FROM myuser where" +
                "id=" + id + "");
        ResultSet result = stmt.executeQuery();

        stmt = con.prepareStatement("SELECT * FROM quizzes where " +
                "interst=" + result.getString("interst") + "");
        ResultSet result2 = stmt.executeQuery();
        List<String> list = new ArrayList<>();
        while (result.next()) {
            list.add(result2.getString("name"));
        }

        return list;

    }

}
