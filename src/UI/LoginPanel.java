package UI;
import java.awt.event.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Class to create the panel that displays the login form
public class LoginPanel {
	JPanel panel;
	
	public LoginPanel() {
		panel = new JPanel(new GridBagLayout());
		
		JLabel username = new JLabel("Username: ");
		JLabel password = new JLabel("Password: ");
		
		JTextField userField = new JTextField(20);
		JTextField passField = new JTextField(20);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		panel.add(username,gbc);
		gbc.gridy ++;
		panel.add(password,gbc);
		gbc.gridx ++;
		gbc.gridy = 0;
		panel.add(userField,gbc);
		gbc.gridy ++;
		panel.add(passField,gbc);
		
		JPanel submitButtonPanel = new JPanel();
		GridBagConstraints submitConstraints = new GridBagConstraints();
		JButton submitButton = new JButton("Submit");
		submitButtonPanel.add(submitButton, submitConstraints);
		class Action implements ActionListener{//Return the login information
			
			public void actionPerformed (ActionEvent e){
			//	String user = userField.getText();
			//	String pass = passField.getText();
			//
			// Username and password for login
			//
			}
		}
		submitButton.addActionListener(new Action());
		gbc.gridy ++;
		gbc.anchor = GridBagConstraints.LINE_END;
		panel.add(submitButtonPanel,gbc);
	}

	public JPanel getPanel() {
		return panel;
	}
}
