package Practice2;

import java.util.HashSet;

public class Remove_Duplicate_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String s = "avinashartt";
		
		HashSet<Character> set = new HashSet<Character>();
		
		
		for(int i=0;i<s.length();i++) {
			
			set.add(s.charAt(i));
		}
		 for(Character ch :set) {
			
			 
			System.out.println(ch);
		
	}

}
}