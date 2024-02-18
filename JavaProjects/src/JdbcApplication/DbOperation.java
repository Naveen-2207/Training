package JdbcApplication;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DbOperation {
	private static String host = "jdbc:mysql://localhost:3306/studentdb";
	private static String uName = "root";
	private static String uPass = "Therace@12345";

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(host, uName, uPass);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void toAddStudent(Student obj) {
		try {
			Connection con = getConnection();
			String query = "Insert into student(studName,studDept,studGrade,studMobileNumber) values(?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, obj.studName);
			stmt.setString(2, obj.studDept);
			stmt.setString(3, Character.toString(obj.studGrade));
			stmt.setLong(4, obj.studMobileNumber);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("Student Creation Sucessfully!!!\n");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static HashMap<Integer, Student> toGetAllStudentData() {
		try {
			Connection con = getConnection();
			String query = "Select * from student";
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			HashMap<Integer, Student> StudentDatabase = new HashMap<Integer, Student>();
			while (res.next()) {
				Student obj = new Student();
				obj.studid = res.getInt(1);
				obj.studName = res.getString(2);
				obj.studDept = res.getString(3);
				obj.studGrade = res.getString(4).charAt(0);
				obj.studMobileNumber = res.getLong(5);
				StudentDatabase.put(obj.studid, obj);
			}
			return StudentDatabase;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean studentExists(int id) {
		try {
			Connection con = getConnection();
			String query = "Select * from Student where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			ResultSet res = stmt.executeQuery();
			boolean nav = res.next();
			con.close();
			return nav;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void toRemoveStudent(int id) {

		try {
			Connection con = getConnection();
			String query = "Delete from Student where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("\nStudent with " + id + " is Removed Successfully!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Student toSearchStudent(int id) {
		try {
			Connection con = getConnection();
			String query = "Select * from Student where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			ResultSet res = stmt.executeQuery();
			res.next();
			Student sData = new Student();
			sData.studid = res.getInt(1);
			sData.studName = res.getString(2);
			sData.studDept = res.getString(3);
			sData.studGrade = res.getString(4).charAt(0);
			sData.studMobileNumber = res.getLong(5);
			stmt.close();
			con.close();
			return sData;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void toUpdateName(int id, String name) {
		try {
			Connection con = getConnection();
			String query = "Update Student set studName = ? where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, name);
			stmt.setInt(2, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("\nStudent Name is Ubdated sucessfully!!!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void toUpdateDept(int id, String dept) {
		try {
			Connection con = getConnection();
			String query = "Update Student set studDept = ? where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, dept);
			stmt.setInt(2, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("\nStudent Department is Ubdated sucessfully!!!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void toUpdateGrade(int id, char grade) {
		try {
			Connection con = getConnection();
			String query = "Update Student set studGrade = ? where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, Character.toString(grade));
			stmt.setInt(2, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("\nStudent Grade is Ubdated sucessfully!!!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void toUpdateMobileNumber(int id, Long num) {
		try {
			Connection con = getConnection();
			String query = "Update Student set studMobileNUmber = ? where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setLong(1, num);
			stmt.setInt(2, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("\nStudent Mobile Number is Ubdated sucessfully!!!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
