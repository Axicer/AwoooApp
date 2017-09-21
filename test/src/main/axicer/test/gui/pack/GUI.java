package main.axicer.test.gui.pack;

import java.util.List;

import main.axicer.test.frame.SimplifiedFrame;
import main.axicer.test.gui.component.Component;

public interface GUI {
	
	List<Component<?>> getComponents();
	String getName();
	
	public default void addComponentsToFrame(SimplifiedFrame frame){
		for(Component<?> c : getComponents()){
			c.applyProperties();
			frame.add(c.getRawComponent());
		}
	}
}
