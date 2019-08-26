package com.regis.inicio;

import com.regis.dao.TesteConexaoDao;

public class Inicio {

	public static void main(String[] args) throws Exception {
		
		TesteConexaoDao integracaoDao = new TesteConexaoDao();
		integracaoDao.testeConexao();

	}

}