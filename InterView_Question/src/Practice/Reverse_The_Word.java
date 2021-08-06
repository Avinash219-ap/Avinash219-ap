package Practice;

public class Reverse_The_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String s ="avinash kumar";
		
		String str[] = s.split("");
		
		for(int i=str.length-1;i>=0;i--) {
			
			System.out.print(str[i]);
		}
		
		
	}

}
