import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB {
	Connection con;
	Statement stmt;
	public DB(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost","root","1234");		
			stmt = con.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
