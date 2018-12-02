package com.ripplechan;

import lombok.Data;

/**
 * 类的复用
 * 汽车拥有引擎
 * @author RippleChan
 * @date 2018-12-03
 * @time 1:39
 */
public class ReuseExample {

    public static void main(String[] args) {
        Car car = new Car();
    }

}


@Data
class Car {

    private Engine engine;

}


@Data
class Engine{

    private String height;
    private String width;

}
