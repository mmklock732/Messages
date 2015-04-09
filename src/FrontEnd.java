

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

	
	public class FrontEnd {

		BackEnd myBackEnd = new BackEnd();
		private JFrame myFrame;
		private JButton myButton;
		private JTextField myTextField;

		private JTextField myTextField0;
		private JTextArea myText;
		
		
		private JButton myButton1;
		private JTextField myTextField1;
		
		
		public FrontEnd()
		{
			myFrame = new JFrame("GitHub");
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myFrame.setLocation(300,150);
			myFrame.setMaximumSize(new Dimension (1000, 1000));
			myFrame.setPreferredSize(new Dimension(750, 500));
			
			myText = new JTextArea();
			myTextField = new JTextField();
			myTextField1 = new JTextField();
			myTextField0 = new JTextField();
			myButton = new JButton("Add new message.");
			myButton1 = new JButton("Username");
			Box myBox = Box.createVerticalBox();
			Box myBox1 = Box.createVerticalBox();
			Box myBigBox = Box.createHorizontalBox();

	
			myBigBox.add(myBox);
			myBigBox.add(myBox1);
			myBox.add(myTextField);
			myBox.add(myTextField0);
			myBox.add(myButton);
			myBox1.add(myTextField1);
		
			myBox1.add(myButton1);
			myBox1.add(myText);
			
			myButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				 {	
					myBackEnd.addMessage(myTextField.getText(), myTextField0.getText());
					myText.setText(myTextField.getText() + ": " + myTextField0.getText());
				
					}
				}
			});
			
			myButton1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					myText.setText(myBackEnd.getMessage(myTextField1.getText()).toString());
				}
			});
			
			
			myFrame.add(myBigBox);
			myFrame.pack();
			myFrame.setVisible(true);
		}

		public JButton getButton() { return myButton; }


		public static void main(String[] args)
		{
			SwingUtilities.invokeLater(new Runnable() {
				public void run() { new FrontEnd(); }
			});
		}

	}


