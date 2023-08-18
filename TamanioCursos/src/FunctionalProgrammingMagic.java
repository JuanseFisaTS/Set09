import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingMagic {

    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        // TODO: Write code
        if (courses == null) {
            
            return List.of();
        }
        
        return courses.stream().map(String::length).collect(Collectors.toList());    
        
    }
}