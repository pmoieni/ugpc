import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestionTwo {

    public static int minNoCoins(List<Integer> coins, int totalCoins, int price) {
        int dp[] = new int[price + 1];
        dp[0] = 0;

        for (int j = 1; j <= price; j++) {
            dp[j] = Integer.MAX_VALUE;
        }

        for (int j = 1; j <= price; j++) {
            for (int i = 0; i < totalCoins; i++) {
                if (coins.get(i) <= j) {
                    int subRes = dp[j - coins.get(i)];

                    if (subRes != Integer.MAX_VALUE && subRes + 1 < dp[j]) {
                        dp[j] = subRes + 1;
                    }
                }
            }
        }

        if (dp[price] == Integer.MAX_VALUE) {
            return -1;
        }

        return dp[price];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int price = Integer.valueOf(in.nextLine());
        List<Integer> coins = Arrays.stream(in.nextLine().split(" ")).map(cv -> Integer.parseInt(cv))
                .collect(Collectors.toList());

        Collections.sort(coins);

        in.close();

        HashMap<Integer, Integer> maxDivisions = new HashMap<>();
        for (Integer coin : coins) {
            maxDivisions.put(coin, Math.abs(price / coin));
        }

        System.out.println(minNoCoins(coins, coins.size(), price));
    }
}
