package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class DrawView extends JFrame {
    public DrawView() {
        this.setTitle("Draw");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanelDraw jPanelDraw = new JPanelDraw();
        this.setLayout(new BorderLayout());
        this.add(jPanelDraw, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        DrawView drowView = new DrawView();
    }
}
