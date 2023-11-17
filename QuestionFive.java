import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestionFive {
    public static List<Integer> getMin(List<Integer> counts, int toRemove) {
        List<Integer> copy = counts.stream().collect(Collectors.toList());
        for (int i = 0; i < toRemove; i++) {
            copy.remove(Collections.max(copy));
        }

        return copy;
    }

    public static List<Integer> getMax(List<Integer> counts, int toRemove) {
        List<Integer> copy = counts.stream().collect(Collectors.toList());
        for (int i = 0; i < toRemove; i++) {
            copy.remove(Collections.min(copy));
        }

        return copy;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String JSONLine = in.nextLine().toString();
        int toRemove = Integer.valueOf(in.nextLine());
        in.close();

        String[] valuesUnparsed = JSONLine.substring(1, JSONLine.length() - 1).split(", ");

        Map<String, Integer> parsed = new LinkedHashMap<>();
        for (String str : valuesUnparsed) {
            String[] parts = str.split(":");
            parsed.put(parts[0].substring(1, parts[0].length() - 1), Integer.valueOf(parts[1]));
        }

        List<Integer> counts = parsed.values().stream().collect(Collectors.toList());

        System.out.println(counts);
        System.out.println(getMax(counts, toRemove));
        System.out.println(getMin(counts, toRemove));
    }
}
