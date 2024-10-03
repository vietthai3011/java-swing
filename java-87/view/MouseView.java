package view;

import controller.MouseConroller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.MouseModel;

public class MouseView extends JFrame {
    private MouseModel mouseModel;
    private JPanel jPanel_mouse;
    private JPanel jPanel_info;
    private JLabel jLabel_position;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jLabel_count;
    private JLabel jLabel_count_value;
    private JLabel jLabel_check_in;
    private JLabel jLabel_check_in_value;
    private JLabel jLabel_empty_1;
    private JLabel jLabel_empty_2;

    public MouseView() {
        this.mouseModel = new MouseModel();

        this.init();
    }

    private void init() {
        this.setTitle("Mouse");
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);

        // ***Create Mouse Listener
        MouseConroller mouseListener = new MouseConroller(this);
        // *** Create Font
        Font f1 = new Font("Arial", Font.BOLD, 20);

        // *** Create JPanel
        this.jPanel_mouse = new JPanel();
        jPanel_mouse.setBackground(Color.cyan);
        jPanel_mouse.addMouseListener(mouseListener);
        jPanel_mouse.addMouseMotionListener(mouseListener);

        this.jPanel_info = new JPanel();
        jPanel_info.setLayout(new GridLayout(3, 3, 10, 20));

        // *** Create JLabel
        this.jLabel_position = new JLabel("Position: ");
        this.jLabel_position.setFont(f1);
        this.jLabel_x = new JLabel("x= ");
        this.jLabel_x.setFont(f1);
        this.jLabel_y = new JLabel("y= ");
        this.jLabel_y.setFont(f1);
        this.jLabel_count = new JLabel("Number clicks: ");
        this.jLabel_count.setFont(f1);
        this.jLabel_count_value = new JLabel("0");
        this.jLabel_count_value.setFont(f1);
        this.jLabel_empty_1 = new JLabel();
        this.jLabel_empty_1.setFont(f1);
        this.jLabel_check_in = new JLabel("Mouse is in compenent: ");
        this.jLabel_check_in.setFont(f1);
        this.jLabel_check_in_value = new JLabel("no");
        this.jLabel_check_in_value.setFont(f1);
        this.jLabel_empty_2 = new JLabel();
        this.jLabel_empty_2.setFont(f1);

        // *** add JPanel
        jPanel_info.add(jLabel_position);
        jPanel_info.add(jLabel_x);
        jPanel_info.add(jLabel_y);
        jPanel_info.add(jLabel_count);
        jPanel_info.add(jLabel_count_value);
        jPanel_info.add(jLabel_empty_1);
        jPanel_info.add(jLabel_check_in);
        jPanel_info.add(jLabel_check_in_value);
        jPanel_info.add(jLabel_empty_2);

        this.add(jPanel_mouse, BorderLayout.CENTER);
        this.add(jPanel_info, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void click() {
        this.mouseModel.addClick();
        this.jLabel_count_value.setText(this.mouseModel.getCount() + "");
    }

    public void enter() {
        this.mouseModel.enter();
        this.jLabel_check_in_value.setText(this.mouseModel.getCheckIn());
    }

    public void exit() {
        this.mouseModel.exit();
        this.jLabel_check_in_value.setText(this.mouseModel.getCheckIn());

    }

    public void update(int x, int y) {
        this.mouseModel.setX(x);
        this.mouseModel.setY(y);
        this.jLabel_x.setText(this.mouseModel.getX() + "");
        this.jLabel_y.setText(this.mouseModel.getY() + "");
    }
}
