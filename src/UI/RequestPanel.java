package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Request.Request;
import Schedule.DayOfWeekTimeSpan;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

// Class that creates the panel that holds the request form
public class RequestPanel{
	private final JPanel panel;
	
	

	public RequestPanel() {	
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		String[] room = {"Gym", "Cafeteria", "Library", "Computer Lab", "Board Room"};
		String[] Bookings = {"1","2","3","4","5"};
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		//Creating Labels for fields
		JLabel fName = new JLabel("First Name: ");
		JLabel lName = new JLabel("Last Name: ");
		JLabel phoneNumber = new JLabel("Phone Number");
		JLabel email = new JLabel("Email: ");
		JLabel rooms = new JLabel("Rooms: ");
		JLabel desc = new JLabel("Description: ");
		JLabel date = new JLabel("Starting Week: ");
		JLabel pTime1 = new JLabel("First Preferred Time: ");
		JLabel pTime2 = new JLabel("Second Preferred Time: ");
		JLabel pTime3 = new JLabel("Third Preferred Time: ");
		JLabel pTime4 = new JLabel("Fourth Preferred Time: ");
		JLabel pTime5 = new JLabel("Fifth Preferred Time: ");
		JLabel numBook = new JLabel("Number Of Bookings: ");
		
		//Creating Fields
		JTextField fNameField = new JTextField(15);
		JTextField lNameField = new JTextField(15);
		JTextField pNumberField = new JTextField(10);
		JTextField emailField = new JTextField(20);
		@SuppressWarnings("unchecked")
		JComboBox room1 = new JComboBox(room);
		JTextArea descriptionArea = new JTextArea(5,20);
		descriptionArea.setLineWrap(true);
		JScrollPane descaBar = new JScrollPane(descriptionArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		JComboBox numBooking = new JComboBox(Bookings);
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		JPanel p1 = new PreferredTimePanel(room1.getSelectedItem().toString()).getPanel();
		JPanel p2 = new PreferredTimePanel(room1.getSelectedItem().toString()).getPanel();
		JPanel p3 = new PreferredTimePanel(room1.getSelectedItem().toString()).getPanel();
		JPanel p4 = new PreferredTimePanel(room1.getSelectedItem().toString()).getPanel();
		JPanel p5 = new PreferredTimePanel(room1.getSelectedItem().toString()).getPanel();
		
		
		//Left Justifying all components
		gbc.anchor = GridBagConstraints.LINE_END;

		//Adding labels to panel
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(fName,gbc);
		
		gbc.gridy ++;
		panel.add(lName,gbc);
		
		gbc.gridy ++;
		panel.add(phoneNumber,gbc);
		
		gbc.gridy ++;
		panel.add(email,gbc);
		
		gbc.gridy ++;
		panel.add(rooms,gbc);
		
		gbc.gridy ++;
		panel.add(desc,gbc);
		
		gbc.gridy ++;
		panel.add(date,gbc);
		
		gbc.gridy ++;
		panel.add(pTime1,gbc);
		
		gbc.gridy ++;
		panel.add(pTime2,gbc);
		
		gbc.gridy ++;
		panel.add(pTime3,gbc);
		
		gbc.gridy ++;
		panel.add(pTime4,gbc);
		
		gbc.gridy ++;
		panel.add(pTime5,gbc);
		
		gbc.gridy ++;
		panel.add(numBook, gbc);
			

		//Adding fields to panel
		//Right justifying all components
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.gridx = 1;
		gbc.gridy = 0; 
		panel.add(fNameField,gbc);
		
		gbc.gridy ++;
		panel.add(lNameField,gbc);
		
		gbc.gridy ++;
		panel.add(pNumberField,gbc);
		
		gbc.gridy ++;
		panel.add(emailField,gbc);
		
		gbc.gridy ++;
		panel.add(room1,gbc);
		
		gbc.gridy ++;
		panel.add(descaBar,gbc);
		
		gbc.gridy ++;
		panel.add(datePicker, gbc);
		
		gbc.gridy ++;
		panel.add(p1,gbc);
		
		gbc.gridy ++;
		panel.add(p2,gbc);
		
		gbc.gridy ++;
		panel.add(p3,gbc);
		
		gbc.gridy ++;
		panel.add(p4,gbc);
		
		gbc.gridy ++;
		panel.add(p5,gbc);
		
		gbc.gridy ++;
		panel.add(numBooking,gbc);
		
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
