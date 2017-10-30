package UI;

import java.awt.Dimension;

import javax.swing.JFrame;


class RequestFrame{
	public static void main(String[] args) {
			new RequestFrame();
	}
	
	private int DEFAULT_WIDTH = 500;
	private int DEFAULT_HEIGHT = 500;
	public RequestFrame(){
		JFrame requestFrame = new JFrame();
		
		requestFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		requestFrame.setLocationRelativeTo(null);
		requestFrame.setResizable(false);
		requestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		requestFrame.setTitle("Request");
		
		Dimension contentDimension = requestFrame.getContentPane().getSize();
		
		RequestPanel rp = new RequestPanel(contentDimension);
		requestFrame.getContentPane().add(rp.getRequestPanel());
		requestFrame.setVisible(true);
	}
}