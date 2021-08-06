
public class ArrayMock {
	
	
	public static void main(String args[]) {
		
		int arr[]= {10,20,30,40,50,10};
		
		
		
		for(int i=0;i<=arr.length;i++) {
		 
			for(int j=i+1;j<=arr.length;i++) {
				
				if(arr[i]==arr[j+1]) {
					
					System.out.println(arr[j]);			}
			}
		}
	}

}
