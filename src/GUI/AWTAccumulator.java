package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame implements ActionListener {
    private Label lblInput;
    private Label lblOutput;
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0;

    public AWTAccumulator() {
        setLayout(new FlowLayout());

        lblInput = new Label("Enter an Integer: ");
        add(lblInput);

        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(this);

        lblOutput = new Label("The accumulate sum is: ");
        add(lblOutput);

        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);

        setTitle("AWT accumulator");
        setSize(350, 250);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent var1) {
        int numberIn = Integer.parseInt(tfInput.getText());
        sum += numberIn;
        tfInput.setText("");
        tfOutput.setText(sum + "");
    }
}
