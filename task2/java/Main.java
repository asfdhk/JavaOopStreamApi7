import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)  {
        List<String> words = Arrays.asList("asd","asdas","lkm");

        Map<String,Integer> vowelWords = words.stream()
                .filter(word-> containsVowels(word))
                .collect(Collectors.toMap(Function.identity(),String::length));

        System.out.println(vowelWords);
    }

    public static boolean containsVowels(String word){
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        for (char c:word.toLowerCase().toCharArray()){
            if (vowels.contains(c)){
                return true;
            }
        }
        return false;
    }

}

