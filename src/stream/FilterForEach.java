package stream;

import java.util.stream.IntStream;

public class FilterForEach {

    public static void main(String[] args) {

        //일반
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }

        //스트림

        IntStream.rangeClosed(1, 10).filter(e -> e % 2 == 0).forEach(System.out::println);
    }
}
