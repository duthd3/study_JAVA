package DataExchange;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;



public class DataExchangeTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			DataExchangeFrame frame = new DataExchangeFrame();
			frame.setTitle("Calculator");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}

}

class DataExchangeFrame extends JFrame{
	public static final int TEXT_ROWS=20;
	public static final int TEXT_COLUMNS=40;
	
	private PasswordChooser dialog = null;
	private JTextArea textArea;
	
	public DataExchangeFrame() {
		JMenuBar mbdr = new JMenuBar(); //메뉴바 생성
		setJMenuBar(mbdr);
		JMenu fileMenu = new JMenu("File"); 
		mbdr.add(fileMenu); //메뉴바에 file메뉴 추가
		JMenuItem connectItem = new JMenuItem("Connect");
		connectItem.addActionListener(new ConnectAction());
		fileMenu.add(connectItem); //파일메뉴에 ConnectItem 추가
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(event->System.exit(0));
		fileMenu.add(exitItem); //파일메뉴에 exitItem추가
		textArea = new JTextArea(TEXT_ROWS, TEXT_COLUMNS); //textArea생성
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		pack();
	}
	
	private class ConnectAction implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(dialog == null) dialog = new PasswordChooser();
			dialog.setUser(new User("", null));
			if(dialog.showDialog(DataExchangeFrame.this, "Connect")) {
				User u = dialog.getUser();
				textArea.append("user name = " + u.getName() + ", password= " + (new String(u.getPassword())) + "\n");
			}
		}
	}



public class PasswordChooser extends JPanel{
	private JTextField username;
	private JPasswordField password;
	private JButton okButton;
	private boolean ok;
	private JDialog dialog;
	
	public PasswordChooser() {
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.add(new JLabel("User name: "));
		panel.add(username = new JTextField(""));
		panel.add(new JLabel("Password: "));
		panel.add(password=new JPasswordField(""));
		add(panel, BorderLayout.CENTER);
		
		okButton = new JButton("OK");
		okButton.addActionListener(event->{
			ok = true;
			dialog.setVisible(false);
		});
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(event->dialog.setVisible(false));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);
		add(buttonPanel, BorderLayout.SOUTH);
	}
	
	public void setUser(User u) {
		username.setText(u.getName());
	}
	public User getUser() {
		return new User(username.getText(), password.getPassword());
	}
	public boolean showDialog(Component parent, String title) {
		ok = false;
		Frame owner = null;
		if(parent instanceof Frame)
			owner = (Frame)parent;
		else
			owner = (Frame)SwingUtilities.getAncestorOfClass(Frame.class, parent);
		
		if(dialog == null ||dialog.getOwner() != owner) {
			dialog = new JDialog(owner, true);
			dialog.add(this);
			dialog.getRootPane().setDefaultButton(okButton);
			dialog.pack();
		}
		
		dialog.setTitle(title);
		dialog.setVisible(true);
		return ok;
				
	}
}
}
class User{
	private String name;
	private char[] pass;
	User(String name, char[] password){
		this.name = name;
		this.pass = password;
	}
	public String getName() {
		return this.name;
	}
	public char[] getPassword() {
		return this.pass;
	}
}
