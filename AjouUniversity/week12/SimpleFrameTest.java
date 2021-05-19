import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

class SimpleFrame extends JFrame{
	private static final int DEFAULT_WIDTH=1000;
	private static final int DEFAULT_HEIGHT=1000;
	
	public SimpleFrame()
	{
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
	}
}

public class SimpleFrameTest {

	public static void main(String[] args) {
		SimpleFrame frame = new SimpleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("test1");
		Dimension i = frame.getSize();
		System.out.println(i);
	}

}
