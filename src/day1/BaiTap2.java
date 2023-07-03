package day1;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        double usd;
        double rate;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter");
        usd =scanner.nextDouble();
        rate =23000*usd;
        System.out.printf("tiền :%.0f",rate);
    }
}
