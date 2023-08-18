import java.util.List;
import java.util.Optional;

public class FunctionalProgrammingMagic {

    public static int findMaxEvenNumber(List<Integer> numbers) {
        // Write your code here 
        if(numbers==null){
            return 0;
        }
        Optional<Integer> max = numbers.stream()
            .filter(number -> number % 2 == 0)
            .max(Integer::compare);
        return max.orElse(0);
    }
}