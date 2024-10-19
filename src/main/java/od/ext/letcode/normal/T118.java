package od.ext.letcode.normal;

import java.util.ArrayList;
import java.util.List;

public class T118 {



    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        ArrayList<Integer> subRes = new ArrayList<>();
        subRes.add(1);
        res.add(subRes);
        if (numRows == 1) {
            return res;
        }
        ArrayList<Integer> subRes1 = new ArrayList<>();
        subRes1.add(1);
        subRes1.add(1);
        res.add(subRes1);
        if (numRows == 2) {
            return res;
        }
        for (int i = 2; i < numRows; i++) {
            ArrayList<Integer> subRes2 = new ArrayList<>();
            subRes2.add(1);
            List<Integer> pre = res.get(i - 1);
            for (int j = 0; j < pre.size() - 1; j++) {
                subRes2.add(pre.get(j) + pre.get(j + 1));
            }
            subRes2.add(1);
            res.add(subRes2);
        }
        return res;
    }
}
