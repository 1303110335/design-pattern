/**
 * bianque.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package abstract_factory.factory;

import abstract_factory.product.Car;
import abstract_factory.product.Computer;
import abstract_factory.product.Phone;

/**
 *
 * @author xuleyan
 * @version AbstractFactory.java, v 0.1 2021-08-16 9:45 下午
 */
public abstract class AbstractFactory {

    public abstract Car buildCar();

    public abstract Phone buildPhone();

    public abstract Computer buildComputer();
}