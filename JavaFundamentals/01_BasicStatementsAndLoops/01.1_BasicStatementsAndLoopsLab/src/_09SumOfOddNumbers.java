import java.util.Scanner;

public class _09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(num);
            sum += num;
            num += 2;
        }

        System.out.println("Sum: " + sum);
    }
}
