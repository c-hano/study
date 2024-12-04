package stream;

import java.util.ArrayList;
import java.util.List;

public class SampleDataMain2 {

    public static void main(String[] args) {
        List<SampleData> people = new ArrayList<>();
        people.add(new SampleData(1, "Alice", 20, 'F'));
        people.add(new SampleData(2, "Bob", 25, 'M'));
        people.add(new SampleData(3, "David", 35, 'M'));

        //문제 : 남성들의 나이의 합.

        System.out.println("== No Stream ==");
        noStreamVersion(people);
        System.out.println("== Stream ==");
        streamVersion(people);

    }

    private static void noStreamVersion(List<SampleData> people) {

        int sum = 0;
        double average = 0;

        for (SampleData person : people) {
            if(person.getGender() == 'M') {
                sum += person.getAge();
                average++;
            }
        }

        System.out.println((double) (sum/average));
    }

    private static void streamVersion(List<SampleData> people) {
        double sum = people.stream().filter(e -> e.getGender() == 'M')
                .mapToInt(e -> e.getAge())
                .average()
                        .orElse(0);
                    //average() 이후 생성된 값을 반환한다.
                    //값이 없다면 (0) 이므로 0 을 반환한다.

        System.out.println(sum);
    }
}
