import java.util.Arrays;
import java.util.List;

public class JavaStreams {
    public static void main(String[] args) {

//      filter - Keeps only elements that match the condition.
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,5);
        List<Integer> evens = num.stream().filter(n -> n%2==0).toList();
        System.out.println(evens);

//      map - Transforms elements into another form.
        List<String> fruits = Arrays.asList("grapes","banana","apple","pears");
        List<String> fruitUpper = fruits.stream().map(String::toUpperCase).toList();
        System.out.println(fruitUpper);

//      flatMap - Flattens nested structures (e.g. list of lists).
        List<List<Integer>> data = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 3),
                Arrays.asList(3, 9)
        );
        List<Integer> list = data.stream().flatMap(List::stream).toList();
        System.out.println(list);


    }
}