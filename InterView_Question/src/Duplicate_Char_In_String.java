import java.util.LinkedHashSet;

public class Duplicate_Char_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="LanguageeL";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
        int totalduplicatecount=0;
		for(Character ch:set) {
			int count=0;
			
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
            if(count>1) {
            	totalduplicatecount++;
            }
	}
        System.out.println(totalduplicatecount);
	}
}
