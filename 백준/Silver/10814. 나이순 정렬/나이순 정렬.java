import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        Person[] persons = new Person[N];
        for (int i = 0; i < N; i++) {
            String[] s = bufferedReader.readLine().split(" ");
            persons[i] = new Person(Integer.parseInt(s[0]), s[1]);
        }

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.age > o2.age) {
                    return 1;
                } else if (o1.age < o2.age) {
                    return -1;
                }
                return 0;
            }
        });

        for (Person person : persons) {
            System.out.println(person.age + " " + person.name);
        }
    }
}