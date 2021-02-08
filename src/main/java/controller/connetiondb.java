package controller;
import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.SQLException;

public class connetiondb {

    Connection con;
    PreparedStatement st;
    ResultSet rs;
    public connetiondb(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException e){
    System.err.println(e);
    }
    try{
    con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/catalog","root","");
    System.out.println("connected");
    }catch(SQLException e){
        System.err.println("error"+e);
    }
    }
    public Connection obtenirconnexion(){return con;}
   /* public void getdata(){
        try {
        	
        	
            String querry ="INSERT INTO `user` (`user_id`, `username`, `password`, `name`) VALUES (NULL, 'toto', 'too', 'to') ";
            st=con.prepareStatement(querry);
            st.executeUpdate();
            System.out.println("from database");
           /* while(rs.next()){
                String firstname = rs.getString("username");
                String lastname = rs.getString("name");
                System.out.println("name"+firstname+"lastname"+lastname);
            }
        }
    catch(Exception e){
    System.out.println("erro"+e);
    e.printStackTrace();
    }    
    }*/
    /*
    
    public static void main(String[] args){
        
        connetiondb connection=new connetiondb();
        connection.getdata();
    }*/


}
