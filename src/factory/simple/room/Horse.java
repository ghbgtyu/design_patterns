package factory.simple.room;

import java.util.ArrayList;
import java.util.List;

import factory.simple.room.type.Rabbit;

public class Horse {
	private List<Rabbit>rabbitList = new ArrayList<>();
	
	/**把菟子放进家*/
	public void putRabbitInHorse(Rabbit rabbit){
		this.rabbitList.add(rabbit);
	}
	
	public void lookRabbit(){
		for(Rabbit rabbit:rabbitList){
			rabbit.say();
		}
	}
}
