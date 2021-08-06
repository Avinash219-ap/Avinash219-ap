package Practice;

public class Revese_String_Without_length_Variable {
	public static void main(String args[]) {
	String s="Avinash";
	int count=0;
	char ch[]=s.toCharArray();
	
	for(Character c:ch) {
		
		count++;
	}
	String rev="";
   for(int i=count-1;i>=0;i--) {
	   rev =rev+s.charAt(i);
   }
   
   System.out.println(rev);
}
}
