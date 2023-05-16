package PractisePrograms;

public class Numberswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// swaping of two numbers without using other
		
	int arr[]= {3,5,2,9,1,7};
	int temp=0;
		int a=67;
		int b=89;
		System.out.println("a ="+a +" b =" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap a="+a +"b ="+b);
		
		
		//Soring of an array
		
		System.out.println("Array before sorting" +arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if( arr[i]> arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		}
		for(int i=0;i<arr.length;i++)
		System.out.println( +arr[i]);
		
		
	}

}
