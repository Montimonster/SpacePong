package game;

import java.awt.Color;

import javax.swing.JFrame;

public class App extends JFrame {

	public App() {

	}

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Wallgame");
		frame.setSize(800, 800);
		// frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

		JFrame frame2 = new JFrame("jFrame 2");
		frame.add(frame2);
		frame2.setSize(400, 400);
		frame2.setBackground(Color.BLUE);
		// frame2.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		// frame2.setUndecorated(false);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	

		System.out.println("loco");
		
	}

}
