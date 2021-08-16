/**
 * bianque.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package abstract_factory.factory;

import abstract_factory.product.*;

/**
 * 华为工厂
 * @author xuleyan
 * @version HuaweiFactory.java, v 0.1 2021-08-16 10:30 下午
 */
public class HuaweiFactory extends AbstractFactory {
    @Override
    public Car buildCar() {
        return new AuDiCar();
    }

    @Override
    public Phone buildPhone() {
        return null;
    }

    @Override
    public Computer buildComputer() {
        return new NotebookComputer();
    }
}