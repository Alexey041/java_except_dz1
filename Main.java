import java.io.File;

public class Main {
    public static void main(String[] args) {
        
        String strArr[][] = new String[][] {
            { "1", "2", "3" },
            { "1", "2", "3" },
            { "1", "2", "1" }};
        sum2d(strArr);

        taskOne();

    }    

    public static void taskOne() {
        //java.lang.ArrayIndexOutOfBoundsException
        int[] array = new int[4];
        System.out.println(array[11]);

        //java.lang.ClassCastException
        Object object = new Object();
        File file = (File) object;
        

        //java.lang.ArithmeticException
        int a = 0;
        int b = 1;
        int res = b/a;
    }
    
    //Задача 2
    //1 - java.lang.NumberFormatException
    //2 - java.lang.ArrayIndexOutOfBoundsException
    
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static void taskThree(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new ArrayIndexOutOfBoundsException("Размеры массивов не равны");
        }
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }
    }
}
