package logical;

public class largest_no {

	public static void main(String[] args) {
		int a=29;
		int b=59;
		int c=89;
		
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
			
		}

	}

}
