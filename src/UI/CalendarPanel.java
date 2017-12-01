package UI;

import java.awt.Color;
import java.awt.Component;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import Schedule.DayOfWeekTimeSpan;
import Schedule.Full_Calendar;
import Schedule.Full_RoomSchedule;
import Schedule.SemesterType;
import Schedule.Semester_RoomSchedule;
import Schedule.TimeSpan;

// Class for creating panel that displays the calendar for all rooms
public class CalendarPanel implements Serializable {
	private JPanel panel;
	private JTable table;
	private int hoursInDay = 24;
	private int daysInWeek = 7;
	private Full_Calendar fullCalendar;
	
	public CalendarPanel(String room, SemesterType type) {	
		panel = new JPanel();
		
		initializeCalendar();
		Boolean[][] available = new Boolean[daysInWeek][hoursInDay];
		for (int i = 0; i< daysInWeek;i++) {
			available[i] = fullCalendar.forSemester(room,type).availableTimes(DayOfWeek.of(i+1));			
		}
		
		
		String[][] RowHeaderValues = new String[daysInWeek][1];
		for(int i=0; i<daysInWeek; i++) {
			RowHeaderValues[i][0] = DayOfWeek.of(i+1).toString();
		}
				
		//An array of all column names (i.e. hour blocks)
		Integer[] columnNames = new Integer[hoursInDay];
		for(int i = 0; i<hoursInDay;i++) {
			columnNames[i] = i;
		}

		String[] rowHeader = {"Days"};
		JTable rowHeaderColumn = new JTable(RowHeaderValues,rowHeader);
		rowHeaderColumn.setRowHeight(30);
		
		table = new JTable(available,columnNames){
			@Override
			public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int columnIndex) {
				Component component = (JComponent) super.prepareRenderer(renderer,rowIndex,columnIndex);
				if(getValueAt(rowIndex,columnIndex).equals(false)) {
					component.setForeground(Color.RED);
					component.setBackground(Color.RED);
				}
				if(getValueAt(rowIndex,columnIndex).equals(true)) {
					component.setForeground(Color.GREEN);
					component.setBackground(Color.GREEN);
				}
				return component;
			}
		};
		
		JViewport viewport = new JViewport();
		viewport.setView(rowHeaderColumn);
		viewport.setPreferredSize(rowHeaderColumn.getPreferredSize());
		
		
		setTablePreferences();
		
//		Making the table scrollable
		JScrollPane tableScroll = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		tableScroll.setRowHeaderView(viewport);
		
		panel.add(tableScroll);
	}
	
	//Table Preferences
	public void setTablePreferences() {
		table.getTableHeader().setReorderingAllowed(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setGridColor(Color.GRAY);
		table.setRowHeight(30);
		table.setShowVerticalLines(true);
		setJTableColumnsWidth(table,30);
	}
	
	//Setting JTable column widths
	public static void setJTableColumnsWidth(JTable table, int tablePreferredWidth) {
	    for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
	        TableColumn column = table.getColumnModel().getColumn(i);
	        column.setPreferredWidth(tablePreferredWidth);
	    }
	}
	
	//deserialized Calendar
	public void initializeCalendar() {
		try {
			FileInputStream fis = new FileInputStream("docs/fullSchedule.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			fullCalendar = (Full_Calendar) ois.readObject();
			ois.close();
			fis.close();
		}catch(IOException i) {
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException e) {
			System.out.println("Full_Calendar not found!");
			e.printStackTrace();
			return;
		}
	}

	public JPanel getPanel() {
		return panel;
	}
}
