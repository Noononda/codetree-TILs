import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int A = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A < 9) {
                    System.out.print(A + " ");
                    A++;
                } else if (A == 9) {
                    System.out.print(A + " ");
                    A = 1;
                }
            }
            System.out.println();
        }
        
    }
}