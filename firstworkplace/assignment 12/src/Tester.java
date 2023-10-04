interface Printable {
    void printDetails();
}

class Cktplayer implements Printable {
    private String Ckt_name;
    private int Ckt_match;

    public void ckt_take(String n, int m) {
        Ckt_name = n;
        Ckt_match = m;
    }

    @Override
    public void printDetails() {
        System.out.println("Cricketer name " + Ckt_name);
        System.out.println("Cricket Matches: " + Ckt_match);
    }
}

class FtPlayer implements Printable {
    private String Ft_name;
    private int Ft_match;

    public void Ft_take(String n, int m) {
        Ft_name = n;
        Ft_match = m;
    }

    @Override
    public void printDetails() {
        System.out.println("Footballer name " + Ft_name);
        System.out.println("Football Matches: " + Ft_match);
    }
}

public class Tester {

    public static void main(String[] args) {
        Cktplayer ctk = new Cktplayer();
        ctk.ckt_take("Sachin", 10);
        ctk.printDetails();

        FtPlayer ft = new FtPlayer();
        ft.Ft_take("Messi", 10);
        ft.printDetails();
    }
}
