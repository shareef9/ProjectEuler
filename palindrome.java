
public class palindrome {

	public static void main(String[] args) {
		int p1 = 0;
        for(int i = 100;i <=999;i++)
        {
            for(int j = i;j <=999;j++)
            {
                int p2 = i * j;
                StringBuilder sb1 = new StringBuilder(""+p2);
                String sb2 = ""+p2;
                sb1.reverse();
                if(sb2.equals(sb1.toString()) && p1<p2) {
                    p1 = p2;

                }

            }
        }

        System.out.println(p1);

	}

}
