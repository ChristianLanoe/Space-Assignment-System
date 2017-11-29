package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Schedule.DayOfWeekTimeSpan;
import Schedule.RoomSchedule;

public class PreferredTimePanel {
	private final JPanel panel;
	private String room;
	private JComboBox start;
	private JComboBox end;
	private LocalDate date;
	private DayOfWeek dow;
	
	public PreferredTimePanel(String room, LocalDate date){
		this.date = date;
		this.room = room;
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		String[] Stimes = null;
		String[] Etimes = null;
		
		ArrayList<String> ATimes;
		String[] startTime = null;
		String[] endTime = null;
		
		GridBagConstraints pTimeConstraints = new GridBagConstraints();
		
		//Create buttons for each day of the week
		JRadioButton mon = new JRadioButton("Monday");
		JRadioButton tue = new JRadioButton("Tuesday");
		JRadioButton wed = new JRadioButton("Wednesday");
		JRadioButton thu = new JRadioButton("Thursday");
		JRadioButton fri = new JRadioButton("Friday");
		JRadioButton sat = new JRadioButton("Saturday");
		JRadioButton sun = new JRadioButton("Sunday");
		
		//Combo Boxes for the start and end times
		JComboBox start = new JComboBox(Stimes);
		JComboBox end = new JComboBox(Etimes);
		
		//Button group so only one day can be selected
		ButtonGroup bG = new ButtonGroup();
		bG.add(mon);
		bG.add(tue);
		bG.add(wed);
		bG.add(thu);
		bG.add(fri);
		bG.add(sat);
		bG.add(sun);
		
		public DayOfWeekTimeSpan getInfo(){
			
			
			
		}
		
		mon.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				dow = DayOfWeek.MONDAY;
				System.out.print(DayOfWeek.MONDAY.toString());
				//TODO ComboBox needs to be updated when Monday selected
				mon.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						
						
					}
				});
			}
		});
		
		tue.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				dow = DayOfWeek.TUESDAY;
				System.out.print("TUESDAY");
			}
		});
		
		wed.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				dow = DayOfWeek.WEDNESDAY;
				System.out.print("WEDNESDAY");
			}
		});
		
		thu.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				dow = DayOfWeek.THURSDAY;
				System.out.print("THURSDAY");
			}
		});
		
		fri.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				dow = DayOfWeek.FRIDAY;
				System.out.print("FRIDAY");
			}
		});
		
		sat.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				dow = DayOfWeek.SATURDAY;
				System.out.print("SATURDAY");
			}
		});
		
		sun.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				dow = DayOfWeek.SUNDAY;
				System.out.print("SUNDAY");
			}
		});
		
		//Layout of the buttons
		pTimeConstraints.gridx = 0;
		pTimeConstraints.gridy = 0;
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
		pTimeConstraints.gridy = 1;
		panel.add(start, pTimeConstraints);		
		
		pTimeConstraints.gridx++;
		panel.add(end, pTimeConstraints);
		
	}
//	public String[] 
	public void setStart(JComboBox start){
		this.start = start;
	}
	
	public void setEnd(JComboBox end){
		this.end = end;
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
