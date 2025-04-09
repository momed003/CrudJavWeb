
package test;

import model.conection;
import java.sql.Connection;

/**
 *
 * @author yassimin
 */
public class Test {
    public static void main(String[] args) {
        try {
            conection connection= new conection();
             Connection com= null;
             
        
            com=connection.getConnection();
            System.out.println("is closed: "+com.isClosed());
            
            connection.disconnetConnecttion();
            System.out.println("is closed: "+com.isClosed());
            
        }catch(Exception e){
            System.out.println("Connection closed with erro");
        } 
        
        
        
    }
}
