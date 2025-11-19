import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanelTest1
{
    public static void main(String[] args){
        DrawPanel panel = new DrawPanel();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}

class DrawPanel extends JPanel
{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int step = 15; // distance between lines
		int counts = width/2;
        // from top-left → right edge
        for (int i = 0; i <= counts; i += step) {
            g.drawLine(0, 0, i, height);
        }

        // from top-right → bottom edge
        for (int i = 0; i <= counts; i += step) {
            g.drawLine(width, 0, i, height);
        }

        // from bottom-right → left edge
        for (int i = 0; i <= counts; i += step) {
            g.drawLine(width, height, i, 0);
        }

        // from bottom-left → top edge
        for (int i = 0; i <= counts; i += step) {
            g.drawLine(0, height, i, 0);
        }
    }
}
