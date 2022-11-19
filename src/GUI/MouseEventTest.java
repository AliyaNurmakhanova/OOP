package GUI;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventTest extends Frame implements MouseListener{
    private TextField tfMouseX;
    private TextField tfMouseY;

    public MouseEventTest() {
        setLayout(new FlowLayout());

        add(new Label("X-Click"));
        tfMouseX = new TextField(10);
        tfMouseX.setEditable(false);
        add(tfMouseX);

        add(new Label("Y-Click"));
        tfMouseY = new TextField(10);
        tfMouseY.setEditable(false);
        add(tfMouseY);

        addMouseListener(this);

        setTitle("Mouse listener demo");
        setSize(350, 200);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("Mouse clicked!");
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        System.out.println("Mouse pressed!");
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        System.out.println("Mouse released!");
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        System.out.println("Mouse entered!");
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        System.out.println("Mouse exited!");
    }
}
