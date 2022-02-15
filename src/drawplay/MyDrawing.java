package drawplay;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyDrawing extends JPanel {
	private Cat cat;
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
		int x = 0;
		int y = 0;
		//Prints a 10 x 10 matrix of green heads, the customer wanted something different
		for(int i=0; i < 10; i++){

			for(int j=0; j < 10; j++) {
				cat.draw(g, x, y);

				x += 100;
			}
			y += 100; // add 100 to y for a new level of CATS 
			x = 0; // reset x to zero 
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		frame.setSize(400, 400);

		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
