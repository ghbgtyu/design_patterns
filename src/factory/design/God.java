package factory.design;

public class God {
	public static void main(String[] args) {
		IFactory factory = new RabbitWhiteFlyEvolveFactory();
		factory.createAnimal();
		//下面可以有各种不同的工厂
		//IFactory factory = new RabbitXXXEvolveFactory();
		//factory.createAnimal();
		
	}
}
