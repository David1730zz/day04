/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
        身高180以上，财富1千万以上，帅
        * 全部满足，嫁||满足部分，凑合嫁||没有满足的，不嫁
*
* */
import java.util.Scanner;
public class IfExer1 {
    public static void main(String[] args) {
        boolean handsome;

        Scanner boy = new Scanner(System.in);
        System.out.println("请输入你的身高：");
        int height  = boy.nextInt();

        System.out.println("请输入你的财富：");
        double wealth = boy.nextDouble();

        System.out.println("你觉得你帅🐎？(帅/不帅)");
        String cooler = "帅";
        String cool = boy.next();
        if(cooler.equals(cool)){            //cooler.equals(cool)是比较前后两个字符串是否相等的类
            handsome = true;
        }else{
            handsome = false;
        }
            if(height >= 180 && wealth >= 1000 && handsome == true){
                    System.out.println("嫁给你！");
            }else if(height < 180 || wealth < 1000 || handsome == false){
                System.out.println("凑合嫁给你吧");
            }else {
                System.out.println("不嫁，快爬！🔪");
            }

    }
}
