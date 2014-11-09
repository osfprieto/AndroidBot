package control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFileChooser;

import entities.IEvent;

public class PersistenceControl implements IPersistenceControl{
	
	public PersistenceControl(){}
	
	public void saveEvents(List<IEvent> eventList){
		
		FileOutputStream fos;
		try {
			JFileChooser fChooser = new JFileChooser();
			int answer = fChooser.showDialog(null, "Save events");
			if(answer==JFileChooser.APPROVE_OPTION){
				fos = new FileOutputStream(fChooser.getSelectedFile());
				ObjectOutputStream out = new ObjectOutputStream(fos);
				out.writeObject(eventList);
				out.close();
				System.out.println("Data saved correctly");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<IEvent> readEvents(){
		FileInputStream fis;

		try {
			JFileChooser fChooser = new JFileChooser();
			int answer = fChooser.showDialog(null, "Read events");
			if(answer == JFileChooser.APPROVE_OPTION){
				fis = new FileInputStream(fChooser.getSelectedFile());
				ObjectInputStream in = new ObjectInputStream(fis);
				LinkedList<IEvent> eventList = (LinkedList<IEvent>)in.readObject(); 
				return eventList;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
