public class ArrayBackwardDisplay {
    public static void displayArrayBackward(int[] arr, int start, int end) {
        if (start <= end) {
            System.out.print(arr[end] + " ");
            displayArrayBackward(arr, start, end - 1);
        }
    }
}
