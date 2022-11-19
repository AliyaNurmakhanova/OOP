package GUI;

import org.w3c.dom.events.MouseEvent;

import java.util.EventListener;

public interface MouseListener extends EventListener {
    void mouseClicked(MouseEvent var1);
    void mousePressed(MouseEvent var1);
    void mouseReleased(MouseEvent var1);
    void mouseEntered(MouseEvent var1);
    void mouseExited(MouseEvent var1);
}
