import java.awt.*;
class MovingString1 extends Frame implements Runnable{
    private Thread t1,t2;
    private int x1,x2;
    
    public MovingString1() {
        x1=100;
        x2=300;
        t1=new Thread(this,"t1");
        t2=new Thread(this,"t2");
        t1.start();
        t2.start();
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Tahoma", Font.PLAIN, 30)); // Using Font.PLAIN instead of 30,30
        g.setColor(Color.BLUE);
        g.drawString("Mindcraft", x1, 100);
        g.setColor(Color.RED);
        g.drawString("Software", x2, 300);
    }

    public void run() {
        while(true) {
            if(Thread.currentThread()==t1) {
                x1++;
                if(x1==this.getWidth()+15)
                    x1=0;
                try {
                    Thread.sleep(30);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            } else if(Thread.currentThread()==t2) { // Changed "else if" from "else if"
                x2--;
                if(x2==0-15)
                    x2=this.getWidth();
                try {
                    Thread.sleep(30);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
            repaint();
        }
    }
}

public class MovingString {
    public static void main(String[] args) {
        MovingString1 ms = new MovingString1(); // Created an instance of MovingString1
        ms.setSize(500, 500);
        ms.setVisible(true);
    }
}
