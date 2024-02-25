import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        char[] sentence = A.toCharArray();

        another(sentence);
    }

    public static void another(char[] sentence) {
        char A = sentence[0];
        int count = 0;

        for (char alphabet : sentence) {
            if (alphabet != A) {
                count++;
                A = alphabet;
            }
        }
        
        if (count == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}