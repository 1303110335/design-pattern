/**
 * bianque.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package abstract_factory.product;

/**
 *
 * @author xuleyan
 * @version BMCar.java, v 0.1 2021-08-16 9:48 下午
 */
public class BMCar implements Car {
    @Override
    public void drive() {
        System.out.println("开宝马");
    }
}