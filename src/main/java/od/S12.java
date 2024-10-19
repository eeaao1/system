package od;

/**
 * 题目描述
 * 在一个大型体育场内举办了一场大型活动，由于疫情防控的需要，要求每位观众的必须间隔至少一个空位才允许落座。现在给出一排观众座位分布图，座位中存在已落座的观众，请计算出，在不移动现有观众座位的情况下，最多还能坐下多少名观众。
 * <p>
 * 输入描述
 * 一个数组，用来标识某一排座位中，每个座位是否已经坐人。0表示该座位没有坐人，1表示该座位已经坐人。
 * <p>
 * 输出描述
 * 整数，在不移动现有观众座位的情况下，最多还能坐下多少名观众。
 * <p>
 * 示例1
 * 输入：
 * 10001
 * <p>
 * 输出：
 * 1
 * 示例2
 * 输入：
 * 0101
 * <p>
 * 输出：
 * 0
 * 备注
 * <p>
 * 1 <= 数组长度 <= 10000
 */
public class S12 {
    public static void main(String[] args) {
        int[] s = {0, 1, 0, 1};
//        System.ou1t.println("123".substring("123".indexOf("2")));
        ss(s);
    }


    public static void ss(int[] in) {
        int s = 0;
        boolean f = false;
        int rs = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0 && !f) {
                s = i;
                f = true;
            } else if (in[i] == 1 && f) {
                f = false;
                int z = i - s - 2;
                if (s == 0 || i == in.length - 1) {
                    z += 1;
                }
                int r1 = z % 2;
                int r2 = z / 2;
                rs += r1 + r2 > 0 ? 1 : 0;
            }
        }
        System.out.println(rs);
    }
}
