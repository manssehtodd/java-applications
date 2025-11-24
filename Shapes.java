// Shapes.java
// Drawing a cascade of shapes based on the user's choice.

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Shapes extends JPanel {

    // Correct override of paintComponent
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 30; i++) {
            g.drawRect(10 + i * 10, 10 + i * 10,
                       50 + i * 10, 50 + i * 10);

            g.drawOval(240 + i * 10, 10 + i * 10,
                       50 + i * 10, 50 + i * 10);
        }
    }

    public static void main(String[] args) {
        Shapes panel = new Shapes(); // create panel
        JFrame application = new JFrame(); // create JFrame

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel); // FIXED spelling: application
        application.setSize(500, 300);
        application.setVisible(true);
    }
}
