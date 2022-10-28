/*
成绩为100分 奖励一辆BWM
成绩为（80, 99]时，奖励一台iphone xs max
当成绩为[60, 80]时，奖励一个ipad
其他时，什么也没有
请从键盘输入月晓鹏的期末成绩，并加以判断

说明：else结构是可选的。
2.  如果多个条件表达式是互斥关系，即无交集的关系，条件表达式的顺序和先后可自由安排
但如果多个表达式之间有交集的关系，则需要根据实际情况考虑清楚应该将哪个结构声明在上面
通常将范围小的生命在范围大的上面，否则范围小的就没机会运行了
 */
//package com.place;
import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的期末成绩：(0-100)");
        int score = scanner.nextInt();

            if (score == 100) {
                System.out.println("奖励一辆宝马");
            } else if (score <= 99 && score > 80) {
                System.out.println("奖励一个爱拍");
            } else {
                System.out.println("奖励你一🔪");
            }
        }
    }

