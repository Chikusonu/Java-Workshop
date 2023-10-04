
public class Add5Num {
    public static String add(String s,int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return s+sum;
    }

    public static void main(String[] args) {
        System.out.println("Addition is " + add("First ",10, 12));
    }
}

