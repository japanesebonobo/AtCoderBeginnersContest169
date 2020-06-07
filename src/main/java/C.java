import java.math.BigDecimal;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a;
        double b;

        a = scanner.nextLong();
        b = scanner.nextDouble();

        BigDecimal bigA = BigDecimal.valueOf(a);
        BigDecimal bigB = BigDecimal.valueOf(b);

        BigDecimal bigResult = bigA.multiply(bigB);

        BigDecimal roundBigResult = bigResult.setScale(0, BigDecimal.ROUND_DOWN);

        System.out.print(roundBigResult);
    }
}
