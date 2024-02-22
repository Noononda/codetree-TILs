import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(right(n));
    }

    public static String right(int n) {
        int one = n % 10;
        int ten = (n - one) / 10; 
        if (n % 2 == 0 && (one + ten) % 5 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
}