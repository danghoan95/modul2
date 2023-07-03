package day1;

import java.util.Scanner;

public class ThucHanh7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextFloat();

        System.out.print("Your height (in meter):");
        height = scanner.nextFloat();
        bmi = weight / (height*height);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
