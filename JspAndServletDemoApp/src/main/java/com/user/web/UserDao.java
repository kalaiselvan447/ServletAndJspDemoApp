package com.user.web;
import java.sql.*;

import com.user.web.model.UserInfo;

public class UserDao {
	
	public UserInfo getUserInfo(int userId) throws SQLException {
		
		UserInfo user = new UserInfo();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shc_main","root","hms");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from t_m_admin_user_section where user_section_id = "+userId+"");
			
			if(rs.next()) {
				user.setUserId(rs.getInt("user_section_id"));
				user.setUserName(rs.getString("user_name"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email_id"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return user;
	}
}
