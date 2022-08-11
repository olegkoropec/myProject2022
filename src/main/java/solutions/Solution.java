package solutions;

import java.util.*;

public class Solution {

    void stringArr(String [] str){
        int[] number = new int[str.length];
        Map<Integer, String> myString = new HashMap<>();
        Map<Character, Integer> mymap = new HashMap<>();
        mymap.put('a', 100);
        mymap.put('b', 200);
        mymap.put('c', 300);
        mymap.put('d', 400);
        mymap.put('e', 500);
        mymap.put('f', 600);
        mymap.put('g', 700);
        mymap.put('h', 800);
        mymap.put('i', 900);
        mymap.put('j', 10);
        mymap.put('k', 20);
        mymap.put('l', 30);
        mymap.put('m', 40);
        mymap.put('n', 50);
        mymap.put('o', 60);
        mymap.put('p', 70);
        mymap.put('q', 80);
        mymap.put('r', 90);
        mymap.put('s', 1);
        mymap.put('t', 2);
        mymap.put('u', 3);
        mymap.put('v', 4);
        mymap.put('w', 5);
        mymap.put('x', 6);
        mymap.put('y', 7);
        mymap.put('z', 8);
        mymap.put(' ', 1000);
        for (int i = 0; i < str.length; i ++){
            int number1 = 0;
            for (int j = 0; j < str[i].length(); j ++){
                str[i].charAt(j);
                mymap.get(str[i].charAt(j));
                number1 = number1 + mymap.get(str[i].charAt(j));
                System.out.print(str[i].charAt(j) + "=" + mymap.get(str[i].charAt(j)) + "  ");
            }
            number[i] = number1;
            myString.put(number[i], str[i]);
            System.out.print(str[i] + "=" + number[i]);
            System.out.println();
        }
        for (int k = 0; k < str.length; k++){
            if (myString.containsKey(str[k])){
                myString.get(str[k]);
                System.out.println(myString.get(str[k]));
            }
        }
        System.out.println(myString);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String [] str = {"tea", "eat", "ate", "sto", "ost", "kto"};
        sol.stringArr(str);
//		sol.mychar();

    }
}
