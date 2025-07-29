package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> numbs = Arrays.asList(1,9,2,3,4,5,6,2,6,7,8,9,5);
        List<String> str = Arrays.asList("dog","cat","africa","cow","bull","fox","ant");
        filterEvens(numbs);
        toUpperCase(str);
        countStartsWithA(str);
        getDistinctNumbers(numbs);
        findFirstInteger(numbs);
        findLongestString(str);
        groupStringByLength(str);
        findDuplicate(numbs);
        sumOfSquares(numbs);

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Bob",20000));
        emp.add(new Employee(2,"Charlie",45000));
        emp.add(new Employee(3,"Sam",47000));
        emp.add(new Employee(4,"Joe",25000));
        emp.add(new Employee(5,"Chris",43500));
        emp.add(new Employee(6,"Andrew",47000));
        sortEmpBySalary(emp);

    }
    static void filterEvens(List<Integer> numbs){
        List<Integer> numbsRes = numbs.stream().filter(n -> n%2==0).toList();
        System.out.println("Even numbs: " + numbsRes);
    }
    static void toUpperCase(List<String> s){
        List<String> str = s.stream().map(String::toUpperCase).toList();
        System.out.println("UpperCase: " + str);
    }
    static void countStartsWithA(List<String> str){
        long count = str.stream().filter(s -> s.startsWith("a")).count();
        System.out.println("a count: " + count);
    }
    static void getDistinctNumbers(List<Integer> numbs){
        List<Integer> num = numbs.stream().distinct().toList();
        System.out.println("Get Distinct: " + num);
    }
    static void findFirstInteger(List<Integer> numbs){
        Optional<Integer> i = numbs.stream().findFirst();
        System.out.println("Find first: " + i);
    }
    static void findLongestString(List<String> s){
        Optional<String> str = s.stream().max(Comparator.comparing(String::length));
        System.out.println("Longest String: " + str);
    }
    static void groupStringByLength(List<String> s){
        Map<Integer,List<String>> str = s.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Group by string length: " + str);
    }
    static void findDuplicate(List<Integer> numbs){
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = numbs.stream().filter(n -> !set.add(n)).distinct().toList();
        System.out.println("Find duplicate elements: " + duplicates);
        System.out.println("Find duplicate elements: " + set);
    }
    static void sumOfSquares(List<Integer> numbs){
        long res = numbs.stream().map(n -> n*n).reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + res);
    }
    static void sortEmpBySalary(List<Employee> emp){
        System.out.println(emp.get(0));
        for(Employee e : emp){
            System.out.println(e.salary);
        }
    }

}

class Employee{
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
