/**
 * Created by Taras_Oliinyk on 9/3/2018.
 */
public class Main {

    public static void main(String[] args) {
        int x = Calculator.sum(12,36);
        System.out.println(x);
        Calculator cal = new Calculator();
        System.out.println(cal.X);
        Calculator.X = 50;
        System.out.println(cal.X);
        Calculator cal2 = new Calculator();
        System.out.println(cal2.X);

    }
}
