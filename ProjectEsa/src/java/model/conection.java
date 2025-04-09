
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author yassimin
 */
public class conection {
    private final String ClassDRIVER="com.mysql.cj.jdbc.Driver";
    private final String Url="jdbc:mysql://localhost/mvc_esa";
    private final String user="root";
    private final String password="";
    
     Connection com=null;
    public Connection getConnection(){
       
        try{
            
            Class.forName(ClassDRIVER); // carrega o drive
         com= DriverManager.getConnection(Url,user,password);
            
            
        }catch( ClassNotFoundException | SQLException e){
            System.out.println(e.getCause());
              System.out.println(e.getMessage());
        }
        return com;
    }
    
    public void disconnetConnecttion(){
        try {
            com.close();
        } catch (SQLException e) {
          System.out.println(e.getCause());
              System.out.println(e.getMessage());
        }
    }
}
