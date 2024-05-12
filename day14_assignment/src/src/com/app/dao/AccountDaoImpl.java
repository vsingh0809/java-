package com.app.dao;

import java.sql.*;
import static com.app.utils.DBUtils.*;

public  class AccountDaoImpl implements Accountdao {
private Connection cn;
private CallableStatement cst1;

	


	public  AccountDaoImpl() throws SQLException {
		cn=openConnection()	;
	cst1=cn.prepareCall("{call transfer_fund_proc(?,?,?,?,?)}");
	cst1.registerOutParameter(4,Types.DOUBLE );
	cst1.registerOutParameter(5, Types.DOUBLE);
		
	}




	@Override
	public String toString() {
		return "AccountDaoImpl [cn=" + cn + ", cst1=" + cst1 + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
