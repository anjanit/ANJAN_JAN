package com.mysql.example;
import java.sql.*;

 class MysqlConnection {
  
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/hive","root","orcl");  
	//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from hive");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	}

