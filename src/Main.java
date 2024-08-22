//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Data D = new Data();

        Thread1 T1 = new Thread1(1, D);
        Thread2 T2 = new Thread2(2, D);
        Thread3 T3 = new Thread3(3, D);
        Thread4 T4 = new Thread4(4, D);

        T1.start();
        T2.start();
        T3.start();
        T4.start();

    }
}