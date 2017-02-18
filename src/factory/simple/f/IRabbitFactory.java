package factory.simple.f;

import factory.simple.room.type.Rabbit;

/**兔子工厂*/
public interface IRabbitFactory {
	/**根据类型创建兔子*/
	public Rabbit createRabbitByType(int type);
}
