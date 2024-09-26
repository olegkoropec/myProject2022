package CollectionsTemplate;

import java.util.Scanner;

public class Exception2 {
    // Робимо свій клас винятків та прописуємо що виняток буде прописувати у сповіщенні після запуску програми
    public static void main(String[] args) throws ScannerException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        while (true) {
            int x = scanner.nextInt();
            if (x != 0) {
                throw new ScannerException("Number no equals 0");
            }
            System.out.println("You enter number: " + x);
        }
    }
}

class ScannerException extends Exception {
    public ScannerException(String massage) {
        super(massage);
    }
}


