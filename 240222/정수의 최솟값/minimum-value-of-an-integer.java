import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(smallest(a, b, c));
    }

    public static int smallest(int a, int b, int c) {
        int[] number = new int[3];
        number[0] = a;
        number[1] = b;
        number[2] = c;

        Arrays.sort(number);

        return number[0];
    }
}