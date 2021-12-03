import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ItemType obj = new ItemType();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item type name");
		String name = sc.next();
		System.out.println("Enter the cost per day");
		double costPerDay = sc.nextDouble();
		System.out.println("Enter the deposit");
		double deposit = sc.nextDouble();
		obj.setName(name);
		obj.setCostPerDay(costPerDay);
		obj.setDeposit(deposit);
		obj.display();
		sc.close();
	}

}
