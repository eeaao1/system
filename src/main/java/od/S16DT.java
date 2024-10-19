package od;

/**
 * 题目描述
 * 2020年题：
 * <p>
 * 英雄联盟是一款十分火热的对战类游戏。每一场对战有10位玩家参与，分为两组，每组5人。每位玩家都有一个战斗力，代表着这位玩家的厉害程度。为了对战尽可能精彩，我们需要把玩家们分为实力尽量相等的两组。一组的实力可以表示为这一组5位玩家的战斗力和。现在，给你10位玩家的战斗力，请你把他们分为实力尽量相等的两组。请你输出这两组的实力差。
 * <p>
 * 2023年题：
 * <p>
 * 部门准备举办一场王者荣耀表演赛，有10名游戏爱好者参与，分5为两队，每队5人。每位参与者都有一个评分，代表着他的游戏水平。为了表演赛尽可能精彩，我们需要把10名参赛者分为实力尽量相近的两队。一队的实力可以表示为这一队5名队员的评分总和。现在给你10名参与者的游戏水平评分，请你根据上述要求分队最后输出这两组的实力差绝对值。例: 10名参赛者的评分分别为5 1 8 3 4 6 710 9 2，分组为 (135 8 10) (24 679)，两组实力差最小，差值为1。有多种分法，但实力差的绝对值最小为1。
 * <p>
 * 输入描述
 * 10个整数，表示10名参与者的游戏水平评分。范围在[1,10000]之间
 * <p>
 * 输出描述
 * 1个整数，表示分组后两组实力差绝对值的最小值.
 * <p>
 * 用例1
 * 输入：
 * <p>
 * 1 2 3 4 5 6 7 8 9 10
 * <p>
 * 输出：
 * <p>
 * 1
 * <p>
 * 说明：
 * <p>
 * 10名队员分成两组，两组实力差绝对值最小为1.
 * <p>
 * <p>
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/604987850223808512?sourceSSR=search
 * 来源：牛客网
 */
public class S16DT {
    static int totalSum;
    static int min;

    public static void main(String[] args) {

//        String[] s1 = "1 2 3 4 5 6 7 8 9 10".split(" ");
        String[] s1 = "1 1 1 1 1 999 999 999 999 1".split(" ");
        int[] s = new int[s1.length];
        int sum = 0;
        for (int i = 0; i < s1.length; i++) {
            Integer integer = Integer.valueOf(s1[i]);
            sum += integer;
            s[i] = integer;
        }
        totalSum = sum;
        min = sum;
        ss(s, sum / 2, 0, 0, 0);
        System.out.println(min);
    }


    public static void ss(int[] in, int halfSum, int aSum, int currIndex, int acount) {
        if (aSum > halfSum) {
            return;
        }
        if (currIndex == 10) {
            return;
        }

        if (acount == 5) {
            min = Math.min(min, Math.abs(totalSum - aSum - aSum));
            return;
        }
        ss(in, halfSum, aSum + in[currIndex], currIndex + 1, acount + 1);
        ss(in, halfSum, aSum, currIndex + 1, acount);
    }

    public static void dp(int[] in, int halfSum, int aSum, int currIndex, int acount) {
        int[][] dp = new int[in.length][halfSum + 1];
        for (int i = 0; i < dp.length; i++) {
//            for(){
//
//            }
//            // 要第i好人
//            dp[i][in[i]] =
        }

    }

}
