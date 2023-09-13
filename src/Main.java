import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length; j++) {
            int n = j;
            int min = array[j];
            for (int k = n + 1; k < array.length; k++) {
                if (array[k] < min) {
                    min = array[k];
                    n = k;
                }
            }
            array[n] = array[j];
            array[j] = min;
        }
        System.out.println(Arrays.toString(array));
    }
}