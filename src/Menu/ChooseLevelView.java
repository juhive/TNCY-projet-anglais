package Menu;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooseLevelView extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChooseLevelView() {
		
		JButton beginnerButton = new JButton("Medium");
		beginnerButton.setToolTipText("Straight to the TOEIC !");
		JButton mediumButton = new JButton("Beginner");
		mediumButton.setToolTipText("Learn the basis");
		JButton advancedButton = new JButton("Advanced");
		advancedButton.setToolTipText("Knowledge enhance");
		
		JLabel lblChooseYourEnglish = new JLabel("Choose your english level !");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addComponent(mediumButton, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(32)
					.addComponent(beginnerButton, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
					.addGap(34)
					.addComponent(advancedButton, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
					.addGap(33))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(140)
					.addComponent(lblChooseYourEnglish)
					.addContainerGap(140, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addComponent(lblChooseYourEnglish)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addComponent(mediumButton, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
							.addGap(129))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(50)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(beginnerButton, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
								.addComponent(advancedButton, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
							.addGap(127))))
		);
		setLayout(groupLayout);
		
		/*
		 * Action Listeners
		 */
		beginnerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		mediumButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
