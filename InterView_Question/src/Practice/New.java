package Practice;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Avinash";
		char ch[] = s.toCharArray();
        int count =0;   
		
		for(Character c : ch) {
			
			count++;
		}
		
		String rev ="";
		for(int i =count-1;i>=0;i--) {
			rev =rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
