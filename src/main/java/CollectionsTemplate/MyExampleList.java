//ArrayList следует использовать, когда в приоритете доступ по индексу, так как эти операции выполняются за константное время O(1).
//        Добавление в конец списка в среднем тоже выполняется за константное время.
//        Кроме того в ArrayList нет дополнительных расходов на хранение связки между элементами.
//        Минусы в скорости вставки/удаления элементов находящихся не в конце списка,
//               так как при этой операции все элементы правее добавляемого/удаляемого сдвигаются.
//LinkedList удобен когда важнее быстродействие операций вставки/удаления, которые в LinkedList выполняются за константное время.
//        Операции доступа по индексу производятся перебором с начала или конца (смотря что ближе) до нужного элемента.
//        Дополнительные затраты на хранение связки между элементами.
// Одним словом - если часто вставляете/удаляете - выбирайте в пользу LinkedList, в противном случае ArrayList
package CollectionsTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyExampleList {

    public static void main(String[] args) {
        List<List<Integer>> listList1 = new ArrayList<>();  //  ArrayList - это список на основе массива
//        List<List<Integer>> listListL = new LinkedList<>();  //  LinkedList - связанный список на основе элементов и связи между ними
        listList1.add(new ArrayList<>());
        System.out.println(listList1);

        List<List<Integer>> listList = Arrays.asList(Arrays.asList(11, 22, 33), Arrays.asList(44, 55, 66));
        System.out.println(listList);

        List<String> listList2 = Arrays.asList("qaz", "wsx");
        System.out.println(listList2);


        char[] chars = {'q', 'a', 'z'};
        List<char[]> listChar = Arrays.asList(chars);           // перетворення массиву char у List
        System.out.println("listChar: " + listChar.toString());

        int[] integers = {1, 2, 3, 4};
        List<int[]> inter = Arrays.asList(integers);
        System.out.println(inter);

        List<Integer> listInteger = Arrays.asList(1, 2, 3);
        System.out.println("listInteger: " + listInteger);

        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> listString = Arrays.asList(strings);               // перетворення массиву String у List
        System.out.println(listString);
        System.out.println(listString.get(2));
        System.out.println(listString.contains("eat"));
        System.out.println(!listString.contains("qwe"));
//        listString.remove(2);
        System.out.println(listString);

        Iterator <String> iterator = listString.iterator();         // Iterator
        System.out.print("iterator: ");
        while (iterator.hasNext()){
            System.out.print(" " + iterator.next());
        }

        System.out.println();
        System.out.print("for: ");

        for (String s : listString) {
            System.out.print(" " + s);
        }


    }
}
