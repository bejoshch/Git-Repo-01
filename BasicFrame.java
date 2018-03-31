

import java.awt.*;
import javax.swing.*;




public class BasicFrame extends JFrame
{
	private final static int	WINDOW_WIDTH = 600,
								WINDOW_HEIGHT = 400;
	private Container			c;
	private NonroutineServcesPanel myPanel;
	
	/**
	 * Constructor
	 */
	public BasicFrame(){
		c = getContentPane();
		//c.setLayout(new BorderLayout());
		
		myPanel = new NonroutineServcesPanel();
		// less space and this comment were the changes.

		setTitle("basic Frame");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		c.add(myPanel, BorderLayout.CENTER);
		
	}
	
	public static void main(String args[])
	{
		new BasicFrame();
	}
}
