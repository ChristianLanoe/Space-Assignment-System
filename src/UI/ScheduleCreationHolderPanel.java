package UI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import UI.ScheduleCreationPanel;
import Tests.ScheduleCreation_Tester;

public class ScheduleCreationHolderPanel {
	private final JPanel panel;
	private final JPanel holder;
	public ScheduleCreationHolderPanel(){
		
		holder = new JPanel();
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints roomCreator = new GridBagConstraints();
		JLabel semesterlabel = new JLabel("Semester:");
		JLabel roomlabel = new JLabel("Room:");
		
		String[] semester = {"Fall", "Winter","Summer"};
		String[] rooms = {"Board Room","Cafeteria","Computer Lab","Gym","Library"};
		
		JComboBox room = new JComboBox(rooms);
		holder.setPreferredSize(new Dimension(1000,1000));
		holder.add(panel);
		
		JScrollPane scrPane = new JScrollPane(panel);
		scrPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrPane.setPreferredSize(new Dimension(1000,1000));
		
		holder.add(scrPane);
		
		roomCreator.gridx = 0;
		roomCreator.gridy = 0;
		
		JComboBox semesters = new JComboBox(semester);
		panel.add(semesterlabel,roomCreator);
		roomCreator.gridx++;
		panel.add(semesters,roomCreator);
		roomCreator.gridy++;
		roomCreator.gridx=0;
		
		panel.add(roomlabel,roomCreator);
		roomCreator.gridx++;
		panel.add(room,roomCreator);
		roomCreator.gridy++;
		roomCreator.gridx=0;
		
		JButton addpanel = new JButton("+");
		panel.add(addpanel,roomCreator);
		roomCreator.gridy++;
		
		JButton submit = new JButton("Submit");
		panel.add(submit,roomCreator);
		
		roomCreator.gridx=2;
		roomCreator.gridy=0;
		panel.add(new ScheduleCreationPanel().getPanel(),roomCreator);
		JButton invis = new JButton("      ");
		roomCreator.gridy++;
		invis.setOpaque(false);
		invis.setContentAreaFilled(false);
		invis.setBorderPainted(false);
		panel.add(invis,roomCreator);
		
		addpanel.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				roomCreator.gridx=2;
				roomCreator.gridy++;
				panel.add(new ScheduleCreationPanel().getPanel(),roomCreator);
				panel.revalidate();
				panel.validate();
				//roomCreator.gridy++;
				//roomCreator.gridy++;
				JButton invis = new JButton("      ");
				roomCreator.gridy++;
				invis.setOpaque(false);
				invis.setContentAreaFilled(false);
				invis.setBorderPainted(false);
				panel.add(invis,roomCreator);
				
				
			}
		});
		
		submit.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				
			}
		});
	}
	public JPanel getPanel() {
		return holder;
	}

}
