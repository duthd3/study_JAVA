package Menu;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class MenuTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			MenuFrame frame = new MenuFrame();
			frame.setTitle("Calculator");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}

}

class MenuFrame extends JFrame{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	private Action saveAction;
	private Action saveAsAction;
	private JCheckBoxMenuItem readonlyItem;
	private JPopupMenu popup;
			


	class TestAction extends AbstractAction{
		public TestAction(String name) {
			super(name);
		}
		public void actionPerformed(ActionEvent event) {
			System.out.println(getValue(Action.NAME) + " selected.");
		}
	
	}
	public MenuFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.add(new TestAction("New"));
		
		JMenuItem openItem = fileMenu.add(new TestAction("Open"));
		openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		
		fileMenu.addSeparator();
		
		saveAction = new TestAction("Save");
		JMenuItem saveItem = fileMenu.add(saveAction);
		saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
		
		saveAsAction = new TestAction("Save As");
		fileMenu.add(saveAsAction);
		fileMenu.addSeparator();
		
		fileMenu.add(new AbstractAction("Exit"){
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		readonlyItem = new JCheckBoxMenuItem("Read-only");
		readonlyItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evnet) {
				boolean saveOk = !readonlyItem.isSelected();
				saveAction.setEnabled(saveOk);
				saveAsAction.setEnabled(saveOk);
			}
		});
		ButtonGroup group = new ButtonGroup();
		
		JRadioButtonMenuItem insertItem = new JRadioButtonMenuItem("Insert");
		insertItem.setSelected(true);
		JRadioButtonMenuItem overtypeItem = new JRadioButtonMenuItem("Overtype");
		group.add(insertItem);
		group.add(overtypeItem);
		
		Action cutAction = new TestAction("Cut");
		Action copyAction = new TestAction("Copy");
		Action pasteAction = new TestAction("Paste");
		
		JMenu editMenu = new JMenu("Edit");
		editMenu.add(cutAction);
		editMenu.add(copyAction);
		editMenu.add(pasteAction);
		
		JMenu optionMenu = new JMenu("Options");
		
		optionMenu.add(readonlyItem);
		optionMenu.addSeparator();
		optionMenu.add(insertItem);
		optionMenu.add(overtypeItem);
		
		editMenu.addSeparator();
		editMenu.add(optionMenu);
		
		JMenu helpMenu = new JMenu("Help");
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		Action aboutAction = new TestAction("About");
		aboutAction.putValue(Action.MNEMONIC_KEY, new Integer(KeyEvent.VK_A));
		helpMenu.add(aboutAction);
		
		JMenuBar menuBar = new JMenuBar();
		
		setJMenuBar(menuBar);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		popup = new JPopupMenu();
		popup.add(cutAction);
		popup.add(copyAction);
		popup.add(pasteAction);
		
		JPanel panel = new JPanel();
		panel.setComponentPopupMenu(popup);
		add(panel);
		

	}
}

