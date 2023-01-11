package logical;

public class reverse_string {

	public static void main(String[] args) {
		String a="morning";
		String v="";
		
		int b=a.length();
		for(int c=b-1;c>=0;c--) {
			v=v+a.charAt(c);
		}
		System.out.println(v);
	}

}
