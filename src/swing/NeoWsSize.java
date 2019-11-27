package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



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
import javax.swing.JTextArea;

public class NeoWsSize extends JFrame{
	static NeoWs frameNeo;
	static NeoWsSize frameNeoS;
	static NeoWsDistance frameNeoD;
	

	private JPanel contentPane;
	static CallJasonNeoWsJ myob = new CallJasonNeoWsJ();
	static String hazard = myob.getHazardous();
	static String mxDiameter = myob.getMxDiameter();
	static String mnDiameter = myob.getMnDiameter();
	static String start = myob.getStartDate();
	static String end = myob.getEndDate();
	
	static NeoWSOb myob2 = new NeoWSOb();
	static String objectImage = myob2.NeoWsOb();
	static String obDiameter;
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameNeoS = new NeoWsSize();
					frameNeoS.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	/**
	 * Create the frame.
	 */
	
	public NeoWsSize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionText);
		
		JLabel lblNasa = new JLabel("Near Earth object -size");
		lblNasa.setForeground(SystemColor.activeCaption);
		lblNasa.setFont(new Font("American Typewriter", Font.PLAIN, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		//JLabel lbHazard = new JLabel(new ImageIcon(hazard));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 596, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 477, GroupLayout.PREFERRED_SIZE)))
					.addGap(6))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
					.addContainerGap())
		);
		BufferedImage asteroid = null;
		try {
			asteroid = ImageIO.read(new File("images/crystal-2898037_640.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel lbasteroids = new JLabel(new ImageIcon(asteroid));
		
		
		BufferedImage object = null;
		try {
			object = ImageIO.read(new File(objectImage));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel lblObject = new JLabel(new ImageIcon(object));
		
		JLabel lbMaxDiameter = new JLabel(mxDiameter);
		lbMaxDiameter.setForeground(Color.GREEN);
		
		JLabel lbObDiameter = new JLabel("0");
		lbObDiameter.setForeground(Color.GREEN);
		
		JLabel lbEnd = new JLabel(end);
		
		BufferedImage hazard = null;
		try {
			hazard = ImageIO.read(new File("images/crystal-2898037_640.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String lbtxt = "<html><p>If Earth were the same size as VancouverIsland...</p></html>";
		JLabel lblIfEarthWere = new JLabel(lbtxt);
		lblIfEarthWere.setForeground(Color.GREEN);
		
	
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(59)
							.addComponent(lbMaxDiameter, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbasteroids, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIfEarthWere, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblObject, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel_2.createSequentialGroup()
								.addGap(19)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_2.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lbEnd, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel_2.createSequentialGroup()
										.addGap(49)
										.addComponent(lbObDiameter, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))))))
					.addGap(217))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(lbEnd, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblIfEarthWere)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblObject, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(18)
							.addComponent(lbasteroids, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbObDiameter, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbMaxDiameter, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
		);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnSave = new JButton("Size");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SaveImage frame = new SaveImage();
							frame.saveImage();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});								
			}
		});
		btnSave.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSave.setForeground(new Color(0, 0, 153));
		btnSave.setBackground(Color.BLUE);
		panel_1.add(btnSave);
		
		JButton btnSend = new JButton("Distance");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frameNeoD = new NeoWsDistance();
							frameNeoD.setVisible(true);
							frameNeoS.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
				});
				
			}
		});
		btnSend.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSend.setForeground(new Color(0, 0, 153));
		btnSend.setBackground(Color.BLUE);
		panel_1.add(btnSend);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frameNeo = new NeoWs();
							frameNeo.setVisible(true);
							frameNeoS.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
				});
			}
		});
		panel_1.add(btnNewButton);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNasa, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(316, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNasa))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		
	}
}
