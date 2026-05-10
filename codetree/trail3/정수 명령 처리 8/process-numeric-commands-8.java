import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            switch (sc.next()) {
                case ("push_back"):
                    list.addLast(sc.nextInt());
                    break;
                case ("push_front"):
                    list.addFirst(sc.nextInt());
                    break;
                case ("pop_front"):
                    sb.append(list.pollFirst()).append("\n");
                    break;
                case ("pop_back"):
                    sb.append(list.pollLast()).append("\n");
                    break;
                case ("size"):
                    sb.append(list.size()).append("\n");
                    break;
                case ("empty"):
                    if (list.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;      
                case ("front"):
                    sb.append(list.peekFirst()).append("\n");
                    break;
                case ("back"):
                    sb.append(list.peekLast()).append("\n");
                    break;                                                      
            }
        }

        System.out.println(sb);
    }
}