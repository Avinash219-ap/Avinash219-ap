import java.util.LinkedHashSet;

public class Print_Duplicate_Word_In_Given_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="india is a great country and it has great history";

String str[] = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
        int totalduplicatecount=0;
		for(String word:set) {
			int count=0;
			
			for(int i=0;i<str.length;i++) {
				if(word.equals(str[i])) {
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


