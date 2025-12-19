// Shapes1.java
// Drawing 12 concentric circles in the center of a JPanel.
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Shapes1 extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		

		for (int i = 0; i < 10; i++) {
			int size = 50 + i * 10;
			g.drawOval(100 - size / 2, 100 - size / 2, size, size);
		}
		
	}
	
	public static void main(String[] args){
		Shapes1 panel = new Shapes1(); // create the panel
		JFrame application = new JFrame(); // create a new JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
}