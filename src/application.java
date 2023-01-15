import java.sql.SQLOutput;

public class application {
    public static void main(String[] args) {
        EntierNatuel nb = new EntierNatuel(5);
        EntierNatuel nb2 = new EntierNatuel(-2);

        System.out.println(nb.getVal());
        System.out.println(nb2.getVal());
        nb.setVal(-10);
        System.out.println(nb.getVal());
        nb2.setVal(0);
        System.out.println(nb2.getVal());
        nb2.decrementer();
        nb.decrementer();
        System.out.println(nb.getVal());


    }
}
