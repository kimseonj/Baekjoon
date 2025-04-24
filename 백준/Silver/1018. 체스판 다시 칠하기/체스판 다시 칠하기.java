import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int count(Character[][] chess, int x, int y) {
        Character[] check = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
        Character[] check1 = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};

        int count = 0;
        for (int i = x; i < x + 8; i++) {
            Character[] ch = null;
            if (i % 2 == 0) {
                ch = check;
            } else {
                ch = check1;
            }
            for (int j = y; j < y + 8; j++) {
                // 비교
                if (ch[j -y] != chess[i][j]) {
                    count++;
                }

            }
        }

        return count < 32 ? count : 64-count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        Character[][] chess = new Character[N][M];

        // 체스판 생성
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                chess[i][j] = line.charAt(j);
            }
        }

        int max = 63;
        // 시작점
        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                int result = count(chess, i, j);
                if (result < max) {
                    max = result;
                }

            }
        }
        System.out.println(max);
    }

}