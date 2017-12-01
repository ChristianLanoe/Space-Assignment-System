package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RoomCreationHolderPanel {
	private final JPanel panel;

	public RoomCreationHolderPanel() {
		panel = new JPanel();

		JButton addpanel = new JButton("+");
		panel.add(addpanel);
		panel.add(new RoomCreationPanel().getPanel());
		addpanel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.add(new RoomCreationPanel().getPanel());
				panel.revalidate();
				panel.validate();
			}
		});
	}

	public JPanel getPanel() {
		return panel;
	}

}
