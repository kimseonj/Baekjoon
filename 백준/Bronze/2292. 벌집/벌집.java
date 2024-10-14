import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());

        int cnt = 1;
        for (int i = 0, j = 1; i < Integer.MAX_VALUE; i++) {
            j += (i*6);
            if (num <= j) {
                System.out.println(cnt);
                break;
            }
            cnt++;
        }

    }
}