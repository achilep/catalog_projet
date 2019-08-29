package controller;

import java.sql.PreparedStatement;import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.sql.ResultSet;
import java.sql.Statement;

public class usercontroller {
	PreparedStatement st;
    ResultSet rs;
    connetiondb con = new connetiondb();
    int result;
    // create une session variable pour l objet user appress le login user user;
    public usercontroller() {
    	
    } 
    public void update(String id,String user_name,String user_username,String password) {
    	try {
    		String querry ="UPDATE `product` SET `name` = '"+user_name+"' WHERE `user`.`user_id` ="+id ;
    		
            st=con.obtenirconnexion().prepareStatement(querry);
            st.executeUpdate();
            System.out.println(" user update");
    	}
    	catch(Exception e){
    	System.out.println("erro"+e);
    	e.printStackTrace();
    	}
        
    }
    
    Map<String, String> DB = new HashMap<String, String>();
	public static final String SALT = "my-salt-text";

	/*public static void main(String args[]) {
		PasswordHashingDemo demo = new PasswordHashingDemo();
		demo.signup("john", "dummy123");

		// login should succeed.
		if (demo.login("john", "dummy123"))
			System.out.println("user login successfull.");

		// login should fail because of wrong password.
		if (demo.login("john", "blahblah"))
			System.out.println("User login successfull.");
		else
			System.out.println("user login failed.");
	}*/

	public void signup(String username, String password) {
		String saltedPassword = SALT + password;
		String hashedPassword = generateHash(saltedPassword);
		DB.put(username, hashedPassword);
	}

	public Boolean login(String username, String password) {
		Boolean isAuthenticated = false;

		// remember to use the same SALT value use used while storing password
		// for the first time.
		String saltedPassword = SALT + password;
		String hashedPassword = generateHash(saltedPassword);

		String storedPasswordHash = DB.get(username);
		if(hashedPassword.equals(storedPasswordHash)){
			isAuthenticated = true;
		}else{
			isAuthenticated = false;
		}
		return isAuthenticated;
	}

	public  String generateHash(String input) {
		StringBuilder hash = new StringBuilder();

		try {
			MessageDigest sha = MessageDigest.getInstance("SHA-1");
			byte[] hashedBytes = sha.digest(input.getBytes());
			char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
					'a', 'b', 'c', 'd', 'e', 'f' };
			for (int idx = 0; idx < hashedBytes.length; ++idx) {
				byte b = hashedBytes[idx];
				hash.append(digits[(b & 0xf0) >> 4]);
				hash.append(digits[b & 0x0f]);
			}
		} catch (NoSuchAlgorithmException e) {
			// handle error here.
		}

		return hash.toString();
	}

    
    public void registraion(String name,String username,String password) {
    	try {
        	
        	String hashpassword = generateHash(password);
           String querry ="INSERT INTO `user` (`user_id`, `username`, `password`, `name`) VALUES (NULL, '"+username+"', '"+hashpassword+"', '"+name+"') ";
            st=con.obtenirconnexion().prepareStatement(querry);
            st.executeUpdate();
            System.out.println("user added");
    	}
    	catch(Exception e){
    	System.out.println("erro"+e);
    	e.printStackTrace();
    	}
        
    	
    }
    public int userauthentification(String username,String password) {
    	int user_id=0;
    	String passwordhash=generateHash(password);
    	try{
    		ResultSet rst;
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select user_id from user where username='"+username+"' AND password='"+passwordhash+"'";
			 rst = statement.executeQuery(sql);
			 while(rst.next()) {
					    user_id=rst.getInt(1) ;
			 }
					    if(user_id == 0)
							result=0;
						    	else 
						    		result= user_id;
				//con.close();
					    System.out.println(user_id);
					} catch (Exception e) {
					e.printStackTrace();
					
					}
    	 System.out.println(result);
    	return result;
    	
    	
    }
				
    	
    

}
