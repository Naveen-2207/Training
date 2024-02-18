package JDBCApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DbOperations {
	private static final String host = "jdbc:mysql://localhost:3306/studentdb";
	private static final String userName = "root";
	private static final String password = "Thani@Mages2001";

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection(host, userName, password);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void toAddStudent(Students studentData) {
		try {
			Connection con = getConnection();
			String query = "Insert into student (studName, studDepartment, studGrade, studMobileNumber) "
					+ "values(?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);

			stmt.setString(1, studentData.studName);
			stmt.setString(2, studentData.studDepartment);
			stmt.setString(3, Character.toString(studentData.studGrade));
			stmt.setLong(4, studentData.studMobileNumber);
			stmt.executeUpdate();

			stmt.close();
			con.close();
			System.out.println("Student creation successful!!!\n");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static HashMap<Integer, Students> toGetAllStudentData() {
		try {
			Connection con = getConnection();
			String query = "Select * from student";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet result = stmt.executeQuery();
			HashMap<Integer, Students> studentDatabase = new HashMap<>();
			while (result.next()) {
				Students obj = new Students();
				obj.studId = result.getInt(1);
				obj.studName = result.getString(2);
				obj.studDepartment = result.getString(3);
				obj.studGrade = result.getString(4).charAt(0);
				obj.studMobileNumber = result.getLong(5);
				studentDatabase.put(obj.studId, obj);
			}
			con.close();
			return studentDatabase;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean studentExists(int id) {
		try {
			Connection con = getConnection();
			String query = "Select * from student where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();
			boolean flag = result.next();
			con.close();
			return flag;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void toRemoveStudent(int id) {
		try {
			Connection con = getConnection();
			String query = "Delete from student where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("Student with id " + id + " is removed successfully!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Students toSearchStudent(int id) {
		try {
			Connection con = getConnection();
			String query = "Select * from student where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();
			Students studentData = new Students();
			result.next();
			studentData.studId = result.getInt(1);
			studentData.studName = result.getString(2);
			studentData.studDepartment = result.getString(3);
			studentData.studGrade = result.getString(4).charAt(0);
			studentData.studMobileNumber = result.getLong(5);
			stmt.close();
			con.close();
			return studentData;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void toUpdateName(int id, String name) {
		try {
			Connection con = getConnection();
			String query = "Update student set studName = ? where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, name);
			stmt.setInt(2, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("Student name is updated successfully!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void toUpdateDepartment(int id, String department) {
		try {
			Connection con = getConnection();
			String query = "Update student set studDepartment = ? where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, department);
			stmt.setInt(2, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("Student department is updated successfully!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void toUpdateGrade(int id, char grade) {
		try {
			Connection con = getConnection();
			String query = "Update student set studGrade = ? where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, Character.toString(grade));
			stmt.setInt(2, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("Student grade is updated successfully!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void toUpdateMobileNumber(int id, long mobileNumber) {
		try {
			Connection con = getConnection();
			String query = "Update student set studMobileNumber = ? where studId = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setLong(1, mobileNumber);
			stmt.setInt(2, id);
			stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("Student mobile number is updated successfully!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
