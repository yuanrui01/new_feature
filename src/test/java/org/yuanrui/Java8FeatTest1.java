package org.yuanrui;

import org.junit.Test;

import java.time.LocalDate;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/4/15-8:42
 */
public class Java8FeatTest1 {

    @Test
    public void test1(){
        System.out.println(testTryCF());
    }

    private int testTryCF(){
        int index = 0;

        try {
            index = 1/0;
            return index;
        } catch (Exception e) {
            index = 2;
            return index;
        } finally {
            index = 3;
            //return index;
        }
    }
}
