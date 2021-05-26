import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A frame with a button panel
 */
public class ButtonFrame extends JFrame
{
   private JPanel buttonPanel;
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;
   
   
   public ButtonFrame()
   {      
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      // create buttons
      JButton yellowButton = new JButton("Yellow");  
      JButton blueButton = new JButton("Blue");     
      JButton redButton = new JButton("Red");     
      JButton greenButton = new JButton("Green");
     
      buttonPanel = new JPanel();
      buttonPanel.setLayout(new BorderLayout());
      // add buttons to panel
      buttonPanel.add(yellowButton, BorderLayout.WEST);
      
      buttonPanel.add(blueButton, BorderLayout.SOUTH);
      buttonPanel.add(redButton, BorderLayout.NORTH);
      buttonPanel.add(greenButton, BorderLayout.EAST);
      
      // add panel to frame
      add(buttonPanel);

      // create button actions
      ColorAction yellowAction = new ColorAction(Color.YELLOW);
      ColorAction blueAction = new ColorAction(Color.BLUE);
      ColorAction redAction = new ColorAction(Color.RED);
      ColorAction greenAction = new ColorAction(Color.GREEN);

      // associate actions with buttons
      yellowButton.addActionListener(yellowAction);
      blueButton.addActionListener(blueAction);
      redButton.addActionListener(redAction);
      greenButton.addActionListener(greenAction);
   }

   /**
    * An action listener that sets the panel's background color.
    */
   private class ColorAction implements ActionListener
   {
      private Color backgroundColor;

      public ColorAction(Color c)
      {
         backgroundColor = c;
      }

      public void actionPerformed(ActionEvent event)
      {
         buttonPanel.setBackground(backgroundColor);
      }
   }
}
