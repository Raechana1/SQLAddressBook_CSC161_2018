/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc5;

/**
 *
 * @author rahon
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class DBUtil {
	private static final String user = "root";
	private static final String psswd = "root";
	private static final String pcDatabase = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
	
	public static Connection getConnection(DBType dbType) throws SQLException{
            return DriverManager.getConnection(pcDatabase, user, psswd);

	}
	public static void showErrorMessage(SQLException e) {
		System.err.println("Error: " + e.getMessage());
		System.err.println("Error Code: " + e.getErrorCode());
	}
}

