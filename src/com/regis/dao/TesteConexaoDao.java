package com.regis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;

import com.regis.dao.ConnectionFactory;

public class TesteConexaoDao {

	private Connection connection;

	Connection getConnection() throws Exception{
		try{
			if(connection == null || connection.isClosed()){
				connection = new ConnectionFactory().getConnection();
			}
		}catch(SQLRecoverableException e){
			System.out.println("Erro na conexão: " + e);
		}
		return connection;
	}

	public void testeConexao() throws Exception {
		String sql = "SELECT * FROM INTECTRL";
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<String> ids = new ArrayList<>();
		while (rs.next()) {
			ids.add(rs.getString("TIPO"));
		}
		ids.forEach(System.out::println);
	}

}