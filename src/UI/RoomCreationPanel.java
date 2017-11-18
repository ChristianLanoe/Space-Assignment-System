package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Room.Amenity;
import Room.RoomType;
public class RoomCreationPanel {
	JPanel panel;
	GridBagConstraints gbc;
	
	public RoomCreationPanel() {
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		
		gbc = new GridBagConstraints();
		
		JLabel roomLabel = new JLabel("Room Number: ");
		JLabel roomTypeLabel = new JLabel("Room Type: "); 
		JLabel capacityLabel = new JLabel("Capacity: ");
		JLabel amenityLabel = new JLabel("Amenities: ");
		JLabel lengthLabel = new JLabel("Length: ");
		JLabel widthLabel = new JLabel("Width: ");
		
		JTextField roomTF = new JTextField(5);
		JComboBox<RoomType> roomTypeCB = new JComboBox<RoomType>(RoomType.values());
		JTextField capacityTF = new JTextField(10);
		JComboBox<Amenity> amenityCB = new JComboBox<Amenity>(Amenity.values());
		JTextField lengthTF = new JTextField(5);
		JTextField widthTF = new JTextField(5);
		
		//Adding labels to panel
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(roomLabel, gbc);
		
		gbc.gridy ++;
		panel.add(roomTypeLabel,gbc);
		
		gbc.gridy ++;
		panel.add(capacityLabel, gbc);
		
		gbc.gridy ++;
		panel.add(amenityLabel, gbc);
		
		gbc.gridy ++;
		panel.add(lengthLabel, gbc);
		
		gbc.gridy ++;
		panel.add(widthLabel, gbc);
		
		//Adding fields to panel
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(roomTF,gbc);
		
		gbc.gridy ++;
		panel.add(roomTypeCB, gbc);
		
		gbc.gridy ++;
		panel.add(capacityTF, gbc);
		
		gbc.gridy ++;
		panel.add(amenityCB, gbc);
		gbc.gridx = GridBagConstraints.RELATIVE;
		panel.add(new JButton("+"),gbc);	//This button will be used to add more comboboxes for amenities to the form
		
		gbc.gridy ++;
		panel.add(lengthTF,gbc);
		
		gbc.gridy ++;
		panel.add(widthTF, gbc);
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
