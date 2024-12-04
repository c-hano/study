package stream;

import java.util.Arrays;

public class Immortality {
    public static void main(String[] args) {

        System.out.println("== No Stream ==");
        noStreamVersion();

        System.out.println("== Stream ==");
        streamVersion();
    }

    private static void noStreamVersion() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("= 원본 numbers(변형 전) =");
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }

        System.out.println("= 원본 numbers(변형 후) =");
        System.out.println(Arrays.toString(numbers));

    }
    private static void streamVersion() {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10};

        System.out.println("= 원본 numbers(변형 전) =");
        System.out.println(Arrays.toString(numbers));

        int[] calculatedNumbers = Arrays.stream(numbers).map(e -> e * 2).toArray();
        //배열타입에서 stream을 사용할 경우, Arrays.stream()을 선언하고 종단함수로 toArray()를 선언해야한다.
        //toArray를 하게 되면 스트림을 다시 Array타입으로 반환한다.
        System.out.println("= 원본 numbers(변경 후) =");
        System.out.println(Arrays.toString(numbers));
        System.out.println("= 새 calculatedNumbers(변경 후) =");
        System.out.println(Arrays.toString(numbers));

        //Stream이 불변객체라는 말이 아닌 듯 하다.
        //심지어 for each를 사용하면 원본의 값을 바꿀 수 있다.
        //fliter, map. 이 원본의 배열을 바꾸지 않는다는 말을 하고 싶었던 듯 하다.
        //map을 사용하게 되면 원본의 값이 바뀌지 않고 연산된 복사값이 나온다.
        //나온 복사값들을 toArray로 다시 배열로 반환하고 새 변수에 담는다.
        // -> 원본의 배열을 map을 통해 변환하여도 원본의 값은 바뀌지 않는다.

    }
}
