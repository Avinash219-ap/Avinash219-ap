package Practice2;

import java.util.HashSet;

public class Print_Duplicate_Char_With_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "avinashart";
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
        for(Character ch :set) {
        	int count=0;
        	
        	for(int i=0;i<s.length();i++) {
        		
        		if(ch==s.charAt(i)) {
        			
        			count++;
        		}
        	}
            if(count>1) {
            	System.out.println(ch+"  "+count);
            }
        }
	}

}
