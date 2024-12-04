package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RefToIntMap {

    public static void main(String[] args) {

        List<Integer> list2 = Arrays.stream(new int[]{10, 20, 30})
                .boxed()
                // int e -> Integer
                // 업캐스팅 느낌과 비슷한 듯 하다.
                .toList();
                //Integer로 바뀐 객체들을 List 배열화 하였다.

    }
}
