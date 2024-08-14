import java.util.Scanner;

public class MyExample {
    public static void main(String[] args) {
        int weight;
        int price;
        int coast;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight");
        weight = scanner.nextInt();
        System.out.println("Enter price");
        price = scanner.nextInt();
        coast = weight * price;
        System.out.println(coast);

    }
}
