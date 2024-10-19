package od;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 华为OD机试统一考试D卷C卷 - 开源项目热度榜单
 题目描述
 某个开源社区希望将最近热度比较高的开源项目出一个榜单，推荐给社区里面的开发者。对于每个开源项目，开发者可以进行关注(watch)、收藏(star)、fork、提issue、提交合并请求(MR)等。

 数据库里面统计了每个开源项目关注、收藏、fork、issue、MR的数量，开源项目的热度根据这5个维度的加权求和进行排序。

 H = (Wwatch * #watch) + (Wstar * #star) + (Wfork * #fork) +  (Wissue * #issue) + (Wmr * #mr)

 H表示热度值

 Wwatch、Wstar、Wfork、Wissue、Wmr分别表示5个统计维度的权重。

 #watch、#star、#fork、#issue、#mr分别表示5个统计维度的统计值。

 榜单按照热度值降序排序，对于热度值相等的，按照项目名字转换为全小写字母后的字典序排序（'a','b','c',...,'x','y','z')。

 输入描述
 第一行输入为N，表示开源项目的个数，0 ＜ N ＜100。

 第二行输入为权重值列表，一共 5 个整型值，分别对应关注、收藏、fork、issue、MR的权重，权重取值 0 < W ≤ 50。

 第三行开始接下来的 N 行为开源项目的统计维度，每一行的格式为：

 name nr_watch nr_start nr_fork nr_issue nr_mr

 其中 name 为开源项目的名字，由英文字母组成，长度 ≤ 50，其余 5 个整型值分别为该开源项目关注、收藏、fork、issue、MR的数量，数量取值 0 < nr ≤ 1000。

 输出描述
 按照热度降序，输出开源项目的名字，对于热度值相等的，按照项目名字转换为全小写后的字典序排序（'a' > 'b' > 'c' > ... > 'x' > 'y' > 'z'）。

 用例1
 输入

 4
 8 6 2 8 6
 camila 66 70 46 158 80
 victoria 94 76 86 189 211
 anthony 29 17 83 21 48
 emily 53 97 1 19 218

 输出

 victoria
 camila
 emily
 anthony

 作者：不上岸不改名！
 链接：https://www.nowcoder.com/discuss/607209031869952000?sourceSSR=search
 来源：牛客网
 */
public class S22 {

//    public static void main(String[] args) {
//        System.out.println(ss(17));
//    }

    public static void ss(int s) {
        int[] q ={8 ,6 ,2 ,8 ,6};
        String[][] t = new String[4][6];
//        t[0][] = {"camila" ,"66" ,"70" ,"46" ,"158", "80"};
//        TreeMap<Integer, TreeSet> map = new TreeMap<>();
//        for(){
//
//        }
        // 通过TreeMap<Integer,TreeSet<Integer>> 排序
    }
}
