package od.ext.niu;

import org.springframework.security.core.parameters.P;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Topu {


    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int) in.nval;
        in.nextToken();
        int m = (int) in.nval;
        ArrayList<ArrayList<Integer>> gs = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            gs.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            in.nextToken();
            int from = (int) in.nval;
            in.nextToken();
            int to = (int) in.nval;
            gs.get(from).add(to);
        }
        int[] insArr = new int[n + 1];
        for (int i = 1; i < gs.size(); i++) {
            ArrayList<Integer> ins = gs.get(i);
            for (int j = 0; j < ins.size(); j++) {
                insArr[ins.get(j)]++;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> cs = new LinkedList<>();
        for (int i = 1; i < insArr.length; i++) {
            if (insArr[i] == 0) {
                cs.add(i);
            }
        }
        while (cs.size() > 0) {
            Integer poll = cs.poll();
            res.add(poll);
            ArrayList<Integer> ins = gs.get(poll);
            for (int j = 0; j < ins.size(); j++) {
                insArr[ins.get(j)]--;
                if (insArr[ins.get(j)] == 0) {
                    cs.add(ins.get(j));
                }
            }
        }
        if (res.size() != n) {
            System.out.print(-1);
            return;
        }
        for (int i = 0; i < res.size() - 1; i++) {
            System.out.print(res.get(i));
            System.out.print(" ");
        }
        System.out.print(res.get(res.size() - 1));
    }
}
