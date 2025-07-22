package collection.queue;

import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {

//        max priority queue, used to solve problems of max heap
        PriorityQueue<Integer> maxPq = new PriorityQueue<>((Integer a, Integer b) -> b-a);
        maxPq.add(21);
        maxPq.add(48);
        maxPq.add(19);
        maxPq.add(15);

//        let's print all the values
        maxPq.forEach(System.out::println);

//        remove top element from the PQ and print
        while(!maxPq.isEmpty()){
            int value = maxPq.poll();
            System.out.println("remove from top : "+value);
        }

    }
}
