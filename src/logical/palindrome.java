package logical;

public class palindrome {

	public static void main(String[] args) {

		int a=141, b=a, rem, rev=0;
		
		while(b!=0) {
			
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
		}
			if(rev==a) {
			System.out.println("is pali");
	
		}
			else {
				System.out.println("not pali");
			}
		}
		
	

}
