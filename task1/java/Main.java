import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args)  {
        List<String> words = Arrays.asList("Hello", "World", "Hello", "OpenAI");

        Set<String> uniqueWords = words.stream()
                .collect(Main.toSet());

        System.out.println(uniqueWords);
    }

    public static <T> Collector<T, Set<T>, Set<T>> toSet() {
        return Collector.of(
                HashSet::new,
                Set::add,
                (set1,set2)->{
                    set1.addAll(set2);
                    return set1;
                },
                Collector.Characteristics.UNORDERED
        );
    }
}

