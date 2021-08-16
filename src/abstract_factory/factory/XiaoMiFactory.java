/**
 * bianque.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package abstract_factory.factory;

import abstract_factory.product.*;

/**
 * 小米工厂
 * @author xuleyan
 * @version XiaoMiFactory.java, v 0.1 2021-08-16 9:51 下午
 */
public class XiaoMiFactory extends AbstractFactory {

    @Override
    public Car buildCar() {
        return new BMCar();
    }

    @Override
    public Phone buildPhone() {
        return null;
    }

    @Override
    public Computer buildComputer() {
        return new DesktopComputer();
    }
}