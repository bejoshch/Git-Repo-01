import javax.swing.*;
import java.awt.*;

/**
 * Created by Chris on 2018-03-18.
 */
public class RoutineServices extends JPanel
{

    // Creating 2 parallel arrays to match the name of service to the cost of the service
    private final static String[]   ROUTINE_SERVICE ={  "oilCheck", "lubeCheck",
                                                            "radCheck", "transCheck",
                                                            "inspectCheck", "mufflerCheck",
                                                            "tireCheck"};

    private final static double[]   ROUTINE_SERVICE_COST = { 26.00, 18.00, 30.00,
                                                            30.00, 15.00, 100.00, 20.00};

    //Creating the checkbox array to hold the jcheckbox objects.
    private JCheckBox[]            routineServiceOptions = new JCheckBox[ROUTINE_SERVICE_COST.length];

    /**
     * Constructor
     */
    public RoutineServices()
    {
        setLayout(new GridLayout(7,1));

        // Create the checkboxes and add them to the array: 'routineServiceOptions'
        for(int i = 0; i < ROUTINE_SERVICE_COST.lengthi; i++ )
        {
            JCheckBox routineServiceOptions[] = new JCheckBox[i];

            //Add the checkbox to the panel
            add(routineServiceOptions[i]);
        }
        setBorder(BorderFactory.createTitledBorder("Routine Services"));

    }

    public double getRoutineServiceCost()
    {
        double routineServiceTotal = 0.00;
        for(int i = 0; i < ROUTINE_SERVICE_COST.length; i++)
        {
            if(routineServiceOptions[i].isSelected())
            {
                routineServiceTotal += ROUTINE_SERVICE_COST[i];
            }
        }
        return routineServiceTotal;
    }
}
