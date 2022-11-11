/*
100以内所有质数的输出（只能被1和本身整除）
 */
import java.math.BigDecimal;
public class PrimeTest {
    public static void main(String[] args) {
        boolean flag = true;
        long start = System.currentTimeMillis();
        for(int i = 2; i < 100000; i++) {//遍历100以内自然数
            for(int j = 2; j < i; j++) {//被i去除
                if(i % j == 0){
                    flag = false;break;
                }
            }
            if(flag == true){
                System.out.println("质数为：" + i);
            }
            flag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("花费时间为：" + (end - start));


    }
}
