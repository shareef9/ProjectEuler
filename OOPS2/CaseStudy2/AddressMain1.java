package OOPS2.CaseStudy2;

import java.util.Scanner;

public class AddressMain1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Address1 address=new Address1();
		System.out.println("ENter the AddressLine1");
		address.setAddressLine1(s.nextLine());
		System.out.println("Enter the AddressLine2");
		address.setAddressLine2(s.nextLine());
		System.out.println("Enter the City");
		address.setCity(s.nextLine());
		System.out.println("Enter the State");
		address.setState(s.nextLine());
		System.out.println("Enter the Pincode");
		address.setPincode(s.nextInt());
		
		System.out.println("The Address Details are" +address);
		
	}
}
