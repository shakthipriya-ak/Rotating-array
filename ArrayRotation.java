import java.util.Scanner;
public class ArrayRotation {
    static void leftRotate(int[] array, int d) {
        int n = array.length;
        d = d % n; 
        reverseArray(array, 0, d - 1);
        reverseArray(array, d, n - 1);
        reverseArray(array, 0, n - 1);
    }
    static void rightRotate(int[] array, int d) {
        int n = array.length;
        d = d % n;
        reverseArray(array, 0, n - 1);
        reverseArray(array, 0, d - 1);
        reverseArray(array, d, n - 1);
    }
    static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("size : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of positions to rotate: ");
        int d = scanner.nextInt();
        System.out.println("Array after left rotation:");
        leftRotate(array, d);
        printArray(array);
        System.out.println("elements again:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array after right rotation:");
        rightRotate(array, d);
        printArray(array);
    }
}
