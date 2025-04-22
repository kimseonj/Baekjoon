import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class Plane {
        int x;
        int y;

        public Plane(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        Plane[] planes = new Plane[N];
        for (int i = 0; i < N; i++) {
            String[] s = bufferedReader.readLine().split(" ");
            planes[i] = new Plane(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        }

        Arrays.sort(planes, new Comparator<Plane>() {
            @Override
            public int compare(Plane o1, Plane o2) {
                if (o1.x > o2.x) {
                    return 1;
                } else if (o1.x < o2.x) {
                    return -1;
                } else {
                    if (o1.y > o2.y) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        });

        for (Plane plane : planes) {
            System.out.println(plane.x + " " + plane.y);
        }
    }
}
