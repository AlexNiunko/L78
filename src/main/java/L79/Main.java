package L79;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=0;
        Oper oper=(int x,int y) -> {
            System.out.println(x+y);
            System.out.println(a);
        };
        Scanner scanner=new Scanner(System.in);
        int x,y;
        x= scanner.nextInt();
        y= scanner.nextInt();
        oper.calculator(x,y);
    }
}
