import java.awt.HeadlessException;

import javax.swing.JFrame;

public class OyunEkrani extends JFrame{

	
	public OyunEkrani(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
		
		ekran.setResizable(false);
		ekran.setFocusable(false);
		
		ekran.setSize(800, 600);
		
		ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Oyun oyun = new Oyun();
		
		oyun.requestFocus();
		
		oyun.addKeyListener(oyun);
		
		oyun.setFocusable(true);
		oyun.setFocusTraversalKeysEnabled(false);
		
		
		ekran.add(oyun);
		ekran.setVisible(true);
		
	}
}
