
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.font.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		
		JTextArea text;
		text =  new JTextArea("");
		
		JButton submit, clear;
		submit = new JButton("Submit");
		clear = new JButton("Clear");
		
		JLabel label1, label2, label3, label4;
		label1 = new JLabel("Enter Text Here : ");
		label2 = new JLabel("Characters Without Spaces : ");
		label3 = new JLabel("Characters With Spaces : ");
		label4 = new JLabel("Words : ");
		
		
		Font f1 = new Font("serif",Font.BOLD, 15);
		label1.setFont(f1);
		label2.setFont(f1);
		label3.setFont(f1);
		label4.setFont(f1);
		
		label1.setBounds(10, 25, 200, 30);
		text.setBounds(40, 60, 400, 320);
		label2.setBounds(10, 390, 350, 20);
		label3.setBounds(10, 415, 350, 20);
		label4.setBounds(10, 440, 250, 20);
		submit.setBounds(130, 470, 100, 40);
		clear.setBounds(280, 470, 100, 40);
		
		submit.addActionListener(new ActionListener()
		 {
			public void actionPerformed(ActionEvent e) 
			{
				String s = text.getText().trim();
				s += ' '; 
				int count = 0;
				int words = 0;
				label2.setText("Characters With Spaces : " + s.length());
				for(int i = 0; i < s.length(); i++)
				{
					if(s.charAt(i) != ' ') count++;
					else words++;
				}
				label3.setText("Characters Without Spaces : " + count);
				label4.setText("Words : " + (words));
			}
		  });
		
		clear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				text.setText("");
				label2.setText("Characters With Spaces : ");
				label3.setText("Characters Without Spaces : ");
				label4.setText("Words : ");
			}
		});
		
		
		frame.setLayout(null);
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(text);
		frame.add(submit);
		frame.add(clear);
		frame.setLayout(null);
		frame.setTitle("Word Counter");
		frame.setBackground(Color.black);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(500, 570);
	}

	
}