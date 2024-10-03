package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TimKiemView;

/**
 * TimKiemController
 */
public class TimKiemController implements ActionListener {
    private TimKiemView timKiemView;

    public TimKiemController(TimKiemView timKiemView) {
        this.timKiemView = timKiemView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        if (str.equals("Thống kê")) {
            this.timKiemView.timKiem();
        }
    }

}