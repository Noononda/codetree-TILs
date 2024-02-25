import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(A(a, b) + " " + B(a, b));
    }

    public static int A(int a, int b) {
        int n = 0;
        if (a > b) {
            n = a + 25;
        } else {
            n = a * 2;
        }
        return n;
    }

    public static int B(int a, int b) {
        int n = 0;
        if (a < b) {
            n = b + 25;
        } else {
            n = b * 2;
        }
        return n;
    }
}