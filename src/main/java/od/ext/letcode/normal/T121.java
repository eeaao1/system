package od.ext.letcode.normal;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class T121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{5, 4, 3, 2, 1}));
    }

    public static int maxProfit(int[] prices) {
        int res = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>((a, b) -> b - a);

        for (int i = 0; i < prices.length; i++) {
            map.put(prices[i], i);
        }
        for (int i = 0; i < prices.length; i++) {
            for (Map.Entry<Integer, Integer> en : map.entrySet()) {
                if (en.getKey() > prices[i] && en.getValue() > i) {
                    res = Math.max(res, (en.getKey() - prices[i]) );
                }
            }

        }
        return res;
    }
}
