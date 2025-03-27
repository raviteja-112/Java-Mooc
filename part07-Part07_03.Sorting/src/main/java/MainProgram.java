
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] num) {
        int small = num[0];
        for (int i : num) {
            if (i < small) {
                small = i;
            }
        }

        return small;
    }

    public static int indexOfSmallest(int[] num) {
        int small = smallest(num);
        int smallIndex = 0;

        for (int index = 0; index < num.length; index++) {
            if (small == num[index]) {
                return index;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int min = table[startIndex];
        int minIndex = startIndex;
        for (int index = startIndex; index < table.length; index++) {
            if (table[index] < min) {
                min = table[index];
                minIndex = index;
            }
        }

        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int buffer = array[index2];
        array[index2] = array[index1];
        array[index1] = buffer;
    }

    public static void sort(int[] array) {
        for (int index = 0; index < array.length; index++) {
            int minIndex = indexOfSmallestFrom(array, index);
            swap(array, index, minIndex);
            System.out.println(Arrays.toString(array));
        }
    }

}
