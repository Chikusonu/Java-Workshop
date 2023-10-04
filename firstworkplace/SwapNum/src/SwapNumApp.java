import java.util.Scanner;

public class SwapNumApp {
public static void main(String[] args) {
	System.out.println("Enter The Number ");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Before the swapping a="+a+" b="+b);
	int c=a;
	 a=b;
	 b=c;
	 System.out.println("after the swapping a="+a+" b="+b);
	
}
}
