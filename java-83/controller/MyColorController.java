package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorController implements ActionListener {
    private MyColorView myColorView;

    public MyColorController(MyColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        if (str.equals("Text red")) {

            this.myColorView.changeToTextColor(Color.RED);

        } else if (str.equals("Text yellow")) {

            this.myColorView.changeToTextColor(Color.YELLOW);

        } else if (str.equals("Text green")) {

            this.myColorView.changeToTextColor(Color.GREEN);

        } else if (str.equals("Background red")) {

            this.myColorView.changeToBackgroundColor(Color.RED);

        } else if (str.equals("Background yellow")) {

            this.myColorView.changeToBackgroundColor(Color.YELLOW);

        } else if (str.equals("Background green")) {

            this.myColorView.changeToBackgroundColor(Color.GREEN);

        }
    }

}
