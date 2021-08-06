package ArrayProgram;

public class Sort_The_Element_Asscending_Order{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int a[] = {40,30,10,20,25};
		
		for(int i=0; i<a.length;i++) {
			 for(int j = i+1;j<a.length;j++ ) {
				 
				 if(a[i]>a[j]) {//it will return the asscending order
					 
					 int temp =a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		}
		 for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]+" ");
		 }
	}

}
