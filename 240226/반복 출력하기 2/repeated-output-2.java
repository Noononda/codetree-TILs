import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        prtHello(n);
    }

    static void prtHello(int n) {
        if (n > 0) {
            System.out.println("HelloWorld");
            n--;
            prtHello(n);
        } else {
            return;
        }
    }
}