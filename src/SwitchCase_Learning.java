/*
switch和case的学习代码
1. 格式
switch(){
case 常量1
    执行语句1
    //break
case 常量2
    执行语句2
    //break

default:
    执行语句n
    //break
}
2. 说明：
1. 根据switch表达式中的值，依次匹配各个case中的常量，一旦匹配成功，则进入相应case中的执行语句并调用
    当调用完执行语句后，则仍然继续向下执行其他case语句中的执行语句，直到遇到break或switch-Case末尾结束为止
2.  break是中止运算符,一旦遇到就中止switch-case结构
3. switch结构中的表达式，只能是如下6种数据结构之一：
byte short char int 枚举类型（jdk5.0） String类型
*/

public class SwitchCase_Learning {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 0:
            System.out.println("zero");
            case 1:
            System.out.println("one");
            case 2:
            System.out.println("two");
            case 3:
            System.out.println("three");
            break;
        }
    }
}
