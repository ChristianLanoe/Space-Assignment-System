package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// Class that creates the panel that holds the request form
public class RequestPanel{
	private final JPanel panel;
	private String[] hours = { "9:00", "10:00", "11:00", "12:00", "13:00" };

	public RequestPanel() {	
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
	
		GridBagConstraints gbc = new GridBagConstraints();
		
		//Creating Labels for fields
		JLabel fName = new JLabel("First Name: ");
		JLabel lName = new JLabel("Last Name: ");
		JLabel email = new JLabel("Email: ");
		JLabel roomNum = new JLabel("Room Number: ");
		JLabel sTime = new JLabel("Start Time: ");
		JLabel eTime = new JLabel("End Time: ");
		JLabel desc = new JLabel("Description: ");
		
		//Creating Fields
		JTextField fNameField = new JTextField(15);
		JTextField lNameField = new JTextField(15);
		JTextField emailField = new JTextField(20);
		JTextField roomIdField = new JTextField(5);
		JComboBox<String> sTimeComboBox = new JComboBox<String>(hours);
		JComboBox<String> eTimeComboBox = new JComboBox<String>(hours);
		JTextArea descriptionArea = new JTextArea(5,20);
		descriptionArea.setLineWrap(true);
		JScrollPane descaBar = new JScrollPane(descriptionArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		//Left Justifying all components
		gbc.anchor = GridBagConstraints.LINE_END;

		//Adding labels to panel
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(fName,gbc);
		
		gbc.gridy ++;
		panel.add(lName,gbc);
		
		gbc.gridy ++;
		panel.add(email,gbc);
		
		gbc.gridy ++;
		panel.add(roomNum,gbc);
		
		gbc.gridy ++;
		panel.add(sTime,gbc);
		
		gbc.gridy ++;
		panel.add(eTime,gbc);
		
		gbc.gridy ++;
		panel.add(desc,gbc);

		//Adding fields to panel
		//Right justifying all components
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.gridx = 1;
		gbc.gridy = 0; 
		panel.add(fNameField,gbc);
		
		gbc.gridy ++;
		panel.add(lNameField,gbc);
		
		gbc.gridy ++;
		panel.add(emailField,gbc);
		
		gbc.gridy ++;
		panel.add(roomIdField,gbc);
		
		gbc.gridy ++;
		panel.add(sTimeComboBox,gbc);
		
		gbc.gridy ++;
		panel.add(eTimeComboBox,gbc);
		
		gbc.gridy ++;
		panel.add(descaBar,gbc);
		
		//Adding a separate Panel for the submit button
		JPanel submitButtonPanel = new JPanel();
		GridBagConstraints submitConstraints = new GridBagConstraints();
		JButton submitButton = new JButton("Submit");
		submitButtonPanel.add(submitButton, submitConstraints);
		gbc.gridy ++;
		gbc.anchor = GridBagConstraints.LINE_END;
		panel.add(submitButtonPanel,gbc);
		
		panel.setFocusable(true); 
	}
	// Returns the panel created by this class
	public JPanel getPanel() {
		return panel;
	}
}
