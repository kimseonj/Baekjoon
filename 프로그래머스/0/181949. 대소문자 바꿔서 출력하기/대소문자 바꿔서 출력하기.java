import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c >= 97) {
                c -= 32;
            } else if (c >= 65 && c <= 90) {
                c += 32;
            }
            System.out.print(c);
        }
        
    }
}