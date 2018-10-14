package ControllingExecution;

import static java.lang.Integer.parseInt;

/**
 * 描述:
 * 斐波那契数列
 *
 * @author dong
 * @date 2018-10-14 21:26
 */
public class Exercise09 {

    static int fib(int n) {
        if  (n <= 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        // 得到最大值从命令行：
        int n = Integer.parseInt(args[0]);
        if(n < 0) {
            System.out.println("不能使用负数");
            return;
        }
        for(int i = 1; i <= n; i++) {
            System.out.print(fib(i) + ", ");
        }
    }
}
