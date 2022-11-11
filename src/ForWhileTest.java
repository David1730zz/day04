/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序；
不在循环条件限制次数的结构：for(;;)或者while(ture)
结束循环有几种方式？
    方式一：循环条件返回false
    方式二：循环体中执行break
 */
import java.util.Scanner;
public class ForWhileTest {
    public static void main(String[] args) {
        System.out.println("请输入你的正数或者负数,输入0结束：");
        Scanner scanner = new Scanner(System.in);
        int positive_count = 0;
        int negative_count = 0;//正负数的个数

        while (true) {//因为个数不确定，所以设置为true并用break规定跳出条件
            //for(;;)for方法的死循环
            int number = scanner.nextInt();
            if (number > 0) {
                positive_count++;
            } else if (number < 0) {
                negative_count++;
            } else if (number == 0) {
                break;
            }
            //    break; //一旦执行break就退出循环
        }


        System.out.println("输入整数的个数为：" + positive_count);
        System.out.println("输入负数的个数为：" + negative_count);

    }
}

