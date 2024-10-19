package od;

import java.util.Scanner;
import java.util.Stack;

/**
 * 题目描述
 * 将一个csv格式的数据文件中包含有单元格引用的内容替换为对应单元格内容的实际值。 Comma seprated values（CSV）逗号分隔值，csv格式的数据文件使用逗号作为分隔符将各单位的内容进行分隔。
 * <p>
 * 输入描述
 * 输入只有一行数据，用逗号分隔每个单元格，行尾没有逗号。最多26个单元格，对应编号A-Z。
 * 每个单元格的内容包含字母和数字，以及使用<>分隔的单元格引用，例如：表示引用第一个单元的值。
 * 每个单元格的内容，在替换前和替换后均不超过100个字符。
 * 引用单元格的位置不受限制，运行排在后面的单元格被排在前面的单元格引用。
 * 不存在循环引用的情况，比如下面这种场景是不存在的： A单元格：aCd8u B单元格：kAydzqo
 * 不存在多重<>的情况，一个单元格只能引用一个其他单元格。比如下面这种场景是不存在的： A单元格：aCd8u B单元格：kAydzqo C单元格：y<>d
 * 输出描述
 * 输出所有单元格展开的内容，单元格之间用逗号分隔。处理过程中出现错误时，输出字符串“-1”表示出错。
 * <p>
 * 示例1
 * 输入
 * <p>
 * 1,2<A>00
 * 输出
 * <p>
 * 1，2100
 * 说明 第二个单元中有对A单元的引用，A单元格的值为1，替换时，将A单元的内容替代的位置，并和其他内容合并。
 * <p>
 * 示例2
 * 输入
 *
 * <B>12,1
 * 输出
 * <p>
 * 112，1
 * 说明 第一个单元中有对B单元的引用，B单元格的值为1，替换时，将第二个数据单元的内容替代的位置，并和其他内容合并。
 * <p>
 * 作者：不上岸不改名！
 * 链接：https://www.nowcoder.com/discuss/628538017472344064?sourceSSR=search
 * 来源：牛客网
 */
public class SSR5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Step 1: 将输入字符串按逗号分隔为数组
        String[] cells = input.split(",");

        // Step 2: 遍历每个单元格并进行替换
        for (int i = 0; i < cells.length; i++) {
            cells[i] = replaceReference(cells, cells[i]);
            if (cells[i] == null) {
                System.out.println("-1");
                return;
            }
        }

        // Step 3: 输出结果
        System.out.println(String.join(",", cells));
    }

    // 替换引用单元格内容的函数
    private static String replaceReference(String[] cells, String cellContent) {
        // 查找引用的位置
        int start = cellContent.indexOf('<');
        int end = cellContent.indexOf('>');

        if (start != -1 && end != -1 && end > start) {
            // 获取被引用的单元格编号（A-Z）
            String refCell = cellContent.substring(start + 1, end);
            int refIndex = refCell.charAt(0) - 'A';  // 获取引用单元格的下标

            // 检查引用是否有效
            if (refIndex >= 0 && refIndex < cells.length) {
                // 替换引用的内容
                String refValue = cells[refIndex];
                // 检查被引用单元格中是否有其他引用，避免无限替换
                if (refValue.indexOf('<') != -1) {
                    refValue = replaceReference(cells, refValue);
                    if (refValue == null) {
                        return null;  // 出现循环引用或错误引用
                    }
                }
                // 将引用内容替换到当前单元格中
                return cellContent.substring(0, start) + refValue + cellContent.substring(end + 1);
            } else {
                return null;  // 引用无效，返回null表示出错
            }
        }
        return cellContent;  // 如果没有引用，返回原始内容
    }


}
