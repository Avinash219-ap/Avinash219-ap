package Practice;

public class Swap_Two_No_Without_Using_Third_Varaiable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		System.out.println("The value of a and b before swaping-----"+a+"   "+b);
		
		a=a+b;  //10+20=30
		b=a-b;  //30-20=10
		a=a-b;  //30-10=20
		
		System.out.println("The value of a and b after swaping ------"+a+"    "+b);
		
	}

}
