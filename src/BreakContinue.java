/*
break关键字的作用：
break：使用在switch-case和循环中    结束当前循环
continue：使用在循环中             结束当次循环
在这两个关键字后面不能跟任何执行语句
 */

public class BreakContinue {
    public static void main(String[] args) {
            label:for(int i = 1;i <= 4; i++){
                for(int j = 1;j <= 10; j++){
                    if(j % 4 == 0){
                        //break     //默认跳出包裹此关键字的一层循环
                       //break label;
                       continue label;//如果希望break跳出指定的循环层
                    }
                }
            }
    }
}
