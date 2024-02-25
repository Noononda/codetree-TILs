import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ary = new int[N];
        for (int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(st.nextToken());
        }

        absolute(ary);
    }

    public static void absolute(int[] ary) {
        for (int number : ary) {
            if (number < 0) {
                System.out.print((number * -1) + " ");
            } else if (number == 0) {
                System.out.print("0" + " ");
            } else {
                System.out.print(number + " ");
            }
        }
    }
}