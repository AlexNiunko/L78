package HomeWork;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Func func;
        func=(double a, double b,String sign) -> {
            double x;
            switch (sign){
                case "+":
                   x=a+b;
                   break;
                case "-":
                    x=a-b;
                    break;
                case "/":
                    x=a/b;
                    break;
                case "*":
                    x=a*b;
                    break;
                default:
                    x=Double.MIN_VALUE;
                    break;
            }
           return x;
        };
        Scanner scanner=new Scanner(System.in);
        double a= scanner.nextDouble();
        double b=scanner.nextDouble();
        String sign= scanner.next();
        scanner.close();
        double rez= func.calculator(a,b,sign);
        String rezult=String.format("%.2f",rez);
        System.out.println(rezult);
    }
}
