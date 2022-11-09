/*
For循环的使用
循环结构的4个要素
1. 初始化条件
2. 循环条件  ---->boolean类型
3. 循环体
4. 迭代条件
 */

public class ForTest {
    public static void main(String[] args) {
        //for (int i = 0; i < 100; i++) {//i在for循环被定义，for循环结束后则释放使用权，后续可继续使用
          //  System.out.println("hello world!");
    double sum = 0,count = 0;//count记录有多少偶数
        for(int i = 0;i<=100;i++){              //遍历100以内所有的数，并输入所有偶数的和
        if(i % 2 == 0){
            System.out.println(i);
            sum += i;
            count++;
        }
    }
        System.out.println(sum);
        System.out.println(count);



    }
    }

