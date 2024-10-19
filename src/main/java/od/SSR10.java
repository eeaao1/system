package od;

import java.util.*;

/**
 * 题目描述
 * 给一个字符串和一个二维字符数组，如果该字符串存在于该数组中，则按字符串的字符顺序输出字符串每个字符所在单元格的位置下标字符串，如果找不到返回字符串“N”。
 * <p>
 * 1.需要按照字符串的字符组成顺序搜索，且搜索到的位置必须是相邻单元格，其中“相邻单元格”是指那些水平相邻或垂直相邻的单元格。
 * <p>
 * 2.同一个单元格内的字母不允许被重复使用。
 * <p>
 * 3.假定在数组中最多只存在一个可能的匹配。
 * <p>
 * 输入描述
 * 第1行为一个数字N指示二维数组在后续输入所占的行数。
 * <p>
 * 第2行到第N+1行输入为一个二维大写字符数组，每行字符用半角,分割。
 * <p>
 * 第N+2行为待查找的字符串，由大写字符组成。
 * <p>
 * 二维数组的大小为N*N，0<N<=100。
 * <p>
 * 单词长度K，0<K<1000。
 * <p>
 * 输出描述
 * 输出一个位置下标字符串，拼接格式为：第1个字符行下标+”,”+第1个字符列下标+”,”+第2个字符行下标+”,”+第2个字符列下标… +”,”+第N个字符行下标+”,”+第N个字符列下标。
 * <p>
 * 用例
 * 输入	4
 * A,C,C,F
 * C,D,E,D
 * B,E,S,S
 * F,E,C,A
 * ACCESS
 * 输出	0,0,0,1,0,2,1,2,2,2,2,3
 * 说明	ACCESS分别对应二维数组的[0,0] [0,1] [0,2] [1,2] [2,2] [2,3]下标位置。
 */
public class SSR10 {

    static String res = "";

    public static void main(String[] args) throws Exception {
        char[][] num = new char[4][4];
        num[0] = new char[]{'A', 'C', 'C', 'F'};
        num[1] = new char[]{'C', 'D', 'E', 'D'};
        num[2] = new char[]{'B', 'E', 'S', 'S'};
        num[3] = new char[]{'F', 'E', 'C', 'A'};
        String st = "ACCESS";
        char[][] vist = new char[4][4];
        LinkedList<int[]> res = new LinkedList<>();
        p(num, 0, st.toCharArray(), 0, 0, vist, res);
        for (int[] ii : res) {
            System.out.println(ii[0] + "," + ii[1]);
        }
//        System.out.println(res.substring(1));

    }

    public static boolean p(char[][] map, int currIndex, char[] t, int x, int y, char[][] vist, LinkedList<int[]> res) {
        if (currIndex == t.length) {
            return true;
        }
        if (x < 0 || x == map.length || y < 0 || y == map[0].length || vist[x][y] == 1 || map[x][y] != t[currIndex]) {
            return false;
        }
        res.add(new int[]{x, y});
        currIndex++;
        vist[x][y] = 1;
        boolean p1 = p(map, currIndex, t, x - 1, y, vist, res);
        if (p1) {
            return true;
        }
        boolean p2 = p(map, currIndex, t, x + 1, y, vist, res);
        if (p2) {
            return true;
        }
        boolean p3 = p(map, currIndex, t, x, y - 1, vist, res);
        if (p3) {
            return true;
        }
        boolean p4 = p(map, currIndex, t, x, y + 1, vist, res);
        if (p4) {
            return true;
        }
        res.removeLast();
        vist[x][y] = 0;
        return false;
    }


}


