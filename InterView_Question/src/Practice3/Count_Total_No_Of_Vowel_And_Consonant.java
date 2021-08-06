package Practice3;

public class Count_Total_No_Of_Vowel_And_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="My Name is Avinash Pandey";
		int vCount=0;
		str =str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			
			vCount++;
			
		}
		
		
	
		else if
		(str.charAt(i)>='a' && str.charAt(i)<='z') {
			
			cCount++;
			
		}
          System.out.println("no of vowel"+vCount);
          System.out.println("no of consonant"+cCount);
		}
}