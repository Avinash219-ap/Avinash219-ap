package Practice3;

public class Print_The_Even_No_from_1_To_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int no=100;
		
		for(int i=1;i<=no;i++) {
			
			if(i%2==0) {
				
				System.out.println("Even no------"+"  "+i);
			}
			else {
				
				System.out.println("Not Even no---"+"  "+i);
			}
		}
		
		
	}

}
