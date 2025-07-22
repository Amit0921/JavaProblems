package collection.queue;

import java.util.PriorityQueue;

public class MinPriorityQueue {
    public static void main(String[] args) {

//        min priority queue, used to solve problems of min heap
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        minPq.add(21);
        minPq.add(48);
        minPq.add(19);
        minPq.add(15);

//        let's print all the values
        minPq.forEach(System.out::println);

//        remove top element from the PQ and print
        while(!minPq.isEmpty()){
            int value = minPq.poll();
            System.out.println("remove from top : "+value);
        }
    }
}
