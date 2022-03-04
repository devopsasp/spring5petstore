package petstoreproject.petstoreapp;

public class Customer {
	
	private String customerName;
	private String address;
	private String email;
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, String address, String email) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.email = email;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
