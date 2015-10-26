import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends JFrame {
		static 	 JMenuItem faceUp = new JMenuItem("Face Up");
		static	 JMenuItem faceDown = new JMenuItem("Face Down");
		static	 JMenuItem flip = new JMenuItem("Flip");
		static	 JMenuItem stackCard = new JMenuItem("Stack");
		static	 JMenuItem stackCardTop = new JMenuItem("Stack Top");
		static	 JMenuItem stackCardBottom = new JMenuItem("Stack Bottom");
		static	 JMenuItem unStack = new JMenuItem("Unstack");
		static   JMenuItem discardCard = new JMenuItem("Discard");
		static	 JMenuItem showCard = new JMenuItem("Show");
		static	 JMenuItem distributeCard = new JMenuItem("Distribute");

			
			
	public static void main(String args[])throws IOException{
		 
			
			
			ImageIcon[] image = new ImageIcon[52];
			JButton[] button = new JButton[52];
			for ( int i = 0; i < 52; i++){
				
			/*	image[i] = new ImageIcon("C://Book//Image//"+i+".png");
				label1.add(image[i])
				*/
				
			}
		
			
			File imageFile = new File("C://Book//Image//1.png");
			BufferedImage image1 = ImageIO.read(imageFile);
			ImageIcon i1 = new ImageIcon(image1); 
			
			JLabel label1 = new JLabel(i1);
			label1.setLayout( new GridLayout(1,1));
			
			JPanel j1 = new JPanel();
			j1.add(label1);
			/*ImageIcon icon = new ImageIcon("C://Book//Image//1.png"); */
			
			
		

			
			Frame1 frame1 = new Frame1();
			frame1.setLocationRelativeTo(null);
			frame1.setSize(600,300);
			frame1.setVisible(true);
			
			frame1.setBackground(Color.GREEN);
			frame1.setTitle("Test");
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			frame1.setLayout(new GridLayout(2,2,1,1));
			frame1.add(j1);
			/*
			frame1.add(j1);
			for ( int k = 0; k<52; k++){
				
				
				frame1.add(button[k]);
			}
			*/
			faceUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Processed Face Up");
			}
		});

		faceDown.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Processed Face Down");
			}
		});

		flip.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Processed Flip");
			}
		});

		stackCard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Processed Stack Card");
			}
		});

		stackCardTop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Processed stackCardTop");
			}
		});

		stackCardBottom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Processed stackCardBottom");
			}
		});

		unStack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Processed unStack");
			}
		});

		discardCard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Processed discardCard");
			}
		});

		distributeCard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Processed distributeCard");
			}
		});
			
			
			
			
		
			
			j1.addMouseListener(new MouseAdapter(){
			
				public void mouseReleased(MouseEvent e){
					if( SwingUtilities.isRightMouseButton(e)){
						
						JPopupMenu mainpop = new JPopupMenu();
						mainpop.add(faceUp);
						mainpop.add(faceDown);
						mainpop.add(flip);
						mainpop.add(stackCard);
						mainpop.add(stackCardTop);
						mainpop.add(stackCardBottom);
						
						mainpop.add(showCard);
						mainpop.add(discardCard);
						mainpop.add(distributeCard);
						mainpop.show(e.getComponent(),e.getX(),e.getY());
					}
					
					
					
					
				}
			
			
			
			
			
			});
			
		
			
		
		
		
	}

	
	
	
	
	
	
	
	
}
