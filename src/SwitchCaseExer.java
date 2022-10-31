/*
从键盘分别输入年月日，判断这一天是第几天
说明：凡是使用switch-case的结构，都可以使用if-else
如果一个算法既可以使用switch-case又可以使用if-else时，优先使用switch-case(switch-case表达式中取值情况不太多时)
 */
import java.util.Scanner;
public class SwitchCaseExer {
    public static void main(String[] args) {
        int year,month,day;
        Scanner date = new Scanner(System.in);
        System.out.println("请输入你的年份：");
        year = date.nextInt();

        System.out.println("请输入你的月份: ");
        month = date.nextInt();

        System.out.println("请输入你的天数:");
        day = date.nextInt();

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
                //sumDays += 28;
                //判断year是否为闰年
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    sumDays += 29;
            }else{
                    sumDays += 28;}
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
                break;
        }
        System.out.println(year + "年的" + month + "月" + "的第" + day + "天是"+ year + "年的第" + sumDays + "天!");


    }
}