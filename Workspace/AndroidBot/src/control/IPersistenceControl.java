package control;

import java.util.List;

import entities.IEvent;

public interface IPersistenceControl {
	
	public List<IEvent> readEvents();
	public void saveEvents(List<IEvent> eventList);
	
}
