package od.ext.letcode.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class T743 {
    public static void main(String[] args) {
        int[][] t = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        System.out.println(networkDelayTime(t, 4, 2));
        ;
    }


    public static int networkDelayTime(int[][] times, int n, int k) {
        int max = 0;
        int inT = 0;
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList());
        }
        for (int i = 0; i < times.length; i++) {
            graph.get(times[i][0]).add(new int[]{times[i][1], times[i][2]});
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        boolean[] ls = new boolean[n + 1];
        heap.add(new int[]{k, 0});
        while (!heap.isEmpty()) {
            int[] cp = heap.poll();
            if (ls[cp[0]]) {
                continue;
            }
            max = Math.max(max, cp[1]);
            ls[cp[0]] = true;
            inT++;
            ArrayList<int[]> roads = graph.get(cp[0]);
            for (int[] dd : roads) {
                if (!ls[dd[0]]) {
                    heap.add(new int[]{dd[0], cp[1] + dd[1]});
                }
            }
        }
        if (inT != n) {
            return -1;
        }
        return max;
    }
}
