import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        System.out.println(total(N));
    }

    public static int total(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }
        
        return sum / 10;
    }
}