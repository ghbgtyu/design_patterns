package factory.design;

import java.util.ArrayList;
import java.util.List;
/**创建白色会飞的兔子*/
public class RabbitWhiteFlyEvolveFactory extends RabbitFactory {
	
	private static final List<IAnimalEvolveFactory>evolveFactoryList = new ArrayList<>();
	
	static{
		evolveFactoryList.add(new AnimalColorEvolveFactory());
		evolveFactoryList.add(new AnimalFlyEvolveFactory());
	}

	@Override
	protected List<IAnimalEvolveFactory> getEvolveStrategyFactory() {
		return evolveFactoryList;
	}

}
