/*
嵌套循环的使用：
嵌套循环：将一个循环结构生命再另一个循环结构的循环体中

2. 外层循环：b
    内层循环：a
 */

public class QianTaoTest {
    public static void main(String[] args) {
        //输出***************
        //输出***********
            //*************
            //*************
        /*for(int j = 1;j<15;j++) {

            for (int i = 1; i < 10; i++) {
                System.out.print("*");

            }

            System.out.println(); //换行命令

        }//循环方式是第一行第一个，第二行第一个....重复

    }*/
            for(int i = 1; i < 5; i++){
                for(int j = 1; j < i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}


