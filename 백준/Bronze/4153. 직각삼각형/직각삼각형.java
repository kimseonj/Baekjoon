import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[]{"0", "0", "0"};

        while(true) {
            String input = br.readLine();

            String[] arr = input.split(" ");
            int[]  arrInt = new int[3];
            if (Arrays.equals(arr, s)) break;
            

            for (int i = 0; i < arr.length; i++) {
                arrInt[i] = (int) Math.pow(Integer.parseInt(arr[i]), 2);
            }

            Arrays.sort(arrInt);

            if(arrInt[2] == (arrInt[0] + arrInt[1])) System.out.println("right");
            else System.out.println("wrong");

        }

    }
}