package main.axicer.test.gui.component;

public class ComponentProperties {
	
	private String id;
	private int x,y,width,height;
	
	public ComponentProperties(String id, int x, int y, int width, int height) {
		setId(id);
		setWidth(width);
		setHeight(height);
		setX(x);
		setY(y);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
