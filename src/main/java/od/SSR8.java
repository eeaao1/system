package od;

import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * 题目描述
 * 一张地图上有n个城市，城市和城市之间有且只有一条道路相连：要么直接相连，要么通过其它城市中转相连（可中转一次或多次）。城市与城市之间的道路都不会成环。
 * <p>
 * 当切断通往某个城市 i 的所有道路后，地图上将分为多个连通的城市群，设该城市i的聚集度为DPi（Degree of Polymerization），DPi = max（城市群1的城市个数，城市群2的城市个数，…城市群m 的城市个数）。
 * <p>
 * 请找出地图上DP值最小的城市（即找到城市j，使得DPj = min(DP1,DP2 … DPn))
 * <p>
 * 提示：如果有多个城市都满足条件，这些城市都要找出来（可能存在多个解）
 * <p>
 * 提示：DPi的计算，可以理解为已知一棵树，删除某个节点后；生成的多个子树，求解多个子数节点数的问题。
 * <p>
 * 输入描述
 * 每个样例：第一行有一个整数N，表示有N个节点。1 <= N <= 1000。
 * <p>
 * 接下来的N-1行每行有两个整数x，y，表示城市x与城市y连接。1 <= x, y <= N
 * <p>
 * 输出描述
 * 输出城市的编号。如果有多个，按照编号升序输出。
 * <p>
 * 用例
 * 输入	5
 * 1 2
 * 2 3
 * 3 4
 * 4 5
 * 输出	3
 * 说明
 * 输入表示的是如下地图：
 * <p>
 * <p>
 * <p>
 * 对于城市3，切断通往3的所有道路后，形成2个城市群[（1，2），（4，5）]，其聚集度分别都是2。DP3 = 2。
 * <p>
 * 对于城市4，切断通往城市4的所有道路后，形成2个城市群[（1，2，3），（5）]，DP4 = max（3，1）= 3。
 * <p>
 * 依次类推，切断其它城市的所有道路后，得到的DP都会大于2，因为城市3就是满足条件的城市，输出是3。
 * <p>
 * 输入	6
 * 1 2
 * 2 3
 * 2 4
 * 3 5
 * 3 6
 * 输出	2 3
 * 说明	将通往2或者3的所有路径切断，最大城市群数量是3，其他任意城市切断后，最大城市群数量都比3大，所以输出2 3
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/630691629656969216?sourceSSR=search
 * 来源：牛客网
 */
public class SSR8 {

    static class UnionFindSet {
        private int[] father; // 存储每个节点的父节点

        public UnionFindSet(int n) { // 初始化并查集，每个节点的父节点为自己
            father = new int[n];
            for (int i = 0; i < n; i++) father[i] = i;
        }

        public int find(int x) { // 查找x的祖先节点，路径压缩优化
            if (father[x] != x) {
                father[x] = find(father[x]);
            }
            return father[x];
        }

        public void unionSet(int x, int y) { // 合并x和y所在的集合
            int x_fa = find(x);
            int y_fa = find(y);

            if (x_fa != y_fa) { // 如果x和y不在同一个集合中，则将y的祖先节点设为x的祖先节点
                father[y_fa] = x_fa;
            }
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] relations = new int[n - 1][2]; // 存储n-1条关系
        for (int i = 0; i < n - 1; i++) { // 输入n-1条关系
            relations[i][0] = sc.nextInt();
            relations[i][1] = sc.nextInt();
        }

        int min_dp = Integer.MAX_VALUE; // 最小的最大连通块大小
        List<Integer> city = new ArrayList<>(); // 最小的最大连通块所在的城市

        for (int i = 1; i <= n; i++) { // 枚举每个城市作为特殊城市
            UnionFindSet ufs = new UnionFindSet(n + 1); // 初始化并查集
            for (int[] relation : relations) { // 将与特殊城市相连的边删除
                int x = relation[0], y = relation[1];
                if (x == i || y == i) continue;
                ufs.unionSet(x, y);
            }

            Map<Integer, Integer> count = new HashMap<>(); // 统计每个连通块的大小
            for (int f : ufs.father) {
                f = ufs.find(f);
                count.put(f, count.getOrDefault(f, 0) + 1);
            }

            int dp = 0; // 最大连通块大小
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                dp = Math.max(dp, entry.getValue());
            }

            if (dp < min_dp) { // 如果当前最大连通块大小比之前的最小值还小，则更新最小值和最小值所在的城市
                min_dp = dp;
                city.clear();
                city.add(i);
            }
            else if (dp == min_dp) { // 如果当前最大连通块大小与之前的最小值相等，则将城市加入最小值所在的城市列表
                city.add(i);
            }
        }

        for (int c : city) { // 输出最小的最大连通块所在的城市
            System.out.print(c + " ");
        }
    }

}


