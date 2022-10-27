/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
如何从键盘获取不同类型的变量：使用scanner类
* 1. 导包：import java.util.Scanner;
* 2. scanner的实例化
* 3. 调用类的相关方法
/
 */
import java.util.Scanner; //导入java.util下的Scanner类，导入后才能使用他
import java.util.logging.Logger;

class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner的实例化
        //通过new Scanner(System.in)创建一个Scanner，控制台会一直等待输入，直到敲回车键结束。
        //把所输入的内容传给Scanner，作为扫描对象。
        /**********************************************************/
        //int num  = scan.nextInt();
        //System.out.println(num);
        /**********************************************************/

        //String s1 = scan.nextLine();
        //System.out.println(s1);
        System.out.println("请输入你的名字：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的年龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是男生吗？（ture/false）");
        boolean gender = scan.nextBoolean();
        System.out.println(gender);

        //对于char字符串类型的获取，Scanner没有提供对应方法
        System.out.println("请输入你的学校：");
        String school = scan.next();
        char schoolchar  =  school.charAt(0);//获取索引为0位置上的字符
        System.out.println(school);

    }
}
