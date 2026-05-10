import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String code = br.readLine();
        
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(code.charAt(i));
        }
        ListIterator<Character> it = list.listIterator(list.size());
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case("L"):
                    if (it.hasPrevious()) it.previous();
                    break;
                case("R"):
                    if (it.hasNext()) it.next();
                    break;
                case("D"):
                    if (it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                    break;
                case("P"):
                    it.add(st.nextToken().charAt(0));
                    break;
            }
        }

        for (char c : list) {
            System.out.print(c);
        }
    }
}