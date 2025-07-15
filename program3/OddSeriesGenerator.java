    import java.util.Scanner;

public class OddSeriesGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a;
        int num = 1;

        for (int i = 0; i < limit; i++) {
            System.out.print(num + " ");
            num += 2;
        }
    }
}