//Интерфейс Deque появился в Java 6.
//        Он расширяет Queue и описывает поведение двунаправленной очереди.
//        Двунаправленная очередь может функционировать как стандартная очередь FIFO либо как стек LIFO.
package CollectionsTemplate;

import java.util.Deque;
import java.util.LinkedList;

public class MyExampleDeque {
    public static void main(String[] args) {
        Deque<Integer> integerDequeLL = new LinkedList<>();
        integerDequeLL.add(3);
        integerDequeLL.add(5);
        integerDequeLL.add(2);
        System.out.println("add: " + integerDequeLL);
        integerDequeLL.push(1);
        System.out.println("push: " + integerDequeLL);
        integerDequeLL.addFirst(7);
        System.out.println("addFirst: " + integerDequeLL);
        integerDequeLL.addLast(9);
        System.out.println("addLast: " + integerDequeLL);
        System.out.println("getFirst(): " + integerDequeLL.getFirst());
        System.out.println("getFirst(): " + integerDequeLL.getFirst());
        System.out.println("getLast(): " + integerDequeLL.getLast());
        System.out.println("getLast(): " + integerDequeLL.getLast());
        System.out.println("--------");
        System.out.println(integerDequeLL);
        integerDequeLL.removeFirst();
        integerDequeLL.removeFirst();
        integerDequeLL.removeLast();
        System.out.println(integerDequeLL);

        System.out.println("peekFirst(): " + integerDequeLL.peekFirst());
        System.out.println("peekFirst(): " + integerDequeLL.peekFirst());

        System.out.println("pollLast(): " + integerDequeLL.pollLast());
        System.out.println("pollLast(): " + integerDequeLL.pollLast());
        System.out.println(integerDequeLL);
    }
}
