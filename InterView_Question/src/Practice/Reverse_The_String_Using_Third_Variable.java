package Practice;

public class Reverse_The_String_Using_Third_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="Avinash";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev =rev+s.charAt(i);
		}
        System.out.println(rev);
	}

}
