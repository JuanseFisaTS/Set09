import java.util.List;

public class FunctionalProgrammingMagic {

    public static long sumOfSquares(List<Integer> numbers) {
        
        // Check if the list is null. If so, return 0.
        if (numbers == null){
            return 0;
        }
        // Stream over the list of numbers, find squares and sum them up
        return numbers.stream().mapToLong(d -> d * d).sum();
    }

}