package basic;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        float fSum = 0;
        int iNum = 0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            fSum += scanner.nextFloat();
            iNum++;
        }

        System.out.println(fSum / iNum);
    }
}
