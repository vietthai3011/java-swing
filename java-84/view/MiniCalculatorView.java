package view;

import controller.MiniCalculatorController;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame {
    private final MiniCalculatorModel miniCalculatorModel;
    private JTextField jtf_1_value;
    private JTextField jtf_2_value;
    private JTextField jtf_answer;

    public MiniCalculatorView() {
        this.miniCalculatorModel = new MiniCalculatorModel();

        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Mini calculator");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);

        // create controller
        ActionListener miniCalculatorController = new MiniCalculatorController(this);

        // *** create Font
        Font f1 = new Font("Arial", Font.BOLD, 30);
        Font f2 = new Font("Arial", Font.BOLD, 100);

        // *** create JLabel
        JLabel jLabel_1_value = new JLabel("1st value");
        jLabel_1_value.setFont(f1);
        JLabel jLabel_2_value = new JLabel("2nd value");
        jLabel_2_value.setFont(f1);
        JLabel jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(f1);

        // *** create JTextField
        jtf_1_value = new JTextField();
        jtf_1_value.setFont(f1);

        jtf_2_value = new JTextField();
        jtf_2_value.setFont(f1);

        jtf_answer = new JTextField();
        jtf_answer.setFont(f1);

        // *** create JPanel
        JPanel jPanel_io = new JPanel();
        jPanel_io.setLayout(new GridLayout(3, 2, 10, 10));

        JPanel jPanel_button = new JPanel();
        jPanel_button.setLayout(new GridLayout(2, 3));

        // *** add JPanel
        jPanel_io.add(jLabel_1_value);
        jPanel_io.add(jtf_1_value);

        jPanel_io.add(jLabel_2_value);
        jPanel_io.add(jtf_2_value);

        jPanel_io.add(jLabel_answer);
        jPanel_io.add(jtf_answer);

        // *** Create Jbutton
        JButton jb_cong = new JButton("+");
        jb_cong.addActionListener(miniCalculatorController);
        jb_cong.setFont(f2);
        jPanel_button.add(jb_cong);
        JButton jb_tru = new JButton("-");
        jb_tru.addActionListener(miniCalculatorController);
        jb_tru.setFont(f2);
        jPanel_button.add(jb_tru);
        JButton jb_nhan = new JButton("*");
        jb_nhan.addActionListener(miniCalculatorController);
        jb_nhan.setFont(f2);
        jPanel_button.add(jb_nhan);
        JButton jb_chia = new JButton("/");
        jb_chia.addActionListener(miniCalculatorController);
        jb_chia.setFont(f2);
        jPanel_button.add(jb_chia);
        JButton jb_mod = new JButton("%");
        jb_mod.addActionListener(miniCalculatorController);
        jb_mod.setFont(f2);
        jPanel_button.add(jb_mod);
        JButton jb_mu = new JButton("^");
        jb_mu.addActionListener(miniCalculatorController);
        jb_mu.setFont(f2);
        jPanel_button.add(jb_mu);

        this.setLayout(new GridLayout(2, 1, 20, 20));
        this.add(jPanel_io);
        this.add(jPanel_button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void cong() {
        double v1 = Double.parseDouble(this.jtf_1_value.getText());
        double v2 = Double.parseDouble(this.jtf_2_value.getText());
        this.miniCalculatorModel.setFirstValue(v1);
        this.miniCalculatorModel.setSecondValue(v2);
        this.miniCalculatorModel.cong();
        this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void tru() {
        double v1 = Double.parseDouble(this.jtf_1_value.getText());
        double v2 = Double.parseDouble(this.jtf_2_value.getText());
        this.miniCalculatorModel.setFirstValue(v1);
        this.miniCalculatorModel.setSecondValue(v2);
        this.miniCalculatorModel.tru();
        this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void nhan() {
        double v1 = Double.parseDouble(this.jtf_1_value.getText());
        double v2 = Double.parseDouble(this.jtf_2_value.getText());
        this.miniCalculatorModel.setFirstValue(v1);
        this.miniCalculatorModel.setSecondValue(v2);
        this.miniCalculatorModel.nhan();
        this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void chia() {
        double v1 = Double.parseDouble(this.jtf_1_value.getText());
        double v2 = Double.parseDouble(this.jtf_2_value.getText());
        this.miniCalculatorModel.setFirstValue(v1);
        this.miniCalculatorModel.setSecondValue(v2);
        this.miniCalculatorModel.chia();
        this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void mod() {
        double v1 = Double.parseDouble(this.jtf_1_value.getText());
        double v2 = Double.parseDouble(this.jtf_2_value.getText());
        this.miniCalculatorModel.setFirstValue(v1);
        this.miniCalculatorModel.setSecondValue(v2);
        this.miniCalculatorModel.mod();
        this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void mu() {
        double v1 = Double.parseDouble(this.jtf_1_value.getText());
        double v2 = Double.parseDouble(this.jtf_2_value.getText());
        this.miniCalculatorModel.setFirstValue(v1);
        this.miniCalculatorModel.setSecondValue(v2);
        this.miniCalculatorModel.mu();
        this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
}
