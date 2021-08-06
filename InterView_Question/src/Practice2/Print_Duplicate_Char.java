package Practice2;

import java.util.HashSet;

public class Print_Duplicate_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "avinash";
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			int count=0;
			
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
				
			}
		    if(count==2) {
		    	System.out.println(ch);
		    }
		}
	}

}
