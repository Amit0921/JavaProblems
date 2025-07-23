package collection.deque;

import java.util.ArrayDeque;
import java.util.stream.Collectors;

public class ArrayDequeImpl {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
//        insertion
        deque.addLast(5);
        deque.addLast(9);
        deque.addLast(3);
        deque.forEach(System.out::println);
        System.out.println(deque.stream().map(String::valueOf).collect(Collectors.joining(",")));
//        deletion
        int element = deque.removeFirst();
        System.out.println(element);
        System.out.println("--------------------");
//        LIFO (last in first out)
        ArrayDeque<Integer> dequeStack = new ArrayDeque<>();
        dequeStack.addFirst(5);
        dequeStack.addFirst(9);
        dequeStack.addFirst(3);
        dequeStack.forEach(System.out::println);
        System.out.println(dequeStack.stream().map(String::valueOf).collect(Collectors.joining(",")));
//        deletion
        int removedElement = dequeStack.removeFirst();
        System.out.println(removedElement);
    }
}
