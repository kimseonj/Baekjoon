import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputArr = input.split("\\s");

        int n = Integer.parseInt(inputArr[0]);
        int goal = Integer.parseInt(inputArr[1]);

        input = br.readLine();
        String[] stringCard = input.split("\\s");
        int[] card = new int[n];

        for (int i=0; i<n; i++) {
            card[i] = Integer.parseInt(stringCard[i]);
        }

        int max = 0;
        int result = 0;
        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    result = card[i] + card[j] + card[k];
                    if (result <= goal) {
                        if (result > max) {
                            max = result;
                            result = 0;
                        }
                    }
                }
            }
        }

        System.out.print(max);

    }
}