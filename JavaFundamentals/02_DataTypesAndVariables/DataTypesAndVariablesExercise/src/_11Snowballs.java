import java.util.Scanner;

public class _11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        int highestSnowballSnow = Integer.MIN_VALUE;
        int highestSnowballTime = Integer.MIN_VALUE;
        int highestSnowballQuality = Integer.MIN_VALUE;
        double highestSnowballValue = Double.MIN_VALUE;

        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue >= highestSnowballValue) {
                highestSnowballSnow = snowballSnow;
                highestSnowballTime = snowballTime;
                highestSnowballQuality = snowballQuality;
                highestSnowballValue = snowballValue;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)",
                highestSnowballSnow,
                highestSnowballTime,
                highestSnowballValue,
                highestSnowballQuality);
    }
}