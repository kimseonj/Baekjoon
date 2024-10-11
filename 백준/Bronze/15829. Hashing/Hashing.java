import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        int r = 31;
        long M = 1234567891l;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        // long 사용
//        long n = 0l;
//        long result = 0l;
//        for (int i=0; i<L; i++) {
//            n = s.charAt(i) - 96;
//            result += (long)(n*Math.pow(r, i));
//        }

        // BigInteger 사용
        BigInteger result = new BigInteger("0");
        for (int i=0; i<L; i++) {
            result = result.add(BigInteger.valueOf(s.charAt(i)-96).multiply(BigInteger.valueOf(31).pow(i)));
        }

        System.out.print(result.remainder(BigInteger.valueOf(M)));
    }
}