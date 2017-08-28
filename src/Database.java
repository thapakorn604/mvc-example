
import java.sql.*;

public class Database {

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/student";
	private String user = "root";
	private String pass = "";
	private Connection con = null;

	public Database() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Database Connected!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isInsert(Student s) {
		int auto = 0;
		boolean result = false;
		String sql = "INSERT INTO account VALUES(?,?,?,?);";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, auto);
			;
			pstmt.setString(2, s.getName());
			pstmt.setString(3, s.getLastname());
			pstmt.setString(4, s.getEmail());

			int record = pstmt.executeUpdate();
			if (record > 0) {
				result = true;
			} else {
				result = false;
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return result;
	}

}
