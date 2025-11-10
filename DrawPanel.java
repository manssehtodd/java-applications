//Using java to create a graphival interface that draw lines
// DrawPanel.java

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int width = 100;
		int height = 20;
		
		g.drawLine(0, 0, width, height);
		
		g.drawLine(0 ,0, width, height);
	}
}