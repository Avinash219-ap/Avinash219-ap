
public class Reverse_String_Third_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse a string without using length variable and length();
		
		
		String s="Avinash";
		int count=0;
		
		char ch[]=s.toCharArray();
		
		for(char c:ch) {
			
			count++;
			
		}
         String rev="";
         for(int i=count-1;i>=0;i--) {
        	 rev =rev+s.charAt(i);
         }
         System.out.println(rev);
	}

}
