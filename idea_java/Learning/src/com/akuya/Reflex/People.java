package com.akuya.Reflex;

/**
 * @author akuya
 * @create 2022-04-24-10:56
 */
public class People {

    private String name;
    public int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("I'm a People");
    }

    private String showNation(String s){
        System.out.println("I come from "+s);
        return s;
    }



}




