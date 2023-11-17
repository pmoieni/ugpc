import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        if ((n) % 4 == 0) {
            System.out.print(-1 * ((n / 4)) + " " + (n / 4));
        } else if ((n + 1) % 4 == 0) {
            System.out.print(((n + 1) / 4) + " " + ((n + 1) / 4));
        } else if ((n - 2) % 4 == 0) {
            System.out.print((((n - 2) / 4) + 1) + " " + (-1 * ((n - 2) / 4)));
        } else if ((n - 1) % 4 == 0) {
            System.out.print(-1 * ((n - 1) / 4) + " " + (-1 * ((n - 1) / 4)));
        }
    }
}
