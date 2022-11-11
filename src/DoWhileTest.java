/*
do-while循环的使用

do-while循环结构
①
do{
③
④
}while(②);

开发中使用for和while更多，使用do-while更少一些
 */
public class DoWhileTest {
    public static void main(String[] args) {
        //遍历100以内的所有偶数,并计算所有偶数的和以及偶数的个数
        int num = 1;
        int sum = 0,count = 0;
        do{
            if(num % 2 == 0){
                System.out.println(num);
                sum += num;
                count++;
            }
            num++;
        }while(num <= 100);
        System.out.println(sum);
        System.out.println(count);
        System.out.println("/**********************************************/");
        int temp1 = 1;
        while(temp1 > 10){
            System.out.println("wxzx");
            temp1++;
        }

        int temp2 = 1;
        do{
            System.out.println("wxzx");
            temp2++;
        }while(temp2 > 10);
    }
}
