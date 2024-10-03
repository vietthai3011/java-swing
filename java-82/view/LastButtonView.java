package view;

import controller.LastButtonController;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.LastButton;

public class LastButtonView extends JFrame {
    private LastButton lastButton;
    public JLabel jl;

    public LastButtonView() {
        this.lastButton = new LastButton();
        this.setVisible(true);

        this.init();
    }

    private void init() {
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setTitle("Last button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font f1 = new Font("Arial", Font.BOLD, 50);
        Font f2 = new Font("Arial", Font.BOLD, 30);

        ActionListener al = new LastButtonController(this);

        JPanel jp_center = new JPanel();
        jp_center.setLayout(new GridLayout(2, 2));
        for (int i = 1; i <= 4; i++) {
            JButton jb_number = new JButton(i + "");
            jb_number.addActionListener(al);
            jb_number.setFont(f1);
            jp_center.add(jb_number);
        }

        JPanel jp_bottom = new JPanel();
        this.jl = new JLabel("-----", JLabel.CENTER);
        this.jl.setFont(f2);
        jp_bottom.add(jl, BorderLayout.CENTER);

        this.add(jp_center, BorderLayout.CENTER);
        this.add(jp_bottom, BorderLayout.SOUTH);

    }

    public void changeTo_1() {
        this.lastButton.xetValue_1();
        this.jl.setText("Last button: " + this.lastButton.getValue());
    }

    public void changeTo_2() {
        this.lastButton.xetValue_2();
        this.jl.setText("Last button: " + this.lastButton.getValue());
    }

    public void changeTo_3() {
        this.lastButton.xetValue_3();
        this.jl.setText("Last button: " + this.lastButton.getValue());
    }

    public void changeTo_4() {
        this.lastButton.xetValue_4();
        this.jl.setText("Last button: " + this.lastButton.getValue());
    }
}
