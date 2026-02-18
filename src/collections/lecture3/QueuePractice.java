package collections.lecture3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class QueuePractice {
    static void main() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        List<Integer> arr = new ArrayList<>();

        Vector<Integer> vec = new Vector<>();

//        arrayDeque.addFirst(1);
//        System.out.println(arrayDeque.offerFirst(2));
//        System.out.println(arrayDeque.pollFirst());


//        array deque is stack

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);

        for(Integer elem: stack){
            arrayDeque.addFirst(stack.removeFirst());
        }

        for(Integer elem2: arrayDeque){
            System.out.println(elem2);
        }

//        stack.removeFirst();
    }
}
