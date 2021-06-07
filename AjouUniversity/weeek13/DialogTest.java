package Dialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class DialogTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			DialogFrame frame = new DialogFrame();
			frame.setTitle("Calculator");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}

}

class DialogFrame extends JFrame{
	 private static final int DEFAULT_WIDTH=300;
	 private static final int DEFAULT_HEIGHT=200;
	 private AboutDialog dialog;
	 
	 public DialogFrame() {
		 setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		 JMenuBar menuBar = new JMenuBar();
		 setJMenuBar(menuBar);
		 JMenu fileMenu = new JMenu("File");
		 menuBar.add(fileMenu);
		 
		 JMenuItem aboutItem = new JMenuItem("About");
		 aboutItem.addActionListener(event->{
			 if(dialog==null)
				 dialog = new AboutDialog(DialogFrame.this);
			 dialog.setVisible(true);
		 });
		 fileMenu.add(aboutItem);
		 JMenuItem exitItem = new JMenuItem("Exit");
		 exitItem.addActionListener(event->System.exit(0));
		 fileMenu.add(exitItem);
	 }
}

class AboutDialog extends JDialog{
	public AboutDialog(JFrame owner) {
		super(owner, "About Dialog Test", true);
		add(new JLabel("haha"), BorderLayout.CENTER);
		JButton ok = new JButton("OK");
		ok.addActionListener(event->setVisible(false));
		JPanel panel = new JPanel();
		panel.add(ok);
		add(panel, BorderLayout.SOUTH);
		pack();
	}
}
