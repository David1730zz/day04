/*/
从键盘输入2019年的月和日，输出日期为2019年的第几天
说明：break在switch-case中是可选的，而不是必须的
 */
import java.util.Scanner;
public class SwitchTest2 {
    public static void main(String[] args) {
        int month,day;
        Scanner date = new Scanner(System.in);

        System.out.println("请输入2019年的月份");
        month = date.nextInt(); //

        System.out.println("请输入2019年的日数");
        day = date.nextInt();
/*
        int sumDays = 0;
        if(month == 1){
            sumDays = day;
        }else if(month == 2){
            sumDays = ......;
        }*/
        int sumDays = 0;
        switch(month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
                case 4:
                sumDays += 31;
                case 3:
                sumDays += 28;
                case 2:
                sumDays += 31;
                case 1:
                sumDays += day;
                break;
        }
        System.out.println(month + "月" + "的第" + day + "天是2019年的第" + sumDays + "天，哈哈哈");
    }
}
