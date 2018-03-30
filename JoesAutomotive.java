import java.awt.*;		 			// Required to have a Container variable and Border Layout etc
import java.awt.event.*; 			// Required for ActionListener Interface
import javax.swing.*;    			// Required for Swing classes
//import javax.swing.border.Border;
import javax.swing.SwingConstants;
import java.text.DecimalFormat;		// Required for decimal format class
//C:\Users\TEMP\AppData\Local\GitHubDesktop\GitHubDesktop.exe
/**
 * JoesAutomotive : A vehicle maintenance and repair cost calculator for Joe's Automotive.<br>
 *
 * Assignment #1: GUI Applications 1<br>
 * Course: ADEV-1001<br>
 * Date Created: 2018-02-24<br>
 * Last Updated: 2018-02-24<br>
 *
 * @author: Chris Lenius
 * @version: 1
 */
public class JoesAutomotive extends JFrame 
{
	private final static int WINDOW_WIDTH = 400, // Window Width
							WINDOW_HEIGHT = 400; // Window Height
	private Container 	c;						// content pane for JFrame
	private JButton 	exitButton,				// To reference the button for exiting
						calcButton;				// To reference the button for calculations
	private JLabel		myLabel;				// To reference a label
	//private JLabel		picLabel;
	private JPanel          myPanel;			// To reference a Panel
	private JTabbedPane		myTabbedPane;
    private JCheckBox    	oilChangeCheckBox,	// To reference to oilChangeCheckBox
    						lubeCheckBox,		// To reference to lubeCheckBox
							radFlushCheckBox,	// To reference to radFlushCheckBox
							transFlushCheckBox,	// To reference to transFlushCheckBox
							inspectCheckBox,	// To reference to inspectCheckBox
							muffReplaceCheckBox,// To reference to muffReplaceCheckBox
							tireRotateCheckBox;	// To reference to tireRotateCheckBox
    
    /**
     * Constructor for objects of class JoesAutomotive 
     */
    public JoesAutomotive()
    {
    	c = getContentPane();
    	
    	myTabbedPane = new JTabbedPane(JTabbedPane.TOP);	// create a tabbed pane with tabs at top of panels
    	
    	
    	
    	buildFrameAtributes();			// call buildFrameAtributes method to set up frame with specified JFrame parameters
    	
    }
    
    /**
    * Used to set specified JFrame parameters
    *
    */
    private void buildFrameAtributes()
    {
    	setTitle("Joe's Automotive");
    	setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    }
    
    public static void main(String args[])
    {
    	new JoesAutomotive();
    }


}
