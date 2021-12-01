
public class primefactor {

		static long MaxPrime(long num) {
		    long CurrMaxPrime = -1;

		    //If num is divisible by 2, store CurrMaxPrime
		    //as 2. keep on dividing num until it is not 
		    //divisible by 2. After each division, update 
		    //num as num/2.
		    if(num % 2 == 0) {
		      CurrMaxPrime = 2;
		      while(num % 2 == 0){
		        num = num/2;
		      }
		    }
		    
		    //At this point, num must be odd. Starting with 
		    //3 to square root of num , if divisible, divide 
		    //and update num, and update CurrMaxPrime
		    for(long i = 3; i <= Math.sqrt(num); i += 2) {
		      while(num % i == 0) {
		        CurrMaxPrime = i;
		        num = num/i;
		      }
		    }

		    //if the modified num is greater than 2, 
		    //update the CurrMaxPrime with num 
		    if (num > 2) 
		      CurrMaxPrime = num;

		    return CurrMaxPrime;
		  }

		  public static void main(String[] args) {
		    long x;
		    x = 600851475143L;

		    System.out.println("Largest prime factor of "+ x
		                       + " is: "+ MaxPrime(x));
		  }


}
