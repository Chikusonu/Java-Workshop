import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the value ");
Scanner sc=new Scanner(System.in);
int a = sc.nextInt();
int num=0,d=0;
int original=a;
while(a>0) {
	d=a%10;
	num+=d*d*d;
	a=a/10;
}
if(num==original) {
	System.out.println("It is a Armstrong number");
}
else {
	System.out.println("It is not a Armstrong number");
}
	}

}
