package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventTest extends Frame implements ActionListener, WindowListener{
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;

    public WindowEventTest() {
        setLayout(new FlowLayout());

        add(new Label("Counter"));

        tfCount = new TextField("0", 10);
        tfCount.setEditable(false);
        add(tfCount);

        btnCount = new Button("Button");
        add(btnCount);

        btnCount.addActionListener(this);

        addWindowListener(this);

        setTitle("Window event demo");
        setSize(300, 250);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent var1) {
        ++count;
        tfCount.setText(count + "");
    }

    @Override
    public void windowOpened(WindowEvent var1) {
        System.out.println("Window opened!");
    }

    @Override
    public void windowClosing(WindowEvent var1) {
        System.out.println("Window closing ...");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent var1) {
        System.out.println("Window closed!");
    }

    @Override
    public void windowIconified(WindowEvent var1) {
        System.out.println("Window iconified!");
    }

    @Override
    public void windowDeiconified(WindowEvent var1) {
        System.out.println("Window deiconified!");
    }

    @Override
    public void windowActivated(WindowEvent var1) {
        System.out.println("Window activated!");
    }

    @Override
    public void windowDeactivated(WindowEvent var1) {
        System.out.println("Window deactivated!");
    }
}
