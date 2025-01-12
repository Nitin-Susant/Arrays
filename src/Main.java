import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("DSA Journy Start from Here");

//        Remove Even Integers from an Array
//        method1_1();
//        method1_2();


    }

    //  Remove Even Integers from an Array
    public static void method1_1() {
        int arr[] = {1, 2, 4, 5, 10, 6, 3};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) count++;
        }
        int arrOdd[] = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) arrOdd[index++] = arr[i];
        }
        System.out.println(Arrays.toString(arrOdd));
    }

    //  Remove Even Integers from an Array
    public static void method1_2() {
        int arr[] = {1, 2, 4, 5, 10, 6, 3};
        int i = 0, j = 0;
        int n = arr.length;
        while (i < n) {
            if (arr[i] % 2 != 0) {
                ArrayUtils.swape(arr, i, j);
                j++;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }

}