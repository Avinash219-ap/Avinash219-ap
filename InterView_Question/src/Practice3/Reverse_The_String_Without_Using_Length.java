package Practice3;

public class Reverse_The_String_Without_Using_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="avinash";
		
		int count =0;
		
		char ch[] =s.toCharArray();
	     
		
		for(Character c :ch) {
			
			count++;
			
		}
		
		String rev="";
       for(int i=count-1;i>=0;i--) {
    	   
    	   rev =rev+s.charAt(i);
    	   
    	   
       }
       System.out.println(rev); 
	}
      
}

