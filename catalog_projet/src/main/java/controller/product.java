package controller;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class product {

	private String product_id;
	private String product_name;
	private String product_description;
	private String category_id;
	private String category_name;
	
	private String baseimg;
	
    

	/*public void getTb(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		 
		   
	        byte byteArray[];
			try {
				byteArray = image.getBytes(1, (int)image.length());
				response.setContentType("image/gif");
		        OutputStream os = response.getOutputStream();
		        os.write(byteArray);
		        os.flush();
		        os.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
	        
			   
		 
		 
	}*/
	 
	
		public product() {
		
	}
	public product(String product_id, String product_name, String product_description,String baseimg, String category_id) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.baseimg = baseimg;
		this.category_id = category_id;
		
		  
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_id) {
	String user_id=null;
		try{
			connetiondb con = new connetiondb();
    		ResultSet rst;
			Statement statement=con.obtenirconnexion().createStatement();
			String sql ="select category_name from category where category_id='"+category_id+"'";
			 rst = statement.executeQuery(sql);
			 while(rst.next()) {
					    user_id=rst.getString(1) ;
			 }
					    if(user_id == null)
					    	this.category_name="no category assigne";
						    	else 
						    		this.category_name= user_id;
				//con.close();
					    System.out.println(user_id);
					} catch (Exception e) {
					e.printStackTrace();
					
					}
    	 
    
		this.category_name = category_name;
	}
	 

		public String getBaseimg() {
		return baseimg;
	}


	public void setBaseimg(String baseimg) {
		this.baseimg = baseimg;
	}


	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

}