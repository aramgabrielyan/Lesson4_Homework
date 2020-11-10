public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {25, 1, 12, 124, 36, 10, 9, 325, 0, 45};
        for (int number : array) {
            System.out.print(number + " ");
        }
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        System.out.println();
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}

