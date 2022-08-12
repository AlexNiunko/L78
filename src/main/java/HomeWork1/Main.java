package HomeWork1;

public class Main {
    public static void main(String[] args) {
        int [] arr={3,56,7,8,90,23,4};
        Func func=(int [] arr1) ->{
            int max=arr1[0];
            int preMax=arr1[0];
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]>max){
                    preMax=max;
                    max=arr1[i];
                }
            }
            return preMax;
        } ;
        System.out.println(func.secMax(arr));
    }
}
