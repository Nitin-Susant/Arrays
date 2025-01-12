import java.security.KeyPair;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("DSA Journy Start from Here");

//        Remove Even Integers from an Array
//        method1_1();
//        method1_2();

//        Merge Two Sorted Arrays
//        method2_1();

//        Find Two Numbers that Add up to "n"
//        method3_1();

//        First Non-Repeating Integer in an Array
//        method4_1();
//        method4_2();

//        Find the Smallest Common Number
//        method5_1();
    }

    private static void method5_1() {
        int arr1[] = {6,7,10,25,30,63,64};
        int arr2[] = {0,4,5,6,7,8,50};
        int arr3[] = {1,6,10,14};
        int i=0,j=0,k=0;
        int ans =-1;
        while (i<arr1.length && j < arr2.length && k < arr3.length){

            while (arr1[i]<arr2[j] && arr1[i]<arr3[k]){
                i++;
            }

            while (arr2[j]<arr1[i] && arr2[j]<arr3[k]){
                j++;
            }
            while (arr3[k]<arr1[i] && arr3[k]<arr2[j]){
                k++;
            }
            if (arr1[i]==arr2[j] && arr3[k]==arr2[j]){
                ans = arr3[k];
                break;
            }
        }
        System.out.println(ans);
    }

    public static void method4_2() {
        int arr[] = {1, 7, -2, -5, -1, 9};
        int arr1[] = {0, 0, 0, 0, 0, 0};
        arr1[0] = arr[0];
        int sum = 1;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (sum <= 0) {
                sum = 0;
            }
            if (sum > arr1[i - 1]) {
                arr1[i] = sum;
            } else {
                arr1[i] = arr1[i - 1];
            }

        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void method4_1() {
        int arr[] = {1, 7, -2, -5, 10, -1};
        int sum = 0, globlemax = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum <= 0) {
                sum = 0;
            }
            globlemax = Math.max(sum, globlemax);
        }
        System.out.println(globlemax);
    }

    public static void method3_1() {
        int arr[] = {1, 21, 3, 14, 5, 60, 7, 6};
        int value = 27;
        List<Pair<Integer, Integer>> list = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int tofind = value - arr[i];
            if (set.contains(tofind)) {
                Pair<Integer, Integer> p = new Pair<>(arr[i], tofind);
                list.add(p);
            }
            set.add(arr[i]);
        }
        System.out.println(list);
    }


    public static void method2_1() {
        int arr1[] = {1, 3, 4, 5};
        int arr2[] = {2, 6, 7, 8, 9};
        int i = 0, j = 0, index = 0;
        int arr1n = arr1.length, arr2n = arr2.length;
        int result[] = new int[arr1n + arr2n];
        while (i < arr1n && j < arr2n) {
            int val1 = arr1[i];
            int val2 = arr2[j];
            if (val1 < val2) {
                result[index++] = val1;
                i++;
            } else if (val2 < val1) {
                result[index++] = val2;
                j++;
            } else {
                result[index++] = val1;
                result[index++] = val2;
                i++;
                j++;
            }

        }
        while (i < arr1n) {
            result[index++] = arr1[i];
            i++;
        }
        while (j < arr2n) {
            result[index++] = arr2[j];
            j++;
        }
        System.out.println(Arrays.toString(result));

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