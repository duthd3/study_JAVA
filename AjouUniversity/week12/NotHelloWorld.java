import javax.swing.*;
import java.awt.*;

public class NotHelloWorld {

	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			JFrame frame = new NotHelloWorldFrame();
			frame.setTitle("NotHelloWorld");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}

}

class NotHelloWorldFrame extends JFrame{
	public NotHelloWorldFrame() {
		add(new NotHelloWorldComponent());
		pack();
	}
}

class NotHelloWorldComponent extends JComponent{
	public static final int MESSAGE_X = 120;
	public static final int MESSAGE_Y = 50;
	
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 300;
	
	public void paintComponent(Graphics g) {
		g.drawString("NotHelloWorld", MESSAGE_X, MESSAGE_Y);
	}
	public Dimension getPreferredSize() {return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);}
}
