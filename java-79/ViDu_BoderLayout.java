
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_BoderLayout extends JFrame {

    public ViDu_BoderLayout() {
        this.setTitle("Hello world");
        this.setSize(600, 400);

        // *** Can giua ctr
        this.setLocationRelativeTo(null);

        // *** set layout
        BorderLayout bl = new BorderLayout();
        BorderLayout bl1 = new BorderLayout(100, 100);
        this.setLayout(bl1);

        JButton jButton1 = new JButton("Hello 1");
        JButton jButton2 = new JButton("Hello 2");
        JButton jButton3 = new JButton("Hello 3");
        JButton jButton4 = new JButton("Hello 4");
        JButton jButton5 = new JButton("Hello 5");

        this.add(jButton1, BorderLayout.BEFORE_LINE_BEGINS);
        // this.add(jButton2, BorderLayout.SOUTH);
        // this.add(jButton3, BorderLayout.CENTER);
        // this.add(jButton4, BorderLayout.WEST);
        // this.add(jButton5, BorderLayout.EAST);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        ViDu_BoderLayout vd1 = new ViDu_BoderLayout();
    }
}
