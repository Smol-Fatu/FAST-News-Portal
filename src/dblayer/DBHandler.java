package dblayer;

import java.sql.*;

public class DBHandler {
	private String usrname = "root";
	private String pass = "fatima2001";
	static Connection con; // connection object

	public DBHandler() {
		// connect to DB
		try {
			// university is the database name
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newsportaldb", usrname, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static int stdid=4;
	public void saveStudent(String email,String pass) {
		try {
			String query="INSERT INTO student (idstudent, studentpass, studentemail) VALUES (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, stdid);
			stmt.setString(2,pass);
			stmt.setString(3, email);
			
			int rows=stmt.executeUpdate();
			if (rows>0) {
				System.out.println("A student was added...");
			}
			stdid++;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void saveNews(String title,String desc,Date date) {
		try {
			String query="INSERT INTO news (newstitle, newsdesc, newsdate) VALUES (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, title);
			stmt.setString(2,desc);
			stmt.setDate(3, date);
			
			int rows=stmt.executeUpdate();
			if (rows>0) {
				System.out.println("A news was added...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public int searchStudent(String email, String pass) {
		try {
			String query="SELECT * FROM student WHERE studentpass=? AND studentemail=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(2,email);
			stmt.setString(1, pass);
			
			ResultSet rows=stmt.executeQuery();
			if (rows.next()) {
				System.out.println("A student was found...");
				return 1;
			}
			return 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public void deleteStudent(int id) {
		String query="DELETE FROM student WHERE idstudent=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);

			int rows=ps.executeUpdate();
			if (rows>0) {
				System.out.println("A student was deleted...");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public void saveAdmin(String email,String pass) {
		try {
			String query="INSERT INTO admin (adminemail, adminpass) VALUES (?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,email);
			stmt.setString(2, pass);
			
			int rows=stmt.executeUpdate();
			if (rows>0) {
				System.out.println("A admin was added...");
			}
			stdid++;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public int searchAdmin(String email, String pass) {
		try {
			String query="SELECT * FROM admin WHERE adminemail=? AND adminpass=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,email);
			stmt.setString(2, pass);
			
			ResultSet rows=stmt.executeQuery();
			if (rows.next()) {
				System.out.println("A admin was found...");
				return 1;
			}
			return 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public void closeConnection() {
		try {

			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}