package main.axicer.test.frame;

import javax.swing.JFrame;

import main.axicer.test.gui.GUIManager;

@SuppressWarnings("serial")
public class SimplifiedFrame extends JFrame{
	
	private GUIManager guiManager;
	
	public SimplifiedFrame(int x, int y, int width, int height, String title, boolean show) {
		setTitle(title);
		setBounds(x, y, width, height);
		setLayout(null);
		this.guiManager = new GUIManager(this);
		setVisible(show);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public int getXPos(){
		return (int)getLocation().getX();
	}
	public int getYPos(){
		return (int)getLocation().getY();
	}
	public int getWidth() {
		return (int)getSize().getWidth();
	}
	public int getHeight() {
		return (int)getSize().getHeight();
	}

	public void setPos(int x, int y){
		setLocation(x, y);
	}
	public void setPosX(int x){
		setLocation(x, getYPos());
	}
	public void setPosY(int y){
		setLocation(getXPos(), y);
	}
	public void setSize(int width, int height){
		setBounds(getXPos(), getYPos(), width, height);
	}
	public void setWidth(int width) {
		setSize(width, getHeight());
	}
	public void setHeight(int height) {
		setSize(getWidth(), height);
	}
	public GUIManager getGUIManager(){
		return this.guiManager;
	}
}
