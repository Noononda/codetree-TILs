import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(sum(a, b));
    }

    public static int sum(int a, int b) {
        int total = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i == 1) {
                    count++;
                }
            }
            if (count == 0) {
                total = total + i;
            } else {
                count = 0;
            }
        }

        return total;
    }
}