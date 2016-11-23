import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class HelpingHand {

	public static void main(String[] argv) throws ClassNotFoundException, SQLException
	{
		
		//Datenbankverbindung
		DBConnection dbc = new DBConnection();
		Connection con = dbc.getDatabaseConnection();
		 if(con == null)
		 {
			 System.out.println("Wrong user or password!");
			 dbc.getDatabaseConnection();
		 }
		 else
		 {
			//Tabellen und W�rter einlesen
				Logic lgc = new Logic();
				ArrayList<String> tableNames = Logic.getTableNames();
				ArrayList<String> words = Logic.getWords();
				
				//SQL Statements ausf�hren
				DBQueries dbq = new DBQueries();
				dbq.createDatabaseAndTables(tableNames, words, con);
		 }
	
		
		
		
	}
}
