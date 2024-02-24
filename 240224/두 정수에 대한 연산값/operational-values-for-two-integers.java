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
        
        complex(a, b);

        a = complex(a, b)[0];
        b = complex(a, b)[1];

        System.out.println(a + " " + b);
    }

    public static int[] complex(int a, int b) {
        int[] integer = new int[2];
        integer[0] = a;
        integer[1] = b;

        Arrays.sort(integer);

        integer[0] = a * 2;
        integer[1] = b + 25;

        return integer;
    }
}