package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTCounter extends Frame implements ActionListener {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;

    public AWTCounter() {
        setLayout(new FlowLayout());

        lblCount = new Label("Counter");
        add(lblCount);

        tfCount = new TextField(count + "", 10);
        add(tfCount);

        btnCount = new Button("Button");
        add(btnCount);

        btnCount.addActionListener(this);

        setTitle("AWT Counter");
        setSize(250, 250);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent var1) {
        ++count;
        tfCount.setText(count + "");
    }
}
