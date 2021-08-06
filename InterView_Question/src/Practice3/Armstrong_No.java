package Practice3;

public class Armstrong_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no =153;
		
		int temp;
		int digit;
		int cubeSum=0;
		
		temp = no;
		
		while(temp!=0){
			
			digit =no%10;
			
			cubeSum = cubeSum+digit*digit*digit;
			
			temp/=10;
		}
		
		if(cubeSum==no) {
			System.out.println("no is armstrong");
		}
		else {
			System.out.println("no is not armstrong");
	}

	}
}
