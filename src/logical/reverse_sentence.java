package logical;

public class reverse_sentence {

	public static void main(String[] args) {
		String a="this is mango tree";
		String b="";
		
		String [] c=a.split(" ");
		
		int d=c.length;
		
		for(int g=d-1;g>=0;g--) {
			b=b+c[g]+" ";
			
		}
		System.out.println(b);
	}

}
