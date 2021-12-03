
public class Customer {
	public String customerName,customerEmail,customerType,customerAddress;
	
	public Customer() {
		
	}

public Customer(String customerName, String customerEmail, String customerType, String customerAddress) {
		
		this.customerName=customerName;
		this.customerEmail=customerEmail;
		this.customerType=customerType;
		this.customerAddress=customerAddress;
	}
	public void displayDetails() {
		System.out.println("Customer Details");
		System.out.println("customerName" +customerName);
		System.out.println("customerEmail" +customerEmail);
		System.out.println("customerType" +customerType);
		System.out.println("customerAddress" +customerAddress);
	}

}
