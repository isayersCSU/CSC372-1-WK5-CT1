import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveMultiplication {

    public static void main(String[] args) {
        List<Integer> resultList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            if (resultList.isEmpty()) {
                System.out.print("Enter number 1: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter number 2: ");
                int num2 = scanner.nextInt();
                resultList.add(num1);
                resultList.add(num2);
            } else if (resultList.size() == 1) {
                System.out.print("Enter number: ");
                int num = scanner.nextInt();
                resultList.add(num);
            }

            int product = 1;
            for (int num : resultList) {
                product *= num;
            }
            resultList.clear();
            resultList.add(product);
        }

        System.out.println("Final Product: " + resultList.getFirst());
        scanner.close();
    }
}