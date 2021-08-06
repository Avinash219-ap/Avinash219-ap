package String_Program_For_Interview;

public class Reverse_The_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int count =0;
		String s="Avinash";
		String rev ="";
		char ch[] = s.toCharArray();
 		
		for(Character c : ch) {
			
			count++;
		}
			
			for(int i=count-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}


}