import java.awt.*;

class MovingCircleExample extends Frame implements Runnable {
    private int x = 50; // Initial x-coordinate of the circle
    private int y = 200; // Y-coordinate of the circle

    public MovingCircleExample() {
        setSize(500, 500);
        setVisible(true);

        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight()); // Clear the frame

        g.setColor(Color.BLUE);
        g.fillOval(x, y, 50, 50); // Draw the circle
    }

    public void run() {
        boolean moveRight = true;
        while (true) {
            repaint();

            try {
                Thread.sleep(10); // Adjust the sleep duration to control speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (moveRight) {
                x += 2; // Move right
                if (x >= getWidth() - 50)
                    moveRight = false;
                }
            } else {
                x -= 2; // Move left
                if (x <= 0) {
                    moveRight = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        new MovingCircleExample();
    }
}
