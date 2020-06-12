import java.util.Scanner;

public class _02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGradeInWords(grade);
    }

    static void printGradeInWords(double grade) {
        String result = "";

        if (grade >= 2.00 && grade <= 2.99) {
            result = "Fail";
        } else if (grade >= 3.00 && grade <= 4.39) {
            result = "Poor";
        } else if (grade >= 3.50 && grade <= 4.49) {
            result = "Good";
        } else if (grade >= 4.50 && grade <= 5.49) {
            result = "Very good";
        } else if (grade >= 5.50 && grade <= 6.00) {
            result = "Excellent";
        } else {
            result = "Wrong grade";
        }

        System.out.println(result);
    }
}
