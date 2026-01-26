import java.util.*;

public class CollectionsOne {
    static void main() {

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        Iterator<Integer> valuesIterator = values.iterator();

        while (valuesIterator.hasNext()){
            int val = valuesIterator.next();
            System.out.print(val);
        }
        System.out.println();
        System.out.println("------");

        for(int val: values){
            System.out.print(val);
        }

        System.out.println();
        System.out.println("------");

        values.forEach(
                (Integer val) -> System.out.print(val)
        );

        System.out.println();
        System.out.println("------");


        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(6);
        stack.add(7);

        values.addAll(stack);

        System.out.println();
        System.out.println("------");

//        values.forEach(System.out::print);
        values.forEach((Integer val) -> System.out.print(val));
        values.remove(4);

        System.out.println();
        System.out.println("------");

        values.forEach(System.out::print);

        System.out.println();
        System.out.println("------");

        System.out.println(values.containsAll(stack));

        Deque<Integer> linked = new LinkedList<>();
        linked.add(1);
        linked.add(2);
        linked.add(3);
        linked.addLast(7);
        linked.addLast(8);
        linked.addLast(9);
        linked.addFirst(10);

        linked.forEach(System.out::print);
        System.out.println(linked.size());




    }
}
