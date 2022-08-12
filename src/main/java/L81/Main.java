package L81;
public class Main {
    public static void main(String[] args) {
        String [] arr={"Car","Alex","Newspaper","Underground","Metro"};
        Func func;
        func=(String [] array) -> {
            int max=array[0].length();
            int preMax=array[0].length();
            int indMax=0;
            int indPreMax=0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].length()>max){
                    preMax=max;
                    max=array[i].length();
                    indPreMax=indMax;
                    indMax=i;
                }
            }
            return array[indPreMax];
        };
        String str=func.findMaxLength(arr);
        System.out.println(str);
    }
}
