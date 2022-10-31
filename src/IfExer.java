/*
关于if的练习
 */
import java.util.Scanner;
import java.util.Scanner;
class IfExer {
    public static void main(String[] args) {
        /*int x = 4,y = 1;
        if(x > 2){
            if(y>2){
                System.out.println(x+y);
            }
        //System.out.println("尚硅谷");
        }else{
            System.out.println("x is " + x);
        }*/

        //课后练习3：测算狗的年龄
        int DogAge;
        Scanner DogScan = new Scanner(System.in);
        System.out.println("Please enter the age of the dog");
        DogAge = DogScan.nextInt();

            if (DogAge >= 0 && DogAge <= 2) {
                System.out.println("你的狗好小啊！大概这么多：" + DogAge * 10.5);
            } else if (DogAge > 2) {
                System.out.println("你的狗老了啊！大概这么多：" + (10.5 * 2) + (DogAge - 2) * 4);
            } else {
                System.out.println("输入非法，快爬！");
            }
            //double value = Math.random() * 100;//[0.0,0.1]-->[0.0, 100.0)
            double value = (int)(Math.random() * 90 + 10);//[0.0,1.0]-->[0.0,90.0]-->[10.0, 100.0]再用(int)强转

        }
    }
