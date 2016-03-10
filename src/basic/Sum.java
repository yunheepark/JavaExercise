package basic;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        float fSum = 0;

        Scanner scanner = new Scanner(System.in);
        fSum = scanner.nextFloat();
        fSum += scanner.nextFloat();
        fSum += scanner.nextFloat();
        fSum += scanner.nextFloat();
        fSum += scanner.nextFloat();

        System.out.println(fSum / 5);
    }
}
