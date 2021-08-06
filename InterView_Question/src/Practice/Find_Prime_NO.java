package Practice;

public class Find_Prime_NO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int no =12;
		int temp=0;
		
		for(int i=2;i<no-1;i++) {
			if(i%no==0) {
				temp=temp+1;
			}
		}
		if(temp>0) {
			System.out.println("The no is not prime");
			
		}
		else {
			System.out.println("The no is prime ");
		}
	}

}

