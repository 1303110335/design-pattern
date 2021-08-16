/**
 * bianque.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package abstract_factory.product;

/**
 *
 * @author xuleyan
 * @version DesktopComputer.java, v 0.1 2021-08-16 9:50 下午
 */
public class DesktopComputer implements Computer {
    @Override
    public void play() {
        System.out.println("玩台式电脑");
    }
}