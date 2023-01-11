package logical;

public class prime_no {

	public static void main(String[] args) {
		int a=3;
		int b=0;
		
		for(int c=1;c<=a;c++) {
			if(a%c==0) {
				b++;
			}
		}
		if(b==2) {
			System.out.println("this is prime no");
		}
		else {
			System.out.println("not prime");
		}
		
		
	}

}
