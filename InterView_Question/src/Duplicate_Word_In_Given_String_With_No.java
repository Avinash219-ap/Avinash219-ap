import java.util.HashSet;
import java.util.LinkedHashSet;

public class Duplicate_Word_In_Given_String_With_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
           String s="I love my country because my country is great";
           
           String str[] =s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
        
		for(String word:set) {
			int count=0;
			
			for(int i=0;i<str.length;i++) {
				if(word.equals(str[i])) {
					count++;
				}
			}
			if(count>1) {
			System.out.println(word+"  "+count);
		}
	}


	}




	}


