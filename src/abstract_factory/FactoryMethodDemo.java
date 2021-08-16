package abstract_factory;

import abstract_factory.factory.AbstractFactory;
import abstract_factory.factory.HuaweiFactory;
import abstract_factory.factory.XiaoMiFactory;
import abstract_factory.product.Car;
import abstract_factory.product.Computer;

public class FactoryMethodDemo {

	public static void main(String[] args) {

		// 1.抽象工厂模式隔离了具体类的生成，使得客户并不需要知道什么被创建。由于这种隔离，更换一个具体工厂就变得相对容易。所有的具体
		//工厂都实现了抽象工厂中定义的那些公共接口，因此只需改变具体工厂的实例，就可以在某种程度上改变整个软件系统的行为。
		// 2.另外，应用抽象工厂模式可以实现高内聚低耦合的设计目的，因此抽象工厂模式得到了广泛的应用。
		// 3.当一个产品族中的多个对象被设计成一起工作时，它能够保证客户端始终只使用同一个产品族中的对象。这对一些需要根据当前环境来决
		//定其行为的软件系统来说，是一种非常实用的设计模式。
		// 4.增加新的具体工厂和产品族很方便，无须修改已有系统，符合“开闭原则”。

//		AbstractFactory miFactory = new HuaweiFactory();
		AbstractFactory miFactory = new XiaoMiFactory();
		Car car = miFactory.buildCar();
		car.drive();

		Computer computer = miFactory.buildComputer();
		computer.play();
	}

}
