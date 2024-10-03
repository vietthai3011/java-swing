package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CounterView;

public class CounterListener implements ActionListener {
    private CounterView counterView;

    public CounterListener(CounterView counterView) {
        this.counterView = counterView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String srt = e.getActionCommand();

        if (srt.equals("Up")) {
            this.counterView.increment();
        } else if (srt.equals("Down")) {
            this.counterView.decrement();
        } else if (srt.equals("Reset")) {
            this.counterView.reset();
        }
    }

}
