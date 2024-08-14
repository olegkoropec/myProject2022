package CollectionsTemplate;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        Queue<Integer> dq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                if (integer % 2 == 0 && integer > t1)
                    return 1;
                else
                    return -1;
            }
        });
        dq.add(3);
        dq.add(1);
        dq.add(6);
        dq.add(4);
        dq.add(2);
        dq.add(9);
        System.out.println(dq);


        while (!dq.isEmpty()) {
            System.out.print(dq.remove() + " ");
        }
    }

}

