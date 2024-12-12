import javax.swing.*;

public class Frame extends JFrame {
    Frame(){
        setSize(800, 600);
        setDefaultCloseOperation(3);
        Panel panel = new Panel();
        add(panel);
        setVisible(true);
    }
}