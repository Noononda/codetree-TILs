import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] ary = new int[n];
        StringTokenizer sr = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sr.nextToken());
        }

        again(ary, m);
    }

    public static void again(int[] ary, int m) {
        int total = 0;
        while (m >= 1) {
            if (m % 2 != 0) {
                total += ary[m - 1];
                m -= 1;
            } else {
                total += ary[m - 1];
                m /= 2;
            }
        }
        System.out.println(total);
    }
}