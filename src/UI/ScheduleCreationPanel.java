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

import Schedule.DayOfWeekTimeSpan;

public class ScheduleCreationPanel {
	private final JPanel panel;
	
	public ScheduleCreationPanel(){
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		String[] times = {"00:00", "01:00","02:00","03:00","04:00","05:00","06:00","07:00","08:00","09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00","22:00","23:00"};
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
		
		
		
		
		
		JLabel stlabel = new JLabel("Start Time:");
		JLabel etlabel = new JLabel("End Time:");
		
		
	
		
		
		//Combo Boxes for the start and end times
		
		JComboBox start = new JComboBox(times);
		JComboBox end = new JComboBox(times);
		
		
		
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
	
	public DayOfWeekTimeSpan getInfo(){
		DayOfWeekTimeSpan temp = new DayOfWeekTimeSpan(null, null);
	
		return temp;
	}
	public JPanel getPanel() {
		return panel;
	}
}
