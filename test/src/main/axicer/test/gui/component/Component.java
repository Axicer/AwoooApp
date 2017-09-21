package main.axicer.test.gui.component;

public class Component<T extends java.awt.Component> {
	
	public ComponentProperties properties;
	public T rawComponent;
	
	public Component(T c, ComponentProperties properties) {
		this.rawComponent = c;
		this.properties = properties;
	}
	
	public void applyProperties(){
		rawComponent.setBounds(properties.getX(), properties.getY(), properties.getWidth(), properties.getHeight());
	}

	public ComponentProperties getProperties() {
		return properties;
	}
	public void setProperties(ComponentProperties properties) {
		this.properties = properties;
	}
	public T getRawComponent() {
		return rawComponent;
	}
	public void setRawComponent(T rawComponent) {
		this.rawComponent = rawComponent;
	}
	
	
}
