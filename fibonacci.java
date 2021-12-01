
public class fibonacci {

	public static void main(String[] args) {
		int n1=1,n2=2,sum=0,e=0;
		for(int i=0;i<32;i++){
			sum=n1+n2;
			n1=n2;
			n2=sum;
			if(sum%2==0) {
				System.out.println(sum);
				e=e+sum;			
		}
		}
		System.out.println(e +" ");

	}

}
