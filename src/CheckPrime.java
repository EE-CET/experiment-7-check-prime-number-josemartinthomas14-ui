import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n <= 1) {
                System.out.println("Not Prime");
            } else {
                boolean isPrime = true;
                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                System.out.println(isPrime ? "Prime" : "Not Prime");
            }
        }
        scanner.close();
    }
}
