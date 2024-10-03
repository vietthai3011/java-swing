
import java.awt.Color;
import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setSize(600, 400);
        jf.setTitle("Hello world");
        Color c = new Color(125, 125, 177);
        jf.getContentPane().setBackground(c);
        jf.setLocation(100, 100);

        // *** Thoat ctr khi an X
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JFrame.EXIT_ON_CLOSE = 3

        // *** Hien thi
        jf.setVisible(true);
    }
}
