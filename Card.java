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
import java.util.*;


public class Card {
    private int value;
    private Suit suit;
	private ImageIcon imageIcon;
	private static int  count = 1 ;
	private JLabel label;
	private JPanel panel;
	public enum Suit {
        Spades, Clubs, Diamonds, Hearts;
    }

	
	
    public Card(int value, Suit suit) throws IOException {
        this.value = value;
        this.suit = suit;
       
		
		this.imageIcon = new ImageIcon("C://Book//Image//", count + ".jpg");
	
		label = new JLabel(imageIcon);
		
		panel = new JPanel();
		
		panel.add(label);
		count++;
    }

   
	
	
	public class deck {
		ArrayList<Card> deck= new ArrayList<Card>();
		
	public void makeDeck()throws IOException{
		for( int i =0;i<=13;i++){
			
			  for (Suit suit : Suit.values()) {
				deck.add(new Card(i, suit));
			}
		}
	
	
	}
	}
	
}	
