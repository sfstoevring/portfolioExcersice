import java.awt.*;
import javax.swing.*;



public class Frame {

    static GraphicsConfiguration gc;

    public void createFrame(int width, int height){
        JFrame frame = new JFrame(gc);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setTitle("Riismælk");
    }

}

