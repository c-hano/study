package stream;

import java.util.stream.IntStream;

public class ForEach {
    public static void main(String[] args) {

        //일반
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Foreach스트림 사용
        IntStream.rangeClosed(1, 10).forEach(e -> System.out.println(e));
        //int e ->(를) System.out.println(e)해라. forEach(rangeClosed(1,10) 1~10 동안)

        //리펙토링
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
        //System.out::println -> 인자 하나를 받아서 출력할 경우 :: 를 사용한다.
    }
}
