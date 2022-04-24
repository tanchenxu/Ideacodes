package com.akuya.Reflex;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author akuya
 * @create 2022-04-24-11:14
 */
public class test1 {



    //反射之前对Person的操作
    @Test
    public void test(){

        //创建对象
        People p1 =new People("TOM",12);

        //调用其内部方法
        p1.age=10;
        System.out.println(p1.toString());

        p1.show();

        //在people类外部，不可以同构people类的对象调用起私有方法

    }


    @Test
    public void test2() throws Exception {
        Class peopleClass = People.class;
        //通过反射创建Person类的对象
        Constructor cons= peopleClass.getConstructor(String.class, int.class);
        Object obj=cons.newInstance("Tom",12);
        People p1=(People) obj;
        System.out.println(p1.toString());
        //通过反射，调用对象指定的属性和方法
        //属性
        Field age = peopleClass.getDeclaredField("age");
        age.set(p1,10);
        System.out.println(p1.toString());
        //方法
        Method show = peopleClass.getDeclaredMethod("show");
        show.invoke(p1);
    }




}
