import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        int n, temp;
        int[] a = new int[20];
        Scanner s = new Scanner(System.in);

        System.out.print("Enter total number of elements (max 20): ");
        n = s.nextInt();

        if (n > 20 || n <= 0) {
            System.out.println("Please enter a valid number of elements (1-20).");
            s.close();
            return;
        }

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("The sorted elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        s.close();
    }
}
