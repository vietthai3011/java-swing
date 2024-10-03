
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame {

    public ViDu_GridLayout() {
        this.setTitle("Hello world");
        this.setSize(600, 400);

        // *** Can giua ctr
        this.setLocationRelativeTo(null);

        // *** set layout
        GridLayout gl = new GridLayout();
        GridLayout gl1 = new GridLayout(4, 4);
        GridLayout gl2 = new GridLayout(4, 4, 25, 25);
        this.setLayout(gl1);

        // button

        // *** add thanhn phan
        for (int i = 0; i < 15; i++) {
            JButton jButton = new JButton("Hello " + i);
            this.add(jButton);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        ViDu_GridLayout vd1 = new ViDu_GridLayout();
    }
}
