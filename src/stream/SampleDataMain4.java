package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SampleDataMain4 {

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

        for (SampleData person : people) {
            if(person.getId() == 2) {
                System.out.println(person.getName());
                  }
        }
    }

    private static void streamVersion(List<SampleData> people) {
        String names = people.stream().filter(e -> e.getId() == 2)
                .map(SampleData::getName)
                .collect(Collectors.joining());

        System.out.println(name);

    }
}
