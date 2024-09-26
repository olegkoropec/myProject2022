import java.util.Arrays;

class ArraystoString {
    public static void main(String[] args) {
        int [] integer = new int[2];
        integer[0] = 1;
        integer[1] = 2;
        System.out.println("Integer numbers of array are: " + integer[0] + " " + integer[1]);
        System.out.println( integer);    // виведе I@cc34f4d I це int @cc34f4d адрес масиву у памяті
        System.out.println(Arrays.toString(integer));
        System.out.println("--------------------------------------- ");
        String [] strings = new String[3];
        strings[0] = "Artem";
        strings[1] = "Olesya";
        strings[2] = "Maxim";
        System.out.println(strings);
        System.out.println(Arrays.toString(strings));
    }
}