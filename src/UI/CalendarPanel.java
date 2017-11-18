package UI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

// Class for creating panel that displays the calendar for all rooms
public class CalendarPanel {
	JPanel panel;
	
	public CalendarPanel() {
		panel = new JPanel();
		JTable table = new JTable();
		
		//Making the table vertically scrollable
		JScrollPane tableScroll = new JScrollPane(table);
		tableScroll.createVerticalScrollBar();
		tableScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(tableScroll);
		
		//A scrollable area that contains all the rooms and their schedules
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
