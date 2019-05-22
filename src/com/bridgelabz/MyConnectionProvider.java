/**
 * 
 */
package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Kalyani Deobhankar
 *
 */
public class MyConnectionProvider {
    static String userName = "root";
    static String password = "root";
    static String ConnectionUrl = "jdbc:mysql://localhost:3306/FirstWebapp";
    public static Connection con = null;

    public static Connection getCon() {
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("for name called");
	    System.out.println("userName :" + userName + " password :" + password);
	    con = DriverManager.getConnection(ConnectionUrl, userName, password);
	    System.out.println("server connected");

	} catch (Exception e) {
	    System.out.println(e);
	}
	return con;

    }
}
