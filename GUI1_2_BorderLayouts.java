import java.awt.*;		 			// Required to have a Container variable and Border Layout etc
import java.awt.event.*; 			// Required for ActionListener Interface
import javax.swing.*;    			// Required for Swing classes
//import javax.swing.border.Border;
import javax.swing.SwingConstants;  // Required for SwingConstants classes
//import java.text.DecimalFormat;		// Required for decimal format class

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
public class GUI1_2_BorderLayouts extends JFrame 
{
	private final static int WINDOW_WIDTH = 400, // Window Width
							WINDOW_HEIGHT = 400; // Window Height
	private Container 	c;						// content pane for JFrame
	private JButton 	exitButton,				// To reference the button for exiting
						calcButton;				// To reference the button for calculations
	private JLabel		myLabel1;				// To reference a label
	private JPanel 		imagePanel ;			// To reference a Panel used to hold a label
	private JLabel 		imageLabel;				// To reference a label used to show an image
	//private JLabel		picLabe;
	private JPanel          myPanel1;			// To reference a Panel1
	private JPanel          myPanel2;			// To reference a Panel2
	private Icon 			carImage;			// To reference a car image	
	//private JTabbedPane		myTabbedPane;
   /* private JCheckBox    	oilChangeCheckBox,	// To reference to oilChangeCheckBox
    						lubeCheckBox,		// To reference to lubeCheckBox
							radFlushCheckBox,	// To reference to radFlushCheckBox
							transFlushCheckBox,	// To reference to transFlushCheckBox
							inspectCheckBox,	// To reference to inspectCheckBox
							muffReplaceCheckBox,// To reference to muffReplaceCheckBox
							tireRotateCheckBox;	// To reference to tireRotateCheckBox
    */
    /**
     * Constructor for objects of class JoesAutomotive 
     */
    public GUI1_2_BorderLayouts()
    {
    	c = getContentPane();
    	
    	JTabbedPane myTabbedPane = new JTabbedPane(JTabbedPane.TOP);					// create JTabbedPane with tabs at top of panels
    	
    	// set up panel1 and add it to JTabbedPane
    	// create first panel for tab 1
    	myPanel1 = new JPanel();														
    	
    	// add label to panel
    	myPanel1.add(new JLabel("Try to get image of car here", SwingConstants.LEFT));	
    	myPanel1.setLayout(new BorderLayout());
    	//myPanel1.add(new BorderLayout());
    	exitButton = new JButton("Exit");
    	myPanel1.add(exitButton, BorderLayout.SOUTH);
    	
    	myTabbedPane.addTab("Charges", null, myPanel1, "hjkhj");
    	
    	
    	// method used to set up the image panel
    	buildImagePanel();
    	myPanel1.add(imagePanel, BorderLayout.NORTH);
    	carImage = new ImageIcon("car.gif");
    	imageLabel.setIcon(carImage);
    	imageLabel.setText("Joe's Automotive");
    	
    	
    	// create second panel for tab 2
    	myPanel2 = new JPanel();														
    	
    	// add label to panel
    	myPanel2.add(new JLabel("", SwingConstants.LEFT));								
    	myTabbedPane.addTab("Summary", null, myPanel2,"");
    	
    	c.add(myTabbedPane);					// add JTabbedPane to frame
    	buildFrameAtributes();					// call buildFrameAtributes method to set up frame with specified JFrame parameters
    	
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
    
    
    /**
    * Used to add our image to a panel
    *
    */
    private void buildImagePanel()
    {
    	imagePanel = new JPanel();
    	imageLabel = new JLabel();
    	imagePanel.add(imageLabel);
    }
    
    
    /**
     * The main method creates an instance of JoesAutomotive
     * class which causes it to display
     * its window and execute code that is chosen by user 
     * when they interact with its components
     */
    public static void main(String args[])
    {
    	new GUI1_2_BorderLayouts();
    }


}
