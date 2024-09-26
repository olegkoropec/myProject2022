package CollectionsTemplate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {

//    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("name of file don't exist");
//        Scanner scanner = new Scanner(file);
//    }

        public static void main(String[] args) {
//        File file1 = new File("name of file1 ");
        File file2 = new File("instance_for_classException");
        try {
//            Scanner scanner = new Scanner(file1);
            Scanner scanner = new Scanner(file2);
            System.out.println("In block try");
        } catch (FileNotFoundException e) {
            System.out.println("This file don't exist ");
        }
            System.out.println("After block try/catch");
    }
}
