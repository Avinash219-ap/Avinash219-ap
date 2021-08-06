package Practice2;

public class Reverse_String_Without_Using_Long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Avinash";
		char ch[] = s.toCharArray();
		int count =0;
		String rev ="";
		
		for(Character c: ch) {
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			
			rev =rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
