package UI;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RequestPanel {
	private final JPanel requestPanel;
	private Dimension dimension;
	private JLabel fName;
	private JLabel lName;
	private JLabel email;
	private JLabel roomNum;
	private JLabel sTime;
	private JLabel eTime;
	private JLabel desc;
	private JTextField fNameField;
	private JTextField lNameField;
	private JTextField emailField;
	private JTextField roomIdField;
	private JComboBox sTimeComboBox;
	private JComboBox eTimeComboBox;
	private JTextArea descriptionArea;
	private String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };

	
	private int fNameFieldLength = 15;
	private int lNameFieldLength = 15;
	private int emailFieldLength = 20;
	private int roomIdFieldLength = 5;
	private int COLUMNS = 2;
	private int V_GAP = 0;
	
//	private GridBagConstraints lastConstraints = null;
//	private GridBagConstraints middleConstraints = null;
//	private GridBagConstraints labelConstraints = null;
//	
	
	public RequestPanel(Dimension d) {
		requestPanel = new JPanel();
		this.dimension = d;
		requestPanel.setSize(dimension);
		requestPanel.setLayout(new GridLayout(0,COLUMNS,0,V_GAP));
		
		createLabels();
		createFillableFields();
		
		descriptionArea.setLineWrap(true);
		JScrollPane descaBar = new JScrollPane(descriptionArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		JButton submitButton = new JButton("Submit");
		
		requestPanel.add(fName);
		requestPanel.add(fNameField);
		
		requestPanel.add(lName);
		requestPanel.add(lNameField);
		
		requestPanel.add(email);
		requestPanel.add(emailField);
		
		requestPanel.add(roomNum);
		requestPanel.add(roomIdField);
		
		requestPanel.add(sTime);
		requestPanel.add(sTimeComboBox);
		
		requestPanel.add(eTime);
		requestPanel.add(eTimeComboBox);
		
		requestPanel.add(desc);
		requestPanel.add(descaBar);
		
		requestPanel.add(submitButton);
		requestPanel.setFocusable(true); 
	}
	
	private void createLabels() {
		fName = new JLabel("First Name: ");
		lName = new JLabel("Last Name: ");
		email = new JLabel("Email: ");
		roomNum = new JLabel("Room Number: ");
		sTime = new JLabel("Start Time: ");
		eTime = new JLabel("End Time: ");
		desc = new JLabel("Description: ");
	}
	
	private void createFillableFields() {
		fNameField = new JTextField(fNameFieldLength);
		lNameField = new JTextField(lNameFieldLength);
		emailField = new JTextField(emailFieldLength);
		roomIdField = new JTextField(roomIdFieldLength);
		sTimeComboBox = new JComboBox<String>(petStrings);
		eTimeComboBox = new JComboBox<String>(petStrings);
		descriptionArea = new JTextArea(2,1);
	}
	
	public JPanel getRequestPanel() {
		return this.requestPanel;
	}
}
