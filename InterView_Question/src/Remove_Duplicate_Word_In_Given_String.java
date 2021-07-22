import java.util.LinkedHashSet;

public class Remove_Duplicate_Word_In_Given_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s="My name is Avinash and Avinash is a good boy";
String str[] =s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
        
		for(String word:set) {
			
			
			//for(int i=0;i<s.length();i++) {
				System.out.println(word);
				}
			}
	

//}
		
	}


