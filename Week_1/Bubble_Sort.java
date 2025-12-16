public class Bubble_Sort {
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 99, 6, 67, 10, 85, 22 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        bubbleSort(arr);
        System.out.println();
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
