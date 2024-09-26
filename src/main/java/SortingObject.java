import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingObject {

    public static void main(String[] args) {

        int[] intArr = {5,9,1,10};                          // сортируем массив int'ов
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        String[] strArr = {"A", "C", "B", "Z", "E"};        // сортируем массив объектов String
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        List<String> strList = new ArrayList<String>();     // сортируем список объектов классов-оболочек
        strList.add("Aa");
        strList.add("Cc");
        strList.add("Bb");
        strList.add("Zz");
        strList.add("Ee");

        Collections.sort(strList);                           // сортируем список встроенным методов сортировки класса Collections
        for (String str: strList) {
            System.out.print(" " + str);
        }
    }
}
