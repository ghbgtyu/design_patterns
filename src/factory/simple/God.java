package factory.simple;

import factory.simple.room.Horse;
import factory.simple.room.type.CuteGrayRabbit;
import factory.simple.room.type.CuteWhiteRabbit;
import factory.simple.room.type.LittleGrayRabbit;
import factory.simple.room.type.LittleWhiteRabbit;
import factory.simple.room.type.Rabbit;

public class God {
	public static void main(String[] args) {
		//创建一只小白兔
		Rabbit rabbit1 = new LittleWhiteRabbit();
		//创建一只小灰兔
		Rabbit rabbit2 = new LittleGrayRabbit();
		//创建一只可爱的白兔子
		Rabbit rabbit3 = new CuteWhiteRabbit();
		//创建一只可爱的灰兔子
		Rabbit rabbit4 = new CuteGrayRabbit();
		
		Horse horse = new Horse();
		horse.putRabbitInHorse(rabbit1);
		horse.putRabbitInHorse(rabbit2);
		horse.putRabbitInHorse(rabbit3);
		horse.putRabbitInHorse(rabbit4);
		//偷偷看一下啦
		horse.lookRabbit();
		
	}
}
