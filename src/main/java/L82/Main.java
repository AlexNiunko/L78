package L82;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        str= scanner.nextLine();
        scanner.close();
        Func func;
        func = (String str1 )->{
            if (str1.charAt(0)>=65 && str1.charAt(0)<=90 )
                return true;
            return false;
        };
        System.out.println(func.isBigLetter(str));
    }
}
