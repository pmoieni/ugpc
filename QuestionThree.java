import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

// unfinished
public class QuestionThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(in.nextLine().split(" ")).map(cv -> Integer.parseInt(cv))
                .collect(Collectors.toList());

        int totalSets = in.nextInt();

        in.close();

        Set<Integer> numbersSet = new HashSet<>();

        for (int i = 0; i < numbers.size(); i++) {
            numbersSet.add(numbers.get(i));
        }

        List<Set<Integer>> sets = new ArrayList<Set<Integer>>(totalSets);

        for (int i = 0; i < totalSets; i++) {
            sets.add(new HashSet<Integer>());
        }

        for

        System.out.println(sets);
    }
}
