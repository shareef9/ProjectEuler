
public class primefactor {

		static long MaxPrime(long num) {
		    long CurrMaxPrime = -1;
		    if(num % 2 == 0) {
		      CurrMaxPrime = 2;
		      while(num % 2 == 0){
		        num = num/2;
		      }
		    }
		    for(long i = 3; i <= Math.sqrt(num); i += 2) {
		      while(num % i == 0) {
		        CurrMaxPrime = i;
		        num = num/i;
		      }
		    }
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
