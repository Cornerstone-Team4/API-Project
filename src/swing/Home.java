package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.prism.Graphics;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionText);
		
		JLabel lblNasa = new JLabel("NASA API");
		lblNasa.setForeground(SystemColor.activeCaption);
		lblNasa.setFont(new Font("American Typewriter", Font.PLAIN, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 480, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 596, GroupLayout.PREFERRED_SIZE))
					.addGap(107))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		
//		ImageIcon icon = new ImageIcon("/Users/ayaka/eclipse-workspace/nasa/images/Screen Shot 2019-11-20 at 7.22.37 PM.png");
//		Image img = icon.getImage();
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File("/Users/ayaka/eclipse-workspace/nasa/images/sunrise-1756274_640.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel lblNewLabel = new JLabel(new ImageIcon(myPicture));
		getContentPane().add(lblNewLabel);
//		Graphics2D g = bi.createGraphics();
//		g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
//		lblNewLabel.setIcon((Icon) g);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 320, Short.MAX_VALUE)
		);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnNewButton = new JButton("Mission");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Mission frame = new Mission();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setForeground(new Color(0, 0, 153));
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("Mission");
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setForeground(new Color(0, 0, 153));
		button.setBackground(Color.BLUE);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Mission");
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setForeground(new Color(0, 0, 153));
		button_1.setBackground(Color.BLUE);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Mission");
		button_2.setHorizontalTextPosition(SwingConstants.CENTER);
		button_2.setForeground(new Color(0, 0, 153));
		button_2.setBackground(Color.BLUE);
		panel_1.add(button_2);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNasa, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(646, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNasa))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		
	}
}
