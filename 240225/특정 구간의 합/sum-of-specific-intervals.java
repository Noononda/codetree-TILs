import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] ary;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer sr = new StringTokenizer(br.readLine());
        ary = new int[n];

        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sr.nextToken());
        }
        for (int k = 0; k < m; k++) {
            StringTokenizer sk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(sk.nextToken());
            int b = Integer.parseInt(sk.nextToken());
            int total = 0;

            for (int j = a; j <= b; j++) {
                total += ary[j - 1];
            }

            System.out.println(total);    
        } 
    }
}