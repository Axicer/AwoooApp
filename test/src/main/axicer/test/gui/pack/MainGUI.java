package main.axicer.test.gui.pack;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import main.axicer.test.frame.SimplifiedFrame;
import main.axicer.test.gui.component.Component;
import main.axicer.test.gui.component.ComponentProperties;

public class MainGUI implements GUI{

	private SimplifiedFrame frame;
	private List<Component<?>> components;
	public JProgressBar bar;
	public JButton button;
	public JLabel label;
	public String[] loadMessages = new String[]{"slow breath...","starting breathing...","cleaning lungs","breathing air...","maintaining air...","AWOOOOOOO !"};
	
	@SuppressWarnings("serial")
	public MainGUI(SimplifiedFrame frame) {
		this.frame = frame;
		components = new ArrayList<Component<?>>();
		button = new JButton("Click to Awooo");
		button.setAction(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startCounterAwooo();
				button.setEnabled(false);
				label.setText("");
			}
		});
		button.setVisible(true);
		button.setText("Click to Awooo");
		components.add(new Component<JButton>(button, 
				new ComponentProperties("button",
						frame.getWidth()/2-200/2,
						(int) ((frame.getHeight()/2-50/2)*0.7),
						200,
						50)));
		bar = new JProgressBar(0, 0, 50);
		bar.setVisible(true);
		components.add(new Component<JProgressBar>(bar, 
				new ComponentProperties("ProgressBar",
						frame.getWidth()/2-200/2,
						(int) ((frame.getHeight()/2-50/2)*1.3),
						200,
						50)));
		
		label = new JLabel("",SwingConstants.CENTER);
		label.setVisible(true);
		components.add(new Component<JLabel>(label, 
				new ComponentProperties("label",
						frame.getWidth()/2-200/2,
						(int) ((frame.getHeight()/2-50/2)),
						200,
						50)));
	}
	
	public void startCounterAwooo(){
		new Thread(new Runnable() {
			public void run() {
				int i = 0;
				while(i < 50){
					i++;
					bar.setValue(i);
					label.setText(loadMessages[(int) Math.floor(i/10)]);
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				JOptionPane.showMessageDialog(new JFrame(), "AWOOOOOOOO", "Awooooo", JOptionPane.INFORMATION_MESSAGE);
				button.setEnabled(true);
				bar.setValue(0);
			}
		}).start();
	}
	
	@Override
	public List<Component<?>> getComponents() {
		return components;
	}

	@Override
	public String getName() {
		return "MAIN_FRAME";
	}
	
}
