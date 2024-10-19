package od.ext.letcode.normal;

import od.ext.letcode.tree.T8;

import java.util.HashMap;

public class T1124 {
    public static void main(String[] args) {
        longestWPI(new int[]{6, 6, 9});
    }


    public static int longestWPI(int[] hours) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = hours[0] > 8 ? 1 : 0;
        map.put(hours[0] > 8 ? 1 : -1, 0);
        int sum = hours[0] > 8 ? 1 : -1;
        for (int i = 1; i < hours.length; i++) {
            sum += hours[i] > 8 ? 1 : -1;
            if (sum > 0) {
                max = Math.max(max, i + 1);
            } else if (map.containsKey(sum - 1)) {
                max = Math.max(max, i - map.get(sum - 1));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max;
    }

    public int longestWPI1(int[] hours) {
        int[] r = new int[hours.length];
        int max = 0;
        r[0] = hours[0] > 8 ? 1 : -1;
        if (r[0] > 0) {
            max = 1;
        }
        for (int i = 1; i < hours.length; i++) {
            r[i] = (hours[i] > 8 ? 1 : -1) + r[i - 1];
            if (r[i] > 0) {
                max = Math.max(max, i + 1);
            } else {
                for (int j = 0; j < i; j++) {
                    if (r[i] - r[j] > 0) {
                        max = Math.max(max, i - j);
                        break;
                    }
                }
            }
        }
        return max;
    }
}
