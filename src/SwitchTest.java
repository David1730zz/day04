/*
对学生成绩大于60分的输出合格，低于60分的，输出不合格
 */
import java.util.Scanner;
class SwitchTest {
    public static void main(String[] args) {
        int score, temp;


        System.out.println("请输入你的成绩");
        Scanner student = new Scanner(System.in);
        score = student.nextInt();
        if (score > 60 && score <= 100) {
            temp = 1;
        } else if (score < 60 && score > 0) {
            temp = 0;
        } else {
            temp = -1;
        }
        switch (temp) {
            case 1:
                System.out.println("你是真的厉害啊！");
                break;
            case 0:
                System.out.println("你在考什么东西，今天回家不许吃饭！");
                break;
            case -1:
                System.out.println("你在输入什么东西，眼睛不想要了扔出去");
                break;

        }

    }
}
