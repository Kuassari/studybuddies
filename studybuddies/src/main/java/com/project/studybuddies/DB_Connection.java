package com.project.studybuddies;

import java.sql.*;

public class DB_Connection {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private static Connection dbConnection = null;

    public static Connection readDataBase() throws Exception {
        try {
            // register the JDBC Driver
            System.out.println("before forName");
            Class.forName("com.mysql.jdbc.Driver");
            // Class.forName("/Users/koralcohen/Downloads/UNIVERSITY/Java Final Project/Study Buddies Project/mySQL");
            System.out.println("after forName");

            // setup the connection with the DB
            //connect = DriverManager.getConnection("jdbc:mysql://localhost/feedback?" + "user=sqluser&password=sqluserpw");
            System.out.println("after get connection");
            // statements allow to issue SQL queries to the database
            //statement = connect.createStatement();
            System.out.println("after create statement");
            String sql = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            //statement.executeUpdate(sql);

            System.out.println("Created table in given database...");
            // get the result of the SQL query
            // resultSet = statement.executeQuery("select * from feedback.comments");


        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.toString());
            //System.out.println("Error: unable to load driver class!");
        } finally {
            //close();
        }
        return dbConnection;
    }
}
    // example I found, maybe it can be help us
//    public static Connection getConnection() {
//        if (dbConnection != null) {
//            return dbConnection;
//        } else {
//            try {
//                InputStream inputStream = DbUtil.class.getClassLoader()
//                        .getResourceAsStream("db.properties");
//                Properties properties = new Properties();
//                if (properties != null) {
//                    properties.load(inputStream);
//
//                    String dbDriver = properties.getProperty("dbDriver");
//                    String connectionUrl = properties
//                            .getProperty("connectionUrl");
//                    String userName = properties.getProperty("userName");
//                    String password = properties.getProperty("password");
//
//                    Class.forName(dbDriver).newInstance();
//                    dbConnection = DriverManager.getConnection(connectionUrl,
//                            userName, password);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return dbConnection;
//        }

