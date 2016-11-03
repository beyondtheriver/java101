import javax.swing.*;	   	   //Needed for Swing classes
import java.awt.event.*;		   //Needed for event listener interface
import java.text.DecimalFormat;  //Needed for DecimalFormat conversion.

/**
	The wholesalePriceConverter class provides a GUI window which 
	asks for item, wholesale cost, and markup percentage. When the 
	Calculate button is clicked, a dialog box is displayed with the item, 
	and the wholesale price converted to the retail price.
*/
public class WholesalePriceConverter extends JFrame		//page 380-381
{	private JPanel panel;		            //To reference a panel
	private JLabel itemLabel;	            //To reference a label
	private JTextField itemText;			   //To reference a text field
	private JLabel wholesaleLabel;
	private JTextField wholesaleText;
	private JLabel markupLabel;
	private JTextField markupText;
	private JButton calcButton;		      //To reference a button
	private final int WINDOW_WIDTH = 300;  //Window width
	private final int WINDOW_HEIGHT = 175; //Window height

	/**
		Constructor
	*/

	public WholesalePriceConverter()
	{
		//Set the window title
		setTitle("Wholesale to Retail Price Converter");

		//Set the size of the window.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		//Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Build the panel and add it to the frame.
		buildPanel();

		//Add the panel to the frame’s content pane.
		add(panel);

		//Display the window.
		setVisible(true);
	}

	/**
		The buildPanel method adds a label, text field, and a button to a panel.
	*/
	
	private void buildPanel()
	{
		//Add a FlowLayout manager to the content pane.
		//setLayout(new FlowLayout());

		//Create a label to display instructions for item.
		itemLabel = new JLabel("Enter item: ");
		
		//Create a text field 15 characters wide.
		itemText = new JTextField(15);

		//Create a label to display instructions for wholesale price.
		wholesaleLabel = new JLabel("Enter wholesale price: ");

		//Create a text field 10 characters wide.
		wholesaleText = new JTextField(10);

		//Create a label to display instructions for markup percentage.
		markupLabel = new JLabel("Enter markup percentage: ");

		//Create a text field 10 characters wide.
		markupText = new JTextField(10);

		//Create a button with the caption “Calculate”.
		calcButton = new JButton("Calculate");

		//Add an action listener to the button.
		calcButton.addActionListener(new CalcButtonListener());

		//Create a Panel object and let the panel field reference it.
		panel = new JPanel();

		//Add the labels, text fields, and button components to the panel.
		panel.add(itemLabel);
		panel.add(itemText);
		panel.add(wholesaleLabel);
		panel.add(wholesaleText);
		panel.add(markupLabel);
		panel.add(markupText);
		panel.add(calcButton);
	}

	/**
		CalcButtonListener is an action listener class for the Calculate button.
	*/

	private class CalcButtonListener implements ActionListener
	{
		/**
			The actionPerformed method executes when the user clicks
			on the Calculate button.
			@param e The event object.
		*/

		public void actionPerformed(ActionEvent e)
		{
			String inputi;			//To hold the user’s input of item.
			String inputW;		   //To hold the user’s input of wholesale.
			String inputM;		   //To hold the user’s input of multiplier.
			double markup;		   //The user’s input divided by 100.
			double retail;			//The converted retail price.
			
			//Get the text entered by the user for item.
			inputi = itemText.getText();

			//Get the text entered by the user for wholesale cost into the text field.
			inputW = wholesaleText.getText();

			//Get the text entered by the user for markup.
			inputM = markupText.getText();

			//Convert markupText to a double then divide it by 100.
			markup = Double.parseDouble(inputM) / 100.0;

			//Convert wholesaleText to a double then convert it to retail price.
			retail = Double.parseDouble(inputW) * markup;
         
         //Create a DecimalFormat object to format output.
         DecimalFormat dollar = new DecimalFormat("#,##0.00");

			//Display the result.
			JOptionPane.showMessageDialog(null, "$" + dollar.format(retail) 
                                       + " is the retail price of " 
								               + inputi + " with a wholesale price of $"
								               + inputW + " and a markup of " + inputM + "%.");
		}
	}
   //Creat a main method to run the application.
   public static void main(String[] args)
   {
      new WholesalePriceConverter();
   }
}