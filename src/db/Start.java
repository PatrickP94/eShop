package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Start {

	public static void main(String[] args) throws SQLException {
		

		DBVerbindung db1 = new DBVerbindung();
		
		db1.oeffneDB();
		db1.lesen("Select * From bücher_gelesen");
		
		
		
		
	}

}
