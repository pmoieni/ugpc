import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckNecklaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = new String[in.nextInt()];
        in.nextLine();

        for (int i = 0; i < input.length; i++) {
            input[i] = in.nextLine();
        }

        in.close();

        for (String s : input) {
            List<String> pair = Arrays.stream(s.split(" ")).map((String str) -> {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                return String.valueOf(chars);
            }).collect(Collectors.toList());

            if (pair.get(0).equals(pair.get(1))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}