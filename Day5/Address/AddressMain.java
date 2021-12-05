import java.util.InputMismatchException;
import java.util.Scanner;

public class AddressMain {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Customer3[] customersObj =new Customer3[100];
		Customer3[] duplicateCustomers = new Customer3[100];
		Customer3 customer1 = null;
		Address1 address = null;
		int customersObjCount = 0,duplicateCustomersCount = 0,i=0,j;
		try  {
			System.out.println("Enter the number of customers");
			customersObjCount = s.nextInt();
			
			while (i < customersObjCount) {
				customer1 = new Customer3();
				address = new Address1();
				System.out.printf("Enter the Customer Details %d \n", i + 1);
				System.out.println("Enter the name");
				customer1.setName(s.next());
				System.out.println("Enter the street");
				address.setStreet(s.next());
				System.out.println("Enter the city");
				address.setCity(s.next());
				System.out.println("Enter the pincode");
				address.setPincode(s.nextInt());
				customer1.setAddress(address);
				customersObj[i] = customer1;
				i++;
			}
			for (i = 0; i < customersObjCount; i++) {
				for ( j = i + 1; j < customersObjCount; j++) {
					if (customersObj[i].equals(customersObj[j])) {
						duplicateCustomers[duplicateCustomersCount++] = customersObj[i];
					}
				}
			}
			if (duplicateCustomers[0] == null) {
				System.out.println("No duplicate details");
			} else {
				System.out.println("The identical Customers Details:");
				for (i = 0; i < duplicateCustomersCount; i++) {
					System.out.println((i + 1) + ")" + duplicateCustomers[i]);
				}
			}
		} catch (InputMismatchException exception) {
			System.err.println("Given input is not valid!!! Please give valid input");
		}
	}

}
