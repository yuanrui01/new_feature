package org.yuanrui;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/4/15-8:36
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bread wheat = Bread.WHEAT;
        Bread chocolate = Bread.CHOCOLATE;
        System.out.println(wheat.getClass());
        System.out.println(wheat.getDeclaringClass());

        System.out.println(chocolate.getClass());
        System.out.println(chocolate.getDeclaringClass());

        Color red = Color.RED;

        //System.out.println(red.compareTo();

        System.out.println(String.class.getEnumConstants());
    }
}