package view;

import controller.CounterListener;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Counter;

public class CounterView extends JFrame {
    private Counter ct;
    private JButton jb_up;
    private JButton jb_down;
    private JButton jb_reset;

    private JLabel jl_value;

    public CounterView() {
        this.ct = new Counter();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setLayout(new BorderLayout());
        this.setTitle("Counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);

        ActionListener ac = new CounterListener(this);

        this.jb_up = new JButton("Up");
        this.jb_up.addActionListener(ac);
        this.jb_down = new JButton("Down");
        this.jb_down.addActionListener(ac);
        this.jb_reset = new JButton("Reset");
        this.jb_reset.addActionListener(ac);
        this.jl_value = new JLabel(this.ct.getValue() + "", JLabel.CENTER);

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        jp.add(jb_up, BorderLayout.WEST);
        jp.add(jb_down, BorderLayout.EAST);
        jp.add(jl_value, BorderLayout.CENTER);
        jp.add(jb_reset, BorderLayout.SOUTH);

        this.add(jp);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void increment() {
        this.ct.increment();
        this.jl_value.setText(this.ct.getValue() + "");
    }

    public void decrement() {
        this.ct.decrement();
        this.jl_value.setText(this.ct.getValue() + "");
    }

    public void reset() {
        this.ct.reset();
        this.jl_value.setText(this.ct.getValue() + "");
    }

}
