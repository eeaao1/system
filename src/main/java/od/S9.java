package od;

import java.util.*;

/**
 * 题目描述
 * 给定两个整数数组array1、array2，数组元素按升序排列。
 * <p>
 * 假设从array1、array2中分别取出一个元素可构成一对元素，现在需要取出k对元素，并对取出的所有元素求和，计算和的最小值。
 * <p>
 * 注意：两对元素如果对应于array1、array2中的两个下标均相同，则视为同一对元素。
 * <p>
 * 输入描述
 * 输入两行数组array1、array2，每行首个数字为数组大小size(0 < size <= 100);
 * <p>
 * 0 <array1[i] <=1000
 * <p>
 * 0 <array2[i] <= 1000
 * <p>
 * 接下来一行为正整数 k
 * <p>
 * 0 < k <= array1.size() * array2.size()
 * <p>
 * 输出描述
 * 满足要求的最小和
 * <p>
 * 示例1
 * 输入：
 * 3 1 1 2
 * 3 1 2 3
 * 2
 * <p>
 * 输出：
 * 4
 * <p>
 * 说明：
 * 用例中，需要取2对元素
 * 取第一个数组第0个元素与第二个数组第0个元素组成1对元素[1,1];
 * 取第一个数组第1个元素与第二个数组第0个元素组成1对元素[1,1];
 * 求和为1+1+1+1=4，为满足要求的最小和
 */
public class S9 {
    public static void main(String[] args) {
        String n = "3 1 10";
        String m = "3 1 10";
        int[] array1 = Arrays.stream(n.substring(2).split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // 读取第二个数组
        int[] array2 = Arrays.stream(m.substring(2).split(" "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(ss(array1, array2, 3));

    }


    public static int findMinSum(int[] array1, int[] array2, int k) {

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(a[0] + a[1], b[0] + b[1])
        );

        for (int i = 0; i < array1.length; i++) {
            minHeap.offer(new int[]{array1[i], array2[0], 0});
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int[] currentPair = minHeap.poll();
            sum += currentPair[0] + currentPair[1];

            int nextIndex = currentPair[2] + 1;
            if (nextIndex < array2.length) {
                minHeap.offer(new int[]{currentPair[0], array2[nextIndex], nextIndex});
            }
        }

        return sum;
    }

    public static int ss(int[] array1, int[] array2, int k) {
        PriorityQueue<int[]> ss =  new PriorityQueue<>((a,b)->
           Integer.compare(a[0] + a[1] ,b[0] + b[1])
       );


        for (int i=0;i<array1.length;i++){
            ss.offer(new int[]{array1[i],array2[0],0});
        }
        int sum=0;
        for (int i=0;i<k;i++){
            int[] poll = ss.poll();
            sum += poll[0] + poll[1];
            int ci = poll[2] + 1;
            if (ci < array2.length){
                ss.offer(new int[]{poll[0],array2[ci],ci});
            }

        }
        return sum;
    }
}
