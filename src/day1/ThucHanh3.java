package day1;
import java.util.Scanner;

public class ThucHanh3 {
    public static void main(String[] args) {
        float width ;
        float height ;
Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Width: ");
        width =scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Nhập chiều dài
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
