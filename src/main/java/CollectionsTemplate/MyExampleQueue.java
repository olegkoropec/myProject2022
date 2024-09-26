//Интерфейс Queue расширяет Collection и объявляет поведение очередей,
//        которые представляют собой список с дисциплиной "первый вошел, первый вышел" (FIFO).
//        Существуют разные типы очередей, в которых порядок основан на некотором критерии.
//        Очереди не могут хранить значения null
// Интерфейс Deque появился в Java 6. Он расширяет Queue и описывает поведение двунаправленной очереди.
//      Двунаправленная очередь может функционировать как стандартная очередь FIFO либо как стек LIFO (принцип стека).
package CollectionsTemplate;

import java.util.*;

public class MyExampleQueue {
    public static void main(String[] args) {
        Queue<Integer> queueLL = new LinkedList<>();        //  LinkedList -  реализует интерфейсы сразу два интерфейса - List, Deque. LinkedList – это двусвязный список.
        Deque<Integer> dequeLL = new LinkedList<>();
        Queue<Integer> queuePQ = new PriorityQueue<>();    //   PriorityQueue - элементы сортируются в порядке возрастания на основе их естественного порядка
        Queue<Integer> queueAD = new ArrayDeque<>();        // ArrayDeque - поддерживает двустороннюю структуру данных очереди; также он — динамический массив, который может автоматически увеличивать свой размер.
        Deque<Integer> dequeAD = new ArrayDeque<>();

        queueLL.offer(3);                       // offer() та add() - додає елементи до Queue, якщо не вдалося offer() - повертає false
        queueLL.offer(2);
        queueLL.offer(5);
        queueLL.offer(7);
        queueLL.offer(2);
        queueLL.offer(0);
        queueLL.offer(7);
        queueLL.offer(1);
        queueLL.add(23);                     // add() може невдало додати елемент лише за допомогою unchecked винятка.
        System.out.println("queueLL: " + queueLL);
        queueLL.remove();
        queueLL.poll();                  // remove() та poll()  - видаляє елемент із голови Queue;
        // відрізняються лише поведінкою, коли черга порожня: метод remove() генерує виняток,
        // а метод poll() повертає null.
        System.out.println("poll() та remove() : " + queueLL);
        queueLL.remove(23);         // remove(Object o) - видаляє 23
        System.out.println("remove(Object o): " + queueLL);

        queueLL.peek();
        System.out.println("peek(): " + queueLL.peek());    // peek() та element() - повертає елемент з голови НЕ видаляючи його
        // element() генерує виняток, peek() повертає null
        queueLL.element();
        System.out.println("element(): " + queueLL.element());
        System.out.println(queueLL);

        System.out.println("----------PRIOROTY QUEUE-----------");
        queuePQ.add(6);
        queuePQ.add(4);
        queuePQ.add(3);
        queuePQ.add(5);
        queuePQ.add(8);
        System.out.println("add() PQ: " + queuePQ);        // PriorityQueue не гарантується ніякий стабільний послідовний порядок збереження елементів
        System.out.print("PriorityQueue: ");            //
        while (!queuePQ.isEmpty()) {
            System.out.print(queuePQ.remove() + " ");
        }
        System.out.println();

        queueAD.add(9);
        queueAD.add(4);
        queueAD.add(8);
        queueAD.add(5);
        queueAD.add(7);
        queueAD.add(1);
        System.out.println("add() AD: " + queueAD);
        System.out.print("ArrayDeque: ");
        while (!queueAD.isEmpty()) {
            System.out.print(queueAD.poll() + " ");
        }
        System.out.println();

        System.out.println("----------DEQUE-----------");
        dequeAD.addFirst(4);        // У інтерфейсу Deque назви методів схожі на методи інтерфейсу Queue, лише добавляється до назв методу ...First або ...Last
        dequeAD.addFirst(1);
        dequeAD.addFirst(8);
        dequeAD.addLast(11);
        dequeAD.addLast(0);
        dequeAD.addLast(16);
        dequeAD.add(20);
        System.out.println("add() D: " + dequeAD);
        System.out.println("The First element is: "+ dequeAD.getFirst());
        System.out.println("The Last element is: " + dequeAD.getLast());
        System.out.println(dequeAD.removeFirstOccurrence(11));      // boolean метод, видаляє потрібний елемент
        System.out.println(dequeAD.removeLastOccurrence(2));
        System.out.println(dequeAD);
        System.out.println("pop(): " + dequeAD.pop());      // pop() - видаляє елемент із голови
        System.out.println(dequeAD);
    }
}
