import java.util.Scanner;
public class twin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            totalSum += a[i];
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        int mySum = 0;
        int coinsCount = 0;
        for (int i = n - 1; i >= 0; i--) {
            mySum += a[i];
            coinsCount++;
            if (mySum > (totalSum - mySum)) {
                break;
            }
        }
        System.out.println(coinsCount);
    }
}
