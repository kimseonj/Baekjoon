import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class Person {
        int h;
        int w;

        public Person(int h, int w) {
            this.h = h;
            this.w = w;
        }
    }

    public static int compare(Person o1, Person o2) {
        if (o1.h > o2.h && o1.w > o2.w) {
            return -1;
        } else if (o1.h < o2.h && o1.w < o2.w) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        HashMap<Person, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            String[] s = bufferedReader.readLine().split(" ");
            map.put(new Person(Integer.parseInt(s[0]), Integer.parseInt(s[1])), 0);
        }

        Person[] array = map.keySet().toArray(new Person[0]);
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (compare(array[i], array[j]) == 1) {
                    map.put(array[i], map.get(array[i]) + 1);
                } else if (compare(array[i], array[j]) == -1) {
                    map.put(array[j], map.get(array[j]) + 1);
                }
            }
        }

        for (Person person : array) {
            System.out.println(map.get(person) + 1);
        }

    }
}