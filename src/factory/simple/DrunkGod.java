package factory.simple;

import java.util.Random;

import factory.simple.f.SimpleGodOneFactory;
import factory.simple.room.Horse;
import factory.simple.room.type.Rabbit;

/**zzzzzz*/
public class DrunkGod {
	public static void main(String[] args) {
		Horse horse = new Horse();
		final int size = 20;
		Random random = new Random();
		for(int i = 0;i<size;i++){
			//随机创建兔子
			Rabbit rabbit = SimpleGodOneFactory.createRabbitByType(random.nextInt(4)+1);
			horse.putRabbitInHorse(rabbit);
		}
		horse.lookRabbit();
		
		
	}
}
