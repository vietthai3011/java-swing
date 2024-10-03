package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.TimKiemController;
import model.TimKiemModel;

public class TimKiemView extends JFrame {
    private TimKiemModel timKiemModel;
    private JLabel jb_VanBan;
    private JLabel jb_TuKhoa;
    private JLabel jb_KetQua;
    private JTextArea jta_VanBan;
    private JTextField jtf_TuKhoa;

    public TimKiemView() {
        this.timKiemModel = new TimKiemModel();

        this.init();
    }

    private void init() {
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setTitle("Tìm từ khóa");

        ActionListener actionListener = new TimKiemController(this);

        // *** Create Font
        Font f1 = new Font("Arial", Font.BOLD, 30);
        Font f2 = new Font("Arial", Font.BOLD, 50);

        // *** Create JLabel
        this.jb_VanBan = new JLabel("Văn bản");
        this.jb_VanBan.setFont(f2);

        this.jb_TuKhoa = new JLabel("Từ Khóa");
        this.jb_TuKhoa.setFont(f2);

        this.jb_KetQua = new JLabel();
        this.jb_KetQua.setFont(f2);
        this.jb_KetQua.setOpaque(true);
        this.jb_KetQua.setBackground(Color.YELLOW);

        // *** Create JTextArial
        this.jta_VanBan = new JTextArea(5, 5);
        this.jta_VanBan.setFont(f1);

        // *** Create JTextField
        this.jtf_TuKhoa = new JTextField();
        this.jtf_TuKhoa.setFont(f1);

        // *** Create JButton
        JButton jButton_Thongke = new JButton("Thống kê");
        jButton_Thongke.setFont(f1);
        jButton_Thongke.addActionListener(actionListener);
        jButton_Thongke.setBackground(Color.GREEN);

        // *** Create JPanel
        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new BorderLayout(10, 10));

        JPanel jPanel_center_top = new JPanel();
        jPanel_center_top.setLayout(new BorderLayout(10, 10));

        JPanel jPanel_center_bottom = new JPanel();
        jPanel_center_bottom.setLayout(new BorderLayout(10, 10));

        JPanel jPanel_bottom = new JPanel();
        jPanel_bottom.setLayout(new BorderLayout(90, 10));

        // *** add JPanel
        jPanel_center_top.add(jb_VanBan, BorderLayout.NORTH);
        jPanel_center_top.add(jta_VanBan, BorderLayout.SOUTH);
        jPanel_center_bottom.add(jb_TuKhoa, BorderLayout.WEST);
        jPanel_center_bottom.add(jtf_TuKhoa, BorderLayout.CENTER);

        jPanel_center.add(jPanel_center_top, BorderLayout.NORTH);
        jPanel_center.add(jPanel_center_bottom, BorderLayout.CENTER);

        jPanel_bottom.add(jButton_Thongke, BorderLayout.WEST);
        jPanel_bottom.add(jb_KetQua, BorderLayout.CENTER);

        this.add(jPanel_center, BorderLayout.CENTER);
        this.add(jPanel_bottom, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void timKiem() {
        this.timKiemModel.setVanBan(this.jta_VanBan.getText());
        System.out.println(this.timKiemModel.getVanBan());
        this.timKiemModel.setTuKhoa(this.jtf_TuKhoa.getText());
        System.out.println(this.timKiemModel.getTuKhoa());
        this.timKiemModel.timKiem();
        this.jb_KetQua.setText(this.timKiemModel.getKetQua());
        System.out.println(this.timKiemModel.getKetQua());
    }

}
