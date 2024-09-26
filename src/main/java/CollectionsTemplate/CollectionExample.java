package CollectionsTemplate;

import java.util.*;

public class CollectionExample {
    String nameAutor;

    CollectionExample(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    CollectionExample() {

    }

    public String toString() {
        return nameAutor;
    }

    private void myList() {
        List list = new ArrayList();
        list.add("dgdg");
        list.add("52");
        list.add(3);
        list.add(4);
        list.set(2, 500);
//        System.out.println(" " + list);
//        list.remove(1);
//        System.out.println(" " + list);
//        System.out.println(list.get(0));

        for (Object o : list) {
            System.out.println(" " + o);
        }
        System.out.println("---------------------------");
        for(int o = 0; o < list.size(); o ++){
            System.out.println(list.get(o));
        }
    }
    private void mySet(){
        Set set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add(3);
        set1.add(2);
        set1.add(3);
        set1.add(2);
        set1.add(3);
        set1.add(2);
        for (Object o: set1)
            System.out.println(o);
        System.out.println(set1);
        System.out.println(set1.size());
    }

    private void myQueue(){
        Queue queue = new PriorityQueue();
        queue.offer(23);
        queue.offer(1);
        queue.offer(12);
        Iterator iter = queue.iterator();
        while (iter.hasNext())
            System.out.print(" "+ iter.next());
        System.out.println();
        while (iter.hasNext())
            System.out.println(queue.poll()); // poll() - метод достает и удаляет элементы из очереди
        System.out.println("Size of queue: " + queue.size());
    }

    private void myMap() {
        Map map = new HashMap();
        map.put(2, "Shevchenko");
        map.put(1, new CollectionExample("London"));
        System.out.println(map.get(2));
        System.out.println(map.get(1));
        Set set = map.keySet();
        for (Object o: set)
            System.out.println(o);

    }

    public static void main(String[] args) {
        CollectionExample colEx = new CollectionExample();
        colEx.myList();
//        colEx.mySet();
        //colEx.myQueue();
        //colEx.myMap();

    }
}

