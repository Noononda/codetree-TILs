import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(A(a, b) + " " + B(a, b));
    }

    public static int A(int a, int b) {
        if (a > b) {
            a *= 2;
        } else {
            a += 10;
        }

        return a;
    }

    public static int B(int a, int b) {
        if (b > a) {
            b *= 2;
        } else {
            b += 10;
        }

        return b;
    }
}