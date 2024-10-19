package od;

import java.util.PriorityQueue;

/**
 * 题目描述
 * 从前有个村庄，村民们喜欢在各种田地上插上小旗子，旗子上标识了各种不同的数字。
 * <p>
 * 某天集体村民决定将覆盖相同数字的最小矩阵形的土地分配给村里做出巨大贡献的村民，请问此次分配土地，做出贡献的村民种最大会分配多大面积?
 * <p>
 * 输入描述
 * 第一行输入 m 和 n，
 * <p>
 * m 代表村子的土地的长
 * n 代表土地的宽
 * 第二行开始输入地图上的具体标识
 * <p>
 * 输出描述
 * 此次分配土地，做出贡献的村民种最大会分配多大面积
 * <p>
 * 备注
 * 旗子上的数字为1~500，土地边长不超过500
 * <p>
 * 未插旗子的土地用0标识
 * <p>
 * 用例1
 * 输入
 * <p>
 * 3 3
 * 1 0 1
 * 0 0 0
 * 0 1 0
 * <p>
 * 输出
 * <p>
 * 9
 * <p>
 * 说明
 * <p>
 * 土地上的旗子为1，其坐标分别为(0,0)，(2,1)以及(0,2)，为了覆盖所有旗子，矩阵需要覆盖的横坐标为0和2，纵坐标为0和2，所以面积为9，即（2-0+1）*（2-0+1）= 9
 * <p>
 * 用例2
 * 输入
 * <p>
 * 3 3
 * 1 0 2
 * 0 0 0
 * 0 3 4
 * <p>
 * 输出
 * <p>
 * 1
 * <p>
 * 说明
 * <p>
 * 由于不存在成对的小旗子，故而返回1，即一块土地的面积。
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/610145256348135424?sourceSSR=search
 * 来源：牛客网
 */
public class S25 {

//    public static void main(String[] args) {
//        System.out.println(ss(17));
//    }

    public static void ss(int n, int m) {
        int[][] x = new int[n][];
        int[][] y = new int[m][];
        int s = 0;
        int[] a = {1, 0, 1};
        for (int yy = 0; yy < m; yy++) {
            x[a[yy]][0] = Math.max(1,x[a[yy]][0]);
            x[a[yy]][1] = Math.max(1,x[a[yy]][1]);;
            y[a[yy]][0] = yy + 1;
            y[a[yy]][1] = yy + 1;
        }
        int[] a1 = {0, 0, 0};
        for (int yy = 0; yy < m; yy++) {
            x[a1[yy]][0] = 0;
            y[a1[yy]][0] = yy;
        }
        int[] a2 = {0, 1, 0};
        for (int yy = 0; yy < m; yy++) {
            x[a2[yy]][0] = 0;
            y[a2[yy]][0] = yy;
        }
    }
}
