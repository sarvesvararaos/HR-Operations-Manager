import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=null;
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM","Sarvesh@299");
		if(conn!=null)
			System.out.print("Connected");
		else
			System.out.println("Not Connected");
		conn.close();

	}

}
