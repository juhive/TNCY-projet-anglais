package Menu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;

public class WelcomeWindow extends JFrame implements Observer {

	public JPanel mainPanel;
	public JPanel welcomePanel;
	public JButton startButton;
	public JButton questionMark;
	public ChooseLevelView chooseLevelView;
	public Image img;

	/**
	 * Create the frame.
	 */
	public WelcomeWindow() {
		setType(Type.UTILITY);
		setTitle("Easy English");

		initComponents();
		createEvents();

	}

	/**
	 * Method which contains the code creating and initializing components 
	 */
	private void initComponents() {


		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));

		/* Welcome window */

		welcomePanel = new JPanel();
		mainPanel.add(welcomePanel);

		startButton = new JButton("Get started !");
		startButton.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 13));

		JLabel logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon("/Users/isabellepolizzi/Desktop/TelecomNancy/English/EasyEnglish/ressources/graduation.png"));

		questionMark = new JButton("");
		questionMark.setHorizontalAlignment(SwingConstants.TRAILING);
		questionMark.setIcon(new ImageIcon("/Users/isabellepolizzi/Desktop/TelecomNancy/English/EasyEnglish/ressources/question.png"));
		questionMark.setToolTipText("What is it ?");

		/*
		 * Components positioning in the window
		 */
		GroupLayout gl_welcomePanel = new GroupLayout(welcomePanel);
		gl_welcomePanel.setHorizontalGroup(
				gl_welcomePanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_welcomePanel.createSequentialGroup()
						.addGap(150)
						.addComponent(logo, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
						.addGap(155))
				.addGroup(gl_welcomePanel.createSequentialGroup()
						.addGap(150)
						.addComponent(startButton, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
						.addGap(155))
				.addGroup(gl_welcomePanel.createSequentialGroup()
						.addContainerGap(402, Short.MAX_VALUE)
						.addComponent(questionMark)
						.addContainerGap())
				);
		gl_welcomePanel.setVerticalGroup(
				gl_welcomePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_welcomePanel.createSequentialGroup()
						.addGap(50)
						.addComponent(logo, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
						.addComponent(startButton, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
						.addGap(53)
						.addComponent(questionMark, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addContainerGap())
				);
		welcomePanel.setLayout(gl_welcomePanel);
	}


	/**
	 * Method which contains the code for creating events : action listeners
	 */
	private void createEvents() {

		/*Get started button*/
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Get Started !");
				mainPanel.removeAll();
				chooseLevelView = new ChooseLevelView();
				mainPanel.add(chooseLevelView);
				mainPanel.repaint();
				mainPanel.revalidate();
			}
		});

		questionMark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("What is it ?");
			}
		});
	}

	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
	
	}
}
