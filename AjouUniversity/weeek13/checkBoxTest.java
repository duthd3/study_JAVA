package checkBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class checkBoxTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			CheckBoxFrame frame = new CheckBoxFrame();
			frame.setTitle("CheckBoxTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}

}

class CheckBoxFrame extends JFrame{
	private JLabel label;
	private JCheckBox bold;
	private JCheckBox italic;
	private static final int FONTSIZE = 24;
	
	public CheckBoxFrame() {
		label = new JLabel("The quick brown fox jumps over the lazy dog");
		label.setFont(new Font("Serif", Font.BOLD, FONTSIZE));
		add(label, BorderLayout.CENTER);
		
		ActionListener listener = event->{
			int mode = 0;
			if(bold.isSelected()) mode+=Font.BOLD;
			if(italic.isSelected()) mode+=Font.ITALIC;
			label.setFont(new Font("Serif", mode, FONTSIZE));
		};
		JPanel buttonPanel = new JPanel();
		
		bold = new JCheckBox("Bold");
		bold.addActionListener(listener);
		bold.setSelected(true);
		buttonPanel.add(bold);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
		italic = new JCheckBox("Italic");
		italic.addActionListener(listener);
		
		buttonPanel.add(italic);
		
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
		
		
	}
}
