package ArrayProgram;

public class Find_The_Maximum_No_In_Given_Array {
 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {50,10,30,40,20};
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					int temp;
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
		
				}
			}
		
		}
         System.out.println(arr[0]);//maximum no of given array
          System.out.println(arr[arr.length-2]);// second minimum no
	}

}
