import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] sentence = br.readLine().toCharArray();

        palindrome(sentence);
    }

    public static void palindrome(char[] sentence) {
        int A = sentence.length - 1;
        int count = 0;
        for (char alphabet : sentence) {
            if(sentence[A] == alphabet) {
                A--;
            } else {
                count++;
                A--;
            }
        }
        
        if (count == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}