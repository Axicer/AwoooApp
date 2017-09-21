package main.axicer.test;

import java.awt.Dimension;
import java.awt.Toolkit;

import main.axicer.test.frame.SimplifiedFrame;
import main.axicer.test.gui.pack.MainGUI;

public class App {
			
	public static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static final double width = screenSize.getWidth();
	public static final double height = screenSize.getHeight();
	
	public static void main(String[] args) {
		new App();
	}
	
	public App(){
		SimplifiedFrame frame = new SimplifiedFrame((int)(width/2)-720/2, (int)(height/2)-480/2, 720, 480, "Awooo Button", true);
		MainGUI gui = new MainGUI(frame);
		gui.addComponentsToFrame(frame);
	}	
}
