package od.ext.letcode.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T22 {
    public static void main(String[] args) {
        generateParenthesis(3);
    }

    public static List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        p(n, 0, "", res);
        return res;
    }

    public static void p(int index, int n, String curr, ArrayList<String> res) {
        if (n < 0 || n > index || index < 0) {
            return;
        }
        if (index == 0 && n == 0) {
            res.add(curr);
            return;
        }
        p(index - 1, n - 1, curr + ")", res);
        p(index, n + 1, curr + "(", res);
    }
}
//