package factory.simple.f;

import factory.simple.room.type.CuteGrayRabbit;
import factory.simple.room.type.CuteWhiteRabbit;
import factory.simple.room.type.LittleGrayRabbit;
import factory.simple.room.type.LittleWhiteRabbit;
import factory.simple.room.type.Rabbit;


/**上帝的简单工厂*/
public class SimpleGodFactory {
	
	/**创建小白兔*/
	public static Rabbit createLittleWhiteRabbit(){
		return new LittleWhiteRabbit();
	}
	/**创建小灰兔*/
	public static Rabbit createLittleGrayRabbit(){
		return new LittleGrayRabbit();
	}
	/**创建可爱的白兔*/
	public static Rabbit createCuteWhiteRabbit(){
		return new CuteWhiteRabbit();
	}
	/**创建可爱的灰兔*/
	public static Rabbit createCuteGrayRabbit(){
		return new CuteGrayRabbit();
	}
	
	
}
