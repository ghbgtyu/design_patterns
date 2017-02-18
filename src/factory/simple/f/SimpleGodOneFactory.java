package factory.simple.f;

import factory.simple.room.type.CuteGrayRabbit;
import factory.simple.room.type.CuteWhiteRabbit;
import factory.simple.room.type.LittleGrayRabbit;
import factory.simple.room.type.LittleWhiteRabbit;
import factory.simple.room.type.Rabbit;


/**上帝的一号简单工厂*/
public class SimpleGodOneFactory {
	
	/**根据类型创建兔子*/
	public static Rabbit createRabbitByType(int type){
		switch( type ){
			case 1:return new LittleWhiteRabbit();
			case 2:return new LittleGrayRabbit();
			case 3:return new CuteWhiteRabbit();
			case 4:return new CuteGrayRabbit();
			default :return new CuteWhiteRabbit();
		}
	}
	
}
