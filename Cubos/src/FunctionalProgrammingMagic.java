import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
 
public class FunctionalProgrammingMagic {
 
    /**
     * This method generates the cubes of the first n natural numbers.
     * @param n The number of natural numbers for which cubes are to be calculated.
     * @return List<Integer> This returns a list of cubes of the first n natural numbers.
     */
    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        // Checking if the input number is negative.
        // If it is, then we throw an IllegalArgumentException.
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        
        // Generating a sequence of integers from 1 to n (inclusive) using IntStream.range().
        // For each number, we calculate the cube and collect them into a List.
        return IntStream.range(1, n + 1)
                .map(e -> e * e * e)
                .boxed()
                .collect(Collectors.toList());
    }
}