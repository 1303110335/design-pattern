/**
 * bianque.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package abstract_factory.product;

/**
 *
 * @author xuleyan
 * @version AuDiCar.java, v 0.1 2021-08-16 9:49 下午
 */
public class AuDiCar implements Car {
    @Override
    public void drive() {
        System.out.println("开奥迪");
    }
}