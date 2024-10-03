package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MiniCalculatorView;

public class MiniCalculatorController implements ActionListener {
    private final MiniCalculatorView miniCalculatorView;

    public MiniCalculatorController(MiniCalculatorView miniCalculatorView) {
        this.miniCalculatorView = miniCalculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        if (str.equals("+")) {
            this.miniCalculatorView.cong();
        } else if (str.equals("-")) {
            this.miniCalculatorView.tru();
        } else if (str.equals("*")) {
            this.miniCalculatorView.nhan();
        } else if (str.equals("/")) {
            this.miniCalculatorView.chia();
        } else if (str.equals("%")) {
            this.miniCalculatorView.mod();
        } else if (str.equals("^")) {
            this.miniCalculatorView.mu();
        }

    }

}
