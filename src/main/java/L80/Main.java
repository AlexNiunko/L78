package L80;

public class Main {
    public static void main(String[] args) {
        Func func;
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;

        func = (array1, number1) -> {
            for (int i = 0; i < array1.length; i++)
                if (array1[i] == number1)
                    return true;
            return false;
        };
        boolean a=func.ifInArray(array,number);
        System.out.println(a);
    }
}
