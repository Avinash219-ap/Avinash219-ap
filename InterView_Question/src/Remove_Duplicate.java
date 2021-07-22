import java.util.LinkedHashSet;

public class Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String s="Languagee";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
        
		for(Character ch:set) {
			
			
			//for(int i=0;i<s.length();i++) {
				System.out.println(ch);
				}
			}
	}

//}
