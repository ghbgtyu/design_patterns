package factory.design;

import java.util.List;
public abstract class RabbitFactory implements IFactory {
	
	/**抽象兔子的进化工厂，由子类来决定兔子颜色和翅膀等*/
	protected abstract List<IAnimalEvolveFactory> getEvolveStrategyFactory();
	
	@Override
	public Rabbit createAnimal() {
		Rabbit rabbit = new Rabbit();
		List<IAnimalEvolveFactory>evolveStrategyList = getEvolveStrategyFactory();
		if(evolveStrategyList != null){
			for(IAnimalEvolveFactory evolve:evolveStrategyList){
				//进化
				evolve.evolve(rabbit);
			}
		}
		return rabbit;
	}

}
