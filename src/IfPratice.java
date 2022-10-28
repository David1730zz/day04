/*
输入三个整数，按照从小到大的数据输出这个三个数
说明：
if else 互相嵌套使用，但层数不能太多
 */
import java.util.Scanner;
public class IfPratice {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanbot = new Scanner(System.in);

        System.out.print("请输入第一个整数：");
        num1 = scanbot.nextInt();

        System.out.println("请输入第二个整数：");
        num2 = scanbot.nextInt();

        System.out.println("请输入第三个整数");
        num3 = scanbot.nextInt();


        if (num1 >= num2) {
            if (num3 >= num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if (num3 <= num2) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        } else {//这里else代表num1<num2
            if (num3 >= num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else if (num3 <= num1) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }
    }
}
