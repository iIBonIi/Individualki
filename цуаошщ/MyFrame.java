import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(){
        setSize(800, 600);
        setDefaultCloseOperation(3);
        MyPanel panel = new MyPanel();
        add(panel);
        setVisible(true);
    }
}
