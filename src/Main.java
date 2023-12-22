import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        findFibNumber(5);
    }

    private static void findFibNumber(int fibNumber) {
        System.out.println(
                Stream.iterate(new int[] {0, 1}, i -> new int[] {i[1], i[0] + i[1]})
                .limit(fibNumber)
                .reduce((a, b) -> b)
                .get()[0]
        );
    }
}