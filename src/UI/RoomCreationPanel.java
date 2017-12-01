package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RoomCreationPanel {
	private final JPanel panel;
	
	public RoomCreationPanel(){
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		String[] times = {"skdhfbvlosiu", "bdfhvjbx","cdsfbxdfb0","dsfgbdfb","sdbgfgbe","fsdgbdf","gsdbg"};
		String[] semester = {"Fall", "Winter","Summer"};

		GridBagConstraints pTimeConstraints = new GridBagConstraints();
		
		//Create buttons for each day of the week
		JCheckBox mon = new JCheckBox("Monday");
		JCheckBox tue = new JCheckBox("Tuesday");
		JCheckBox wed = new JCheckBox("Wednesday");
		JCheckBox thu = new JCheckBox("Thursday");
		JCheckBox fri = new JCheckBox("Friday");
		JCheckBox sat = new JCheckBox("Saturday");
		JCheckBox sun = new JCheckBox("Sunday");
		
		JLabel semesterlabel = new JLabel("Semester:");
		JLabel roomlabel = new JLabel("Room:");
		JLabel widthlabel = new JLabel("Width:");
		JLabel lengthlabel = new JLabel("Length:");
		JLabel capacitylabel = new JLabel("Capacity:");
		
		JLabel stlabel = new JLabel("Start Time:");
		JLabel etlabel = new JLabel("End Time:");
		
		JTextField room = new JTextField(15);
		JTextField width = new JTextField(5);
		JTextField length = new JTextField(5);
		JTextField capacity = new JTextField(5);
		
		
		//Combo Boxes for the start and end times
		JComboBox semesters = new JComboBox(semester);
		JComboBox start = new JComboBox(times);
		JComboBox end = new JComboBox(times);
		
		//Button group so only one day can be selected
		panel.add(semesters);
		panel.add(mon);
		panel.add(tue);
		panel.add(wed);
		panel.add(thu);
		panel.add(fri);
		panel.add(sat);
		panel.add(sun);
		
		mon.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.print("MONDAY");
			}
		});
		
		tue.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.print("TUESDAY");
			}
		});
		
		wed.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.print("WEDNESDAY");
			}
		});
		
		thu.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.print("THURSDAY");
			}
		});
		
		fri.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.print("FRIDAY");
			}
		});
		
		sat.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.print("SATURDAY");
			}
		});
		
		sun.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.print("SUNDAY");
			}
		});
		
		//Layout of the buttons
		pTimeConstraints.gridx = 0;
		pTimeConstraints.gridy = 0;
		panel.add(semesterlabel,pTimeConstraints);
		pTimeConstraints.gridx ++;
		panel.add(semesters, pTimeConstraints);
		
		pTimeConstraints.gridx ++;
		panel.add(roomlabel);
		
		pTimeConstraints.gridx ++;
		panel.add(room);
		
		pTimeConstraints.gridx ++;
		panel.add(widthlabel);
		
		pTimeConstraints.gridx ++;
		panel.add(width);
		
		pTimeConstraints.gridx ++;
		panel.add(lengthlabel);
		
		pTimeConstraints.gridx ++;
		panel.add(length);
		
		pTimeConstraints.gridx ++;
		panel.add(capacitylabel);
		
		pTimeConstraints.gridx ++;
		panel.add(capacity);
		
		
		pTimeConstraints.gridx = 0;
		pTimeConstraints.gridy ++;
		panel.add(mon, pTimeConstraints);
		
		pTimeConstraints.gridx ++;
		panel.add(tue, pTimeConstraints);
		
		pTimeConstraints.gridx ++;
		panel.add(wed, pTimeConstraints);
		
		pTimeConstraints.gridx ++;
		panel.add(thu, pTimeConstraints);
		
		pTimeConstraints.gridx ++;
		panel.add(fri, pTimeConstraints);

		pTimeConstraints.gridx ++;
		panel.add(sat, pTimeConstraints);
		
		pTimeConstraints.gridx ++;
		panel.add(sun, pTimeConstraints);
		
		pTimeConstraints.gridx = 0;
		pTimeConstraints.gridy++;
		
		panel.add(stlabel, pTimeConstraints);		
		
		pTimeConstraints.gridx ++;
		panel.add(start, pTimeConstraints);
		
		pTimeConstraints.gridx = 0;
		pTimeConstraints.gridy ++;
		panel.add(etlabel, pTimeConstraints);	
		
		pTimeConstraints.gridx++;
		panel.add(end, pTimeConstraints);
		
	}
	public JPanel getPanel() {
		return panel;
	}
}
