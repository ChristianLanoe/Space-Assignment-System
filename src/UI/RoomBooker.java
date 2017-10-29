package UI;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.*;
public class RoomBooker extends JFrame{

	public static void main(String[] args) {
		
//		new RoomBooker();
//	new Request();
	}
	public RoomBooker(){
		this.setSize(400,400);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		int xPos=(dim.width/2)-(this.getWidth()/2);
		int yPos=(dim.height/2)-(this.getHeight()/2);
		this.setLocation(xPos,yPos);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Room Booker");
		
		JPanel thePanel = new JPanel();
		JLabel roomNum = new JLabel("Room Number:");
		roomNum.setToolTipText("The room ID");
		
		
		JButton add = new JButton("+");
		
		
		add.setToolTipText("Adds a new room id");
		
		thePanel.add(roomNum);
		thePanel.add(add);
		
		this.add(thePanel);
		
		this.setVisible(true);
	}

}
class Request extends JFrame{
public static void main(String[] args) {
		
		new Request();

	}
	public Request(){
		String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
		this.setSize(400,400);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		int xPos=(dim.width/2)-(this.getWidth()/2);
		int yPos=(dim.height/2)-(this.getHeight()/2);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Request");
		
		JPanel thePanel = new JPanel();
		thePanel.setLayout(new GridLayout(0,2,0,20));
		
		JLabel fName = new JLabel("First Name:");
		JLabel lName = new JLabel("Last Name:");
		JLabel email = new JLabel("Email:");
		JLabel roomNum = new JLabel("Room Number:");
		JLabel roomNum2 = new JLabel("2002A");
		JLabel sTime = new JLabel("Start Time:");
		JLabel eTime = new JLabel("End Time:");
		JLabel desc = new JLabel("Description:");
		
		JTextField fNamef = new JTextField(10);
		JTextField lNamef = new JTextField(10);
		JTextField emailf = new JTextField(15);
		
		JComboBox sTimeb = new JComboBox(petStrings);
		JComboBox eTimeb = new JComboBox(petStrings);
		
		JTextArea desca = new JTextArea(15,1);
		desca.setLineWrap(true);
		JScrollPane descaBar = new JScrollPane(desca, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		thePanel.add(fName);
		thePanel.add(fNamef);
		
		thePanel.add(lName);
		thePanel.add(lNamef);
		
		thePanel.add(email);
		thePanel.add(emailf);
		
		thePanel.add(roomNum);
		thePanel.add(roomNum2);
		
		thePanel.add(sTime);
		thePanel.add(sTimeb);
		
		thePanel.add(eTime);
		thePanel.add(eTimeb);
		
		thePanel.add(desc);
		thePanel.add(descaBar);
		
		this.add(thePanel);
		
		this.setVisible(true);
	}
}