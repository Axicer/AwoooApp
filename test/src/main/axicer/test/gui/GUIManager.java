package main.axicer.test.gui;

import java.util.HashMap;
import java.util.Map;

import main.axicer.test.frame.SimplifiedFrame;
import main.axicer.test.gui.component.Component;

public class GUIManager {
	
	private SimplifiedFrame frame;
	private Map<String, Component<?>> components;
	
	public GUIManager(SimplifiedFrame frame) {
		this.frame = frame;
		components = new HashMap<String, Component<?>>();
	}
	
	public void addComponent(String id, Component<?> c){
		if(!components.containsKey(id)){
			components.put(id, c);
			frame.add(c.getRawComponent());
		}
		else System.out.println("error adding component with id: \""+id+"\" > already registered !");
	}
	public void removeComponent(String id){
		if(components.containsKey(id)){
			frame.remove(components.get(id).getRawComponent());
			components.remove(id);
		}
		else System.out.println("error removing component with id: \""+id+"\" > not registered !");
	}
	public Component<?> getComponent(String id){
		return components.get(id);
	}
}
