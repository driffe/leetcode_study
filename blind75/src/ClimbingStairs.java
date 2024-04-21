import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int result = fibo(n+1);
        System.out.println(result);
    }
    public static int fibo(int n) {
        if(n <= 2) {
            return 1;
        } else {
            return (fibo(n-1) + fibo(n-2));
        }
    }
}
