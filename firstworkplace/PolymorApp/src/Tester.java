abstract class Polygon {
    public abstract double calcArea();
    public abstract double calcPeri();
}

class Circle extends Polygon {
    private int Radius;

    public Circle() {
        Radius = 1;
    }

    public Circle(int r) {
        Radius = r;
    }

    public double calcArea() {
        return 3.14159 * Radius * Radius;
    }

    public double calcPeri() {
        return 2 * 3.14159 * Radius;
    }
}

class Rectangle extends Polygon {
    private int len, bre;

    public Rectangle() {
        len = bre = 1;
    }

    public Rectangle(int l, int b) {
        len = l;
        bre = b;
    }

    public double calcPeri() {
        return 2 * (len + bre);
    }

    public double calcArea() {
        return len * bre;
    }
}

class Square extends Rectangle {
    private int side;

    public Square() {
        side = 1;
    }

    public Square(int s) {
        super(s, s);
    }

    public double calcArea() {
        return super.calcArea();
    }

    public double calcPeri() {
        return super.calcPeri();
    }
}

public class Tester {
    public static void main(String[] args) {
        Circle c = new Circle(9);
        System.out.println("Area of Circle: " + c.calcArea());
        System.out.println("Perimeter of Circle: " + c.calcPeri());

        Rectangle r = new Rectangle(10, 10);
        System.out.println("Area of Rectangle: " + r.calcArea());
        System.out.println("Perimeter of Rectangle: " + r.calcPeri());
    }
}
