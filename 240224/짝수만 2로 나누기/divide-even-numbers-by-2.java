import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] number = new int[N];

        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        
        Even(number);
    }

    public static void Even(int[] number) {
        for (int i : number) {
            if (i % 2 == 0) {
                System.out.print((i / 2) + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}