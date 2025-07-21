import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            solve();
        }
    }

    static void solve() throws IOException{
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 상자 초기화
        int[] box = new int[M];
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            box[i] = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        // 상자 정렬
        Arrays.sort(box);
        
        // 그리디
        int count = 0;
        for (int i = box.length-1; i>=0; i--) {
            N -= box[i];
            count++;

            if (N<=0) {
                break;
            }
        }

        System.out.println(count);
    }
}