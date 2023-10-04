class MyMath<G>{
	public void Swap(G a,G b) {
		G temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
}
public class Swap {
public static void main(String[] args) {
	MyMath<Integer> m1= new MyMath<>();
	m1.Swap(100,20);
	MyMath<String> m2= new MyMath<>();
	m2.Swap("Green","Yellow");
}
}
