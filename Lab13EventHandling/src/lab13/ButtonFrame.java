package lab13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ButtonFrame extends JFrame {
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	
	private static final int DEFAULT_HEIGHT = 200;
	
	public ButtonFrame() {
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setTitle("Color Generator");
		//create buttons
		JButton resetButton = new JButton("Reset");
		JButton closeButton = new JButton("Close");
		JButton changeButton = new JButton("Change");
		
		buttonPanel = new JPanel();
		
		//add buttons to panel
		buttonPanel.add(resetButton);
		buttonPanel.add(closeButton);
		buttonPanel.add(changeButton);
		
		//add panel to frame
		add(buttonPanel);
		
		//create button actions
		ButtonAction resetAction = new ButtonAction(4);
		ButtonAction changeAction = new ButtonAction(1);
		ButtonAction closeAction = new ButtonAction(-1);
		
		//associate actions with buttons
		resetButton.addActionListener(resetAction);
		changeButton.addActionListener(changeAction);	
		closeButton.addActionListener(closeAction);
	}
	
	/* An action listener that sets the panel's background color */
	private class ButtonAction implements ActionListener
	{
		private int inputNumber;
		private int numClick = 0;
		Color[] listOfColors = {Color.BLACK, Color.GREEN, Color.ORANGE, Color.PINK};
		public ButtonAction(int i)
		{
			inputNumber = i;
		}
		
		public void actionPerformed(ActionEvent event)
		{
			//this if statement tests to see what event is being called and performs an action based on the event
			if(inputNumber == -1)
			{
				System.exit(0);
			}
			else if(inputNumber == 1)
			{
				numClick = (numClick + 1) % 4;
				buttonPanel.setBackground(listOfColors[numClick]);
			}
			else if(inputNumber == 4)
			{
				numClick = 0;
				buttonPanel.setBackground(listOfColors[numClick]);
			}
		}
	}
}
