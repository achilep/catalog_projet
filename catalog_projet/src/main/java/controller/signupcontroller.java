package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class signupcontroller {
	PreparedStatement st;
    ResultSet rs;
    connetiondb con = new connetiondb();
    public signupcontroller() {
    	
    } 
    public void registraion(String name,String username,String password) {
    	try {
        	
        	
           String querry ="INSERT INTO `user` (`user_id`, `username`, `password`, `name`) VALUES (NULL, '"+username+"', '"+password+"', '"+name+"') ";
            st=con.obtenirconnexion().prepareStatement(querry);
            st.executeUpdate();
            System.out.println("user added");
    	}
    	catch(Exception e){
    	System.out.println("erro"+e);
    	e.printStackTrace();
    	}
        
    	
    }
    

}
