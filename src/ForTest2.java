/*
输入两个正整数m和n，输出最大公约数和最小公倍数
 */
import java.util.Scanner;

public class ForTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正数：");
        int m = scanner.nextInt();
        System.out.println("请输入第二个正数：");
        int n = scanner.nextInt();


        int min = (m <= n) ? m : n;
        for(int i  = min; i>=1;i--)
        if(m % i == 0 && n % i == 0){
            System.out.println("最大公约数为：" + i);
            break;//一旦在循环中执行到break就跳出循环
        }

        //获取最小公倍数
        //获取两个中的较大值
        int max = (m >= n) ? n : m;
        for(int j = max;j<=m * n;j++){
            if(j % m == 0 && j % n ==0){
                System.out.println("最小公倍数：" + j);
                break;
            }
        }
    }
}
