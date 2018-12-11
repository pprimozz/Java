package com.jdbc.example;
import java.sql.*;

/**
1. import -->java.sql.*
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/baza";
        String uname="root";
        String pass="root";
        String query="Select * from names";
        
        String queryUp="insert into names values(11,'Sara')";
        
        //Class.forName("com.mysql.cj.jdbc.Driver"); //class forname telusko
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs =st.executeQuery(query);
        
      //  int count = st.executeUpdate(queryUp);
       // System.out.print(count + " rows/s affected");
        
        while(rs.next()) {
        	
        	//String name= rs.getString("name");
            
            System.out.println(rs.getString("id") +" " + rs.getString("name"));

        }
        
        st.close();
        con.close();
        
        
    }
}
//3306