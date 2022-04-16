package com.itheima02_异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
注意事项
	try/catch/finally都不可以单独使用
	运行时异常被抛出可以不处理（不捕获也不声明抛出），因为所有的方法默认声明运行时异常
	在try/catch后可以追加finally代码块，其中的代码一定会被执行，通常用于资源回收
	父类的方法声明异常，子类覆盖(重写)父类方法时，只能声明相同的异常或该异常子集
	父类的方法未声明的异常，子类覆盖(重写)父类方法时，只能处理，不能声明
	try...catch捕获多个异常时，前边的类不能是后边类的父类或同类

 */
public class Test_07捕获异常_注意事项 {
    public static void main(String[] args) {
        //try/catch/finally都不可以单独使用
        //try{}
        System.out.println("--------");
        //catch(Exception e){}
        System.out.println("--------");
        //finally{}

        //try...catch捕获多个异常时，前边的类不能是后边类的父类或同类
        try {
            System.out.println(10 / 0);
            int[] arr = null;
            System.out.println(arr[0]);
        }
        /*catch (ArithmeticException e){
        }*/
        /*catch (Exception e) {
        }*/ catch (ArithmeticException e) {
        } catch (NullPointerException e) {
        }
    }
}

class Fu {
    //默认声明运行时异常
    public void method1() /*throws RuntimeException*/ {
    }

    //没有定声明编译时异常
    public void method2() {
    }

    //声明特定编译时异常
    public void method3() throws ParseException/*,RuntimeException*/ {
    }


}

class Zi extends Fu {
    @Override
    public void method1() throws NullPointerException {

    }


    @Override
    public void method2()/* throws ParseException*/ {
        String time = "2000年12-12";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //Ctrl+Alt+T
        try {
            Date result = sdf.parse(time);
            System.out.println(result);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    //public void method3() throws NullPointerException {
    //public void method3() throws IOException {
    public void method3() throws ParseException {

    }
}