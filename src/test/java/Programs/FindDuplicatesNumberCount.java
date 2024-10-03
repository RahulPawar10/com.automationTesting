package Programs;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesNumberCount {
    public static void main(String[] args) {


        int[] num = {1, 2, 5, 4, 3, 9, 8, 7, 6, 4, 5, 3, 2, 1};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i])) {
                map.put(num[i], map.get(num[i]) + 1);
            } else {
                map.put(num[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + "==" + map.get(key));
            }
        }
    }
}
