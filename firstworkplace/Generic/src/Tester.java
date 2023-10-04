class OverFlow extends Exception {
    public OverFlow(String message) {
        super(message);
    }
}

class UnderFlow extends Exception {
    public UnderFlow(String message) {
        super(message);
    }
}

class Stack {
    private int size;
    private int top;
    private int[] arr;

    public Stack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    public void isFull() throws OverFlow {
        if (top == size - 1) {
            throw new OverFlow("Stack is full");
        }
    }

    public void isEmpty() throws UnderFlow {
        if (top == -1) {
            throw new UnderFlow("Stack Is Empty");
        }
    }

    public void push(int val) throws OverFlow {
        isFull();
        	arr[++top] = val;
        
    }

    public int pop() throws UnderFlow {
        isEmpty();
        return arr[top--];
    }
    
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println("" + arr[i]);
        }
    }

}

public class Tester {
    public static void main(String[] args) {
        Stack s1 = new Stack(10);

        try {
            s1.push(10);
            s1.push(20);
            s1.push(20);
            s1.push(20);
            s1.push(20);
            System.out.println("Deleted Item is " + s1.pop());
            System.out.println("Deleted Item is " + s1.pop());
            s1.display();
        } catch (OverFlow e) {
            System.out.println("Exception is " + e.getMessage());
        } catch (UnderFlow e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }
}
