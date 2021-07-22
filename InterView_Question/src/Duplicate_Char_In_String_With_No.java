import java.util.HashSet;
import java.util.LinkedHashSet;

public class Duplicate_Char_In_String_With_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String s="Language";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
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
			if(count>1) {
			System.out.println(ch+"  "+count);
		}
	}


	}

}
