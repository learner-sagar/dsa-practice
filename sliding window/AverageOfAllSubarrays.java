import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class AverageOfAllSubarrays {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println(findAverage(list, 3));
    }

    public static List<Double> findAverage(List<Integer> nums, int k) {
        List<Double> result = new ArrayList<>();
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums.get(i);
        }
        result.add(sum / k);

        for (int i = 0; i < nums.size() - k; i++) {
            sum += nums.get(i + k) - nums.get(i);
            result.add(sum / k);
        }

        return result;
    }
}