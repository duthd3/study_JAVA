import java.awt.geom.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * A frame with a panel that demonstrates color change actions.
 */
public class ActionFrame extends JFrame
{
	 Color c;
	
   
   private JPanel buttonPanel;
   private static final int DEFAULT_WIDTH =400;
   private static final int DEFAULT_HEIGHT =500;
   
   public ActionFrame()
   {
	 
	   DrawComponent d = new DrawComponent();
	   
	      add(d);
	      pack();
	  
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
      
      buttonPanel = new JPanel();
     
      
     
      
      
      // define actions
      Action yellowAction = new ColorAction("Yellow", new ImageIcon("yellow-ball.gif"),
            Color.YELLOW);
      Action blueAction = new ColorAction("Blue", new ImageIcon("blue-ball.gif"), Color.BLUE);
      Action redAction = new ColorAction("Red", new ImageIcon("red-ball.gif"), Color.RED);

      // add buttons for these actions
      buttonPanel.add(new JButton(yellowAction));
      buttonPanel.add(new JButton(blueAction));
      buttonPanel.add(new JButton(redAction));
    

      // add panel to frame
      add(buttonPanel,BorderLayout.SOUTH);

      // associate the Y, B, and R keys with names
      InputMap imap = buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
      imap.put(KeyStroke.getKeyStroke("ctrl Y"), "panel.yellow");
      imap.put(KeyStroke.getKeyStroke("ctrl B"), "panel.blue");
      imap.put(KeyStroke.getKeyStroke("ctrl R"), "panel.red");

      // associate the names with actions
      ActionMap amap = buttonPanel.getActionMap();
      amap.put("panel.yellow", yellowAction);
      amap.put("panel.blue", blueAction);
      amap.put("panel.red", redAction);
      
     
    
   }
   class DrawComponent extends JComponent
	{
	   private static final int DEFAULT_WIDTH = 400;
	   private static final int DEFAULT_HEIGHT = 400;

	   public void paintComponent(Graphics g)
	   {
		  
	      Graphics2D g2 = (Graphics2D) g;
	      g2.setColor(c);
	      // draw a rectangle

	      double leftX = 100;
	      double topY = 100;
	      double width = 200;
	      double height = 150;

	      Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
	      g2.draw(rect);

	      // draw the enclosed ellipse

	      Ellipse2D ellipse = new Ellipse2D.Double();
	      ellipse.setFrame(rect);
	      g2.draw(ellipse);

	      // draw a diagonal line

	      g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));

	      // draw a circle with the same center

	      double centerX = rect.getCenterX();
	      double centerY = rect.getCenterY();
	      double radius = 150;

	      Ellipse2D circle = new Ellipse2D.Double();
	      circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
	      g2.draw(circle);

	   }
	   
	   public Dimension getPreferredSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }
	}
	
	
   private DrawComponent dc;
   
   public class ColorAction extends AbstractAction
   {
      /**
       * Constructs a color action.
       * @param name the name to show on the button
       * @param icon the icon to display on the button
       * @param c the background color
       */
	  
      public ColorAction(String name, Icon icon, Color c)
      {
         putValue(Action.NAME, name);
         putValue(Action.SMALL_ICON, icon);
         putValue(Action.SHORT_DESCRIPTION, "Set panel color to " + name.toLowerCase());
         putValue("color", c);
      }

      public void actionPerformed(ActionEvent event)
      {
    	  
         Color c = (Color) getValue("color");
       
         ActionFrame.this.c = c;
         add(new DrawComponent(), BorderLayout.CENTER);
  	     pack();
      }
     
   }
}
