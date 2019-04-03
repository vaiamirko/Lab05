package it.polito.tdp.anagrammi.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.anagrammi.model.Parola;


public class AnagrammaDAO {
	
	
	public boolean isCorrect(String Anagramma){
		
		final String sql = "SELECT id,nome " + 
				"FROM parola AS p " + 
				"WHERE p.nome=? ";

		
		boolean check=false;
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, Anagramma);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				
				check=true;
			}
			conn.close();
			return check;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}
		
		
		
		
	

}
