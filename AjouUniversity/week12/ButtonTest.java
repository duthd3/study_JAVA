import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonFrame extends JFrame{
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	public ButtonFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		JButton yellowButton = new JButton("yello");
		JButton blueButton = new JButton("blue");
		JButton redButton = new JButton("red");
		
		buttonPanel = new JPanel();
		//add buttons to panel
		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);
		//add panel to frame
		add(buttonPanel);
		//create button actions
		ColorAction yellowAction = new ColorAction(Color.YELLOW);
		ColorAction blueAction = new ColorAction(Color.BLUE);
		ColorAction redAction = new ColorAction(Color.RED);
		//associate actions with buttons
		yellowButton.addActionListener(yellowAction);
		blueButton.addActionListener(blueAction);
		redButton.addActionListener(redAction);
	}
		//inner class
		private class ColorAction implements ActionListener{
			private Color backgroundColor;
			public ColorAction(Color c) {
				backgroundColor = c;
			}
			public void actionPerformed(ActionEvent event) {
				buttonPanel.setBackground(backgroundColor);
			}
		}
	}


public class ButtonTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			JFrame frame = new ButtonFrame();
			frame.setTitle("ButtonTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}

}
