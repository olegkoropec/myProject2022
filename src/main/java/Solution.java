import java.util.*;

class Solution {
    //    public int calculate(String s) {
    public void calculate(String s) {
        Queue<Integer> integerQueueInteger = new LinkedList<>();
        Queue<Character> integerQueueSign = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            }
        }
        System.out.println(sb);
        int integer = 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch != '-' && ch != '+' && ch != '/' && ch != '*'){
                integer = integer * 10 + Integer.parseInt(Character.toString(ch));
            }
            else{
                if (integerQueueInteger.size() == 0 && integerQueueSign.size() == 0){
                    integerQueueSign.add(ch);
                    integerQueueInteger.add(integer);
                    integer = 0;
                    System.out.println(i +" "+ ch);
                }
                else if (integerQueueSign.peek() == '/'){
                    integer = integerQueueInteger.peek()/integer;
                    integerQueueInteger.add(integer);
                    integerQueueSign.add(ch);
                    integer = 0;
                    System.out.println(i +" "+ ch);
                }
                else if (integerQueueSign.peek() == '*'){
                    integer = integerQueueInteger.peek()*integer;
                    integerQueueInteger.add(integer);
                    integerQueueSign.add(ch);
                    System.out.println(i +" "+ ch);
                    integer = 0;
                }
                else if (integerQueueSign.peek() == '-'){
                    integerQueueInteger.add(-integer);
                    integerQueueSign.add(ch);
                    integer = 0;
                    System.out.println(i +" "+ ch);
                }
                else if (integerQueueSign.peek() == '+'){
                    integerQueueInteger.add(integer);
                    integerQueueSign.add(ch);
                    integer = 0;
                    System.out.println(i +" "+ ch);
                }
                else {
                    integerQueueInteger.add(integer);
                }
            }
        }
        System.out.println(integerQueueInteger);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = "   120 -  35+ 420/60  -20";
        System.out.println(string);
        solution.calculate(string);
    }
}