package od.ext.letcode.normal;

import java.util.*;
import java.util.stream.Collectors;

public class T745 {

    public static void main(String[] args) {
        String[] ss = new String[10000];
        Arrays.fill(ss, "c");
        ss[9990] = "i";
        ss[4089] = "i";
//        WordFilter wordFilter = new WordFilter(ss);
//        System.out.println(wordFilter.f("i", "i"));
    }

     class WordFilter {
         class Node {
            ArrayList<Integer> indies;
            HashMap<Character, Node> nexts;

            public Node() {
                this.nexts = new HashMap<>();
                this.indies = new ArrayList<>();
            }
        }

         Node node = new Node();
         Node nodeR = new Node();

        public WordFilter(String[] words) {


            for (int i = 0; i < words.length; i++) {
                node.indies.add(i);
                Node cur = node;
                char[] ws = words[i].toCharArray();
                for (char c : ws) {
                    if (cur.nexts.containsKey(c)) {
                        cur = cur.nexts.get(c);
                    } else {
                        Node n = new Node();
                        cur.nexts.put(c, n);
                        cur = n;
                    }
                    cur.indies.add(i);
                }

                nodeR.indies.add(i);
                Node curR = nodeR;
                for (int j = ws.length - 1; j > -1; j--) {
                    if (curR.nexts.containsKey(ws[j])) {
                        curR = curR.nexts.get(ws[j]);
                    } else {
                        Node n = new Node();
                        curR.nexts.put(ws[j], n);
                        curR = n;
                    }
                    curR.indies.add(i);
                }
            }
        }

        public  int f(String pref, String suff) {
            char[] pcs = pref.toCharArray();
            Node cur = node;
            for (int j = 0; j < pcs.length; j++) {
                if (cur.nexts.containsKey(pcs[j])) {
                    cur = cur.nexts.get(pcs[j]);
                } else {
                    return -1;
                }
            }
            char[] scs = suff.toCharArray();
            Node curR = nodeR;
            for (int j = scs.length - 1; j > -1; j--) {
                if (curR.nexts.containsKey(scs[j])) {
                    curR = curR.nexts.get(scs[j]);
                } else {
                    return -1;
                }
            }
            ArrayList<Integer> preList = cur.indies;
            ArrayList<Integer> sufList = curR.indies;
            ArrayList<Integer> small = preList.size() <= sufList.size() ? preList : sufList;
            ArrayList<Integer> big = small == preList ? sufList : preList;
            for (int i = small.size() - 1; i >= 0; i--) {
                if (bs(big, small.get(i))) {
                    return small.get(i);
                }
            }

//            if (cur.i.size() > curR.i.size()) {
//                List<Integer> collect = curR.i.stream().sorted().collect(Collectors.toList());
//                for (int j = collect.size() - 1; j > -1; j--) {
//                    if (cur.i.contains(collect.get(j))) {
//                        return collect.get(j);
//                    }
//                }
//            } else {
//                List<Integer> collect = cur.i.stream().sorted().collect(Collectors.toList());
//                for (int j = collect.size() - 1; j > -1; j--) {
//                    if (curR.i.contains(collect.get(j))) {
//                        return collect.get(j);
//                    }
//                }
//            }
            return -1;
        }
        private boolean bs(ArrayList<Integer> sorted, int num) {
            int l = 0;
            int r = sorted.size() - 1;
            int m = 0;
            int midValue = 0;
            while (l <= r) {
                m = (l + r) / 2;
                midValue = sorted.get(m);
                if (midValue == num) {
                    return true;
                } else if (midValue < num) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            return false;
        }

    }


}
