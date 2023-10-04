import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
int [][]a= {{1,2,3},{4,5,6,7}};
int [][]b= {{1,2,3},{4,5},{6,7,8}};
int [][]c=new int[3][4];
int [][]d=new int[3][];
d[0]=new int[4];
d[1]=new int[2];
d[2]=new int[3];
System.out.println("enter the element ");
for(int i=0;i<d.length;i++) {
	for(int j=0;j<d[i].length;j++){
	d[i][j]=sc.nextInt();
	
	}
}
for(int []temp:d) {
	for(int val:temp) {
		System.out.print(val+" ");
	}
	System.out.println();
}
	}

}
