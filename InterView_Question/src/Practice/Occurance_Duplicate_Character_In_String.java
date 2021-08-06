package Practice;

import java.util.HashSet;

public class Occurance_Duplicate_Character_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s= "avinashaart";
		
		
		HashSet<Character> set =new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
        
		for(Character ch : set ) {
			
			int count =0;
			
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				
				}
			
			if(count==2) {
				System.out.println(ch);
			}
		}
		
	}
	}
}
	
