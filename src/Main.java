import java.util.Scanner;

public class Main {

    /**
     * Calculates the power of a number.
     *
     * @param base  Represents the number.
     * @param power Power applied.
     * @return Power of a number.
     */
    public static int powerFunc(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * powerFunc(base, --power);
    }

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int a = inpt.nextInt();
        int b = inpt.nextInt();
        // printing the value of a^b i.e.,
        System.out.printf("%d", powerFunc(a, b));
    }
}
