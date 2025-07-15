import java.util.Scanner;

public class OddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        int count = 0, num = 1;
        while (count < a) {
            System.out.print(num + " ");
            num += 2;
            count++;
        }
    }
}