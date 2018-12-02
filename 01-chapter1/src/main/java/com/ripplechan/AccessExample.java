package com.ripplechan;

/**
 * @author RippleChan
 * @date 2018-12-03
 * @time 1:43
 */
public class AccessExample {

    /**
     * 所有地方都能够访问
     */
    public static class T0 {

    }

    /**
     * 类内部
     * 当前包
     * 子类
     */
    protected static class T1 {

    }


    /**
     * 当前类
     */
    private static class T2 {

    }

    /**
     * 通常表示为：friendly或者default
     * 当前包
     */
    static class T3 {

    }

}
