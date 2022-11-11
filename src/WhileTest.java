
/*
写while循环不能丢迭代条件，一旦丢了会导致死循环
程序编写要避免死循环
保证算法的有限性
for循环和while循环可以相互转换，但for和while的初始化条件部分的作用范围不同
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 2;
        while(i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
