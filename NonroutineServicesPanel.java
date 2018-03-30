

import java.awt.*;
import javax.swing.*;

public class NonroutineServcesPanel extends JPanel
{
	private JLabel		partChargeLaebl,
						hoursOfLaborLabel;
	private JTextArea	partChargeTextArea,
						hoursOfLaborTextArea;
//	private	Border		nonroutineServicesBorder;
	
	/**
	CONSTRUCTOR
	*/
	public NonroutineServcesPanel()
	{
		setLayout(new GridLayout(1,2));
			
		add(partChargeLaebl = new JLabel("Parts Charges"));
		add(partChargeTextArea = new JTextArea("0"));
		add(hoursOfLaborLabel = new JLabel("Hours of Labor"));
		add(hoursOfLaborTextArea = new JTextArea("0"));
		setBorder(BorderFactory.createTitledBorder("Nonroutine Services"));
	}
	
}