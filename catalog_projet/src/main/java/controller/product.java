package controller;

public class product {

	private String product_id;
	private String product_name;
	private String product_description;
	private String category_id;

	/**
	 * @param prroduct_id
	 * @param product_name
	 * @param product_description
	 * @param category_id
	 */
	public product() {
		
	}
	public product(String prroduct_id, String product_name, String product_description, String category_id) {
		super();
		this.product_id = prroduct_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.category_id = category_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String prroduct_id) {
		this.product_id = prroduct_id;
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
