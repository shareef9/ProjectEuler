import java.util.Scanner;

public class Runrate {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of overs");
			int overs = sc.nextInt();
			System.out.println("Enter targeted runs");
			int target = sc.nextInt();
			System.out.println("Enter overs bowled ");
			int currentOvers = sc.nextInt();
			System.out.println("Enter runs scored ");
			int score = sc.nextInt(),remainingRuns;
			float currentrunrate,remainingOvers,requiredrunrate;
			
			remainingOvers = overs-currentOvers;
			remainingRuns  = target-score;
			
			requiredrunrate = remainingRuns/remainingOvers;
			
			currentrunrate= score/currentOvers;
			
			System.out.println("Currentrunrate"+currentrunrate);
			
			System.out.println("RequiredRunrate"+requiredrunrate);
			
			
		}

}
