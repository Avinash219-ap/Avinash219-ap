package Practice;

import java.util.LinkedHashSet;

public class Remove_Duplicate_Character_In_Given_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="avinashartai";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			
			set.add(s.charAt(i));
		}
		
		for(Character ch : set) {
			
			System.out.println(ch);
		}
	}

}
