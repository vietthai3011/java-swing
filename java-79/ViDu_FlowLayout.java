
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayout extends JFrame {

    public ViDu_FlowLayout() {
        this.setTitle("Hello world");
        this.setSize(600, 400);

        // *** Can giua ctr
        this.setLocationRelativeTo(null);

        // *** set layout
        FlowLayout fl1 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout fl2 = new FlowLayout(FlowLayout.LEFT);
        FlowLayout fl3 = new FlowLayout(FlowLayout.TRAILING);
        FlowLayout fl4 = new FlowLayout(FlowLayout.LEADING);
        this.setLayout(fl3);

        // button
        JButton jButton1 = new JButton("Hello 1");
        JButton jButton2 = new JButton("Hello 2");
        JButton jButton3 = new JButton("Hello 3");

        // *** add thanhn phan
        this.add(jButton1);
        this.add(jButton2);
        this.add(jButton3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        ViDu_FlowLayout vd1 = new ViDu_FlowLayout();
    }
}
