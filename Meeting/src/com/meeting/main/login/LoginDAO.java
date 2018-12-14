package com.meeting.main.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.meeting.util.DBUtil;

import java.sql.Connection;

public class LoginDAO {
	
	private Connection conn;
	private PreparedStatement stat;
	private ResultSet rs;
	
	public LoginDAO() {
		this.conn = DBUtil.getConnection();
	}

	public LoginDTO login(LoginDTO dto) {

		LoginDTO user = new LoginDTO();
		
		try {

			String sql = "select * from vwselectcustomer where id=? and pw=?";
			stat = conn.prepareStatement(sql);
			stat.setString(1, dto.getId());
			stat.setString(2, dto.getPw());
			
			rs = stat.executeQuery();
			
			if(rs.next()) {
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setGrade(rs.getString("grade"));
				return user;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	

}
