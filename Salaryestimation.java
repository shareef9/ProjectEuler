import java.util.Scanner;

public class Salaryestimation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total salary paid");
		int a=sc.nextInt();
		for(int i=10;i<=a;i++) {
			int x=80*i+50*(i-10);
			if(a-x>=0 && a-x<130) {
				System.out.println("number of weekdays hours"+ i);
			System.out.println( "number of weekends hours" + (i-10));
		}
	}}

}
