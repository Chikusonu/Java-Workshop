import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Integer> v=new Vector<>();
v.add(10);
v.add(20);
v.add(30);
v.remove(0);

System.out.println(v);
for(Integer val:v)
	System.out.print(val+" ");
System.out.println();
Iterator<Integer> itr=v.iterator();
while(itr.hasNext()) {
	System.out.print(itr.next()+" ");
}
	}
   

}
