public class ArrayUtils {
    public static void swape(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class Pair<A, B> {
    A val1;
    B val2;

    public Pair(A val1, B val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public Pair() {
    }

    @Override
    public String toString() {
        return "Pair{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                '}';
    }
}