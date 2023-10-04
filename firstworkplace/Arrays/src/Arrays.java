//

import java.util.Scanner;

public class Arrays {
public static void main(String[] args) {
	
	int [] a= new int[]{1,2,3,5,4}; //initialize
	int [] b= {10,20,30}; // initialize array
	int [] c=new int[5]; // uninitialize array
	Scanner sc = new Scanner(System.in);
	
//	System.out.println("Enter the 5 float value ");
//	for(int i=0;i<c.length;i++)
//		c[i]=sc.nextInt();
//	for(int i=0;i<c.length;i++)
//		System.out.println(c[i]+" ");
//		
//	
//	for(int val:c) {
//		System.out.println(val+" ");
//	}
	int max=a[0];
 for(int i=0;i<a.length;i++) {
	 if(a[i]>max) {
		 max=a[i];
	 }
 }
 
 System.out.println("max "+max);
 
 
 int min=a[0];
 for(int i=0;i<a.length;i++) {
	 if(a[i]<min) {
		 min=a[i];
	 }
 }
 System.out.println("min "+min); 
}

}
