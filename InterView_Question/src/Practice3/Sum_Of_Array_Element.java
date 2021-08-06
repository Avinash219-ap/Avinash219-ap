package Practice3;

public class Sum_Of_Array_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,30,40,50};
		
		int sum =0;
		
		for(int i=0;i<a.length;i++) {
			
			sum =sum+a[i];
		}
		System.out.println(sum);
	}

}
