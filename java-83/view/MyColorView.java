package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorController;
import model.MyColorModel;

public class MyColorView extends JFrame {
    private MyColorModel myColorModel;
    private JLabel jLabel;
    private JPanel jPanel_bottom;
    private JPanel jPanel_top;

    public MyColorView() {
        this.myColorModel = new MyColorModel();

        this.setVisible(true);
        this.init();
    }

    private void init() {
        this.setTitle("My color");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);

        // *** Create controller
        MyColorController myColorController = new MyColorController(this);

        // *** create Font
        Font f_text = new Font("Arial", Font.BOLD, 100);
        Font f_bgc = new Font("Arial", Font.PLAIN, 30);

        // *** create JPanel
        this.jPanel_top = new JPanel();
        this.jPanel_bottom = new JPanel();
        this.jPanel_bottom.setLayout(new GridLayout(2, 3));

        // *** Create button, label

        JButton jButton_text_red = new JButton("Text red");
        jButton_text_red.setFont(f_bgc);
        jButton_text_red.setForeground(Color.RED);
        jButton_text_red.setOpaque(true);
        jButton_text_red.addActionListener(myColorController);

        JButton jButton_text_yellow = new JButton("Text yellow");
        jButton_text_yellow.setFont(f_bgc);
        jButton_text_yellow.setForeground(Color.YELLOW);
        jButton_text_yellow.setOpaque(true);
        jButton_text_yellow.addActionListener(myColorController);

        JButton jButton_text_green = new JButton("Text green");
        jButton_text_green.setFont(f_bgc);
        jButton_text_green.setForeground(Color.GREEN);
        jButton_text_green.setOpaque(true);
        jButton_text_green.addActionListener(myColorController);

        JButton jButton_background_red = new JButton("Background red");
        jButton_background_red.setFont(f_bgc);
        jButton_background_red.setBackground(Color.RED);
        jButton_background_red.setOpaque(true);
        jButton_background_red.addActionListener(myColorController);

        JButton jButton_background_yellow = new JButton("Background yellow");
        jButton_background_yellow.setFont(f_bgc);
        jButton_background_yellow.setBackground(Color.YELLOW);
        jButton_background_yellow.setOpaque(true);
        jButton_background_yellow.addActionListener(myColorController);

        JButton jButton_background_green = new JButton("Background green");
        jButton_background_green.setFont(f_bgc);
        jButton_background_green.setBackground(Color.GREEN);
        jButton_background_green.setOpaque(true);
        jButton_background_green.addActionListener(myColorController);

        // jButton_background_green.setBorderPainted(false); // Tắt viền
        // jButton_background_green.setContentAreaFilled(true); // Đảm bảo nút có màu
        // nền

        jLabel = new JLabel("Text");
        jLabel.setFont(f_text);

        // *** add JPanel
        jPanel_top.add(jLabel, BorderLayout.SOUTH);

        jPanel_bottom.add(jButton_text_red);
        jPanel_bottom.add(jButton_text_yellow);
        jPanel_bottom.add(jButton_text_green);
        jPanel_bottom.add(jButton_background_red);
        jPanel_bottom.add(jButton_background_yellow);
        jPanel_bottom.add(jButton_background_green);

        // *** add this
        this.add(jPanel_top, BorderLayout.CENTER);
        this.add(jPanel_bottom, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void changeToTextColor(Color color) {
        this.jLabel.setForeground(color);
    }

    public void changeToBackgroundColor(Color color) {
        this.jPanel_top.setBackground(color);
    }

}
