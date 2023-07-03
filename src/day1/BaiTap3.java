package day1;
import java.util.Scanner;
public class BaiTap3 {
    public static void main(String[] args) {
        int a ,b,c,d ;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter :");
        a = scanner.nextInt();
        if(a<10&&a>0){
        switch (a){
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            case 4 :
                System.out.println("four");
                break;
            case 5 :
                System.out.println("five");
                break;
            case 6 :
                System.out.println("six");
                break;
            case 7 :
                System.out.println("seven");
                break;
            case 8 :
                System.out.println("eight");
                break;
            case 9 :
                System.out.println("nine");
                break;

        }
    }else if(a>10&&a<20){
          b =a%10;
          switch (b){
              case 1:
                  System.out.println("eleven");
                  break;
              case 2 :
                  System.out.println("twelve");
                  break;
              case 3 :
                  System.out.println("thirteen");
                  break;
              case 4 :
                  System.out.println("fourteen");
                  break;
              case 5 :
                  System.out.println("fifteen");
                  break;
              case 6 :
                  System.out.println("sixteen");
                  break;
              case 7 :
                  System.out.println("seventeen");
                  break;
              case 8 :
                  System.out.println("eighteen");
                  break;
              case 9 :
                  System.out.println("nineteen");
                  break;

          }
        }


        }
    }


