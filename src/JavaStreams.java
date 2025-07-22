import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args) {

//      filter - Keeps only elements that match the condition.
        List<Integer> num = Arrays.asList(1,9,2,3,4,5,6,2,6,7,8,9,5);
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

        List<String> l2 = new ArrayList<>();
        l2.add("apple");
        l2.add("kiwi");
        System.out.println(l2);

        l2 = new LinkedList<>();
        System.out.println(l2);

        List<String> l1 = Arrays.asList("A","B");
        System.out.println(l1);
//        l1.add("C");
//        System.out.println(l1);

//        Sort a list of strings by their length in descending order
        List<String> list2 = Arrays.asList("apple", "banana", "kiwi", "grape");
        List<String> list2Res = list2.stream()
                .sorted((s1,s2) -> Integer.compare(s2.length(),s1.length()))
                .collect(Collectors.toList());
        System.out.println(list2Res);

    }
}