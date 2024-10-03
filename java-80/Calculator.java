
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Calculator extends JFrame {

    public Calculator() {
        // *** Set thuoc tinh
        this.setTitle("My Calculator");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);

        this.setLayout(new BorderLayout());

        // *** JPanel
        JPanel jPanel_top = new JPanel();
        JPanel jPanel_bottom = new JPanel();

        // *** Set layout JPanel
        jPanel_top.setLayout(new BorderLayout());
        jPanel_bottom.setLayout(new GridLayout(5, 4));

        // *** add JPanel top
        JTextField jtf = new JTextField(4);
        jPanel_top.add(jtf, BorderLayout.CENTER);

        jPanel_top.add(jtf);

        // *** add JPanel bottom
        for (int i = 0; i < 10; i++) {
            JButton jb_so = new JButton(i + "");
            jPanel_bottom.add(jb_so);
        }

        JButton jb_cong = new JButton("+");
        JButton jb_tru = new JButton("-");
        JButton jb_nhan = new JButton("*");
        JButton jb_chia = new JButton("/");
        JButton jb_bang = new JButton("=");

        jPanel_bottom.add(jb_cong);
        jPanel_bottom.add(jb_tru);
        jPanel_bottom.add(jb_nhan);
        jPanel_bottom.add(jb_chia);
        jPanel_bottom.add(jb_bang);

        this.add(jPanel_top, BorderLayout.NORTH);
        this.add(jPanel_bottom, BorderLayout.CENTER);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        try {
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            Calculator c = new Calculator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
