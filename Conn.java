
package travel.and.tourism.management.system;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/tnt","root","Shruti@1611"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  

    
    
    public static void main(String[] args){
        Conn c = new Conn();
    }
}

