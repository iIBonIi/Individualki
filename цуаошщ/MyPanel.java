import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyPanel extends JPanel {
    JLabel l1, l2, l3;
    JTextField f1, f2, f3;
    JButton b, b_eq, b_pl, b_mi, b_mu, b_de;


    MyPanel(){
        l1 = new JLabel("1-ое слагаемое");
        add(l1);
        f1 = new JTextField();
        f1.setColumns(10);
        add(f1);

        l2 = new JLabel("2-ое слагаемое");
        add(l2);
        f2 = new JTextField();
        f2.setColumns(10);
        add(f2);

        for(int i = 0; i<10; ++i){
            b = new JButton(String.valueOf(i));
            MyListener m = new MyListener();
            b.addActionListener(m);
            add(b);
        }

        b_mi = new JButton("-");
        MyListener m2 = new MyListener();
        b_mi.addActionListener(m2);
        add(b_mi);

        b_pl = new JButton("+");
        MyListener m3 = new MyListener();
        b_pl.addActionListener(m3);
        add(b_pl);

        b_mu = new JButton("*");
        MyListener m4 = new MyListener();
        b_mu.addActionListener(m4);
        add(b_mu);

        b_de = new JButton("/");
        MyListener m5 = new MyListener();
        b_de.addActionListener(m5);
        add(b_de);

        b_eq = new JButton("=");
        MyListener m1 = new MyListener();
        b_eq.addActionListener(m1);
        add(b_eq);

        l3 = new JLabel("Итого сумма");
        add(l3);
        f3 = new JTextField();
        f3.setColumns(10);
        add(f3);
    }

    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int s1 = Integer.parseInt(f1.getText());
            int s2 = Integer.parseInt(f2.getText());
            int s3 = s1 + s2;
            f3.setText(String.valueOf(s3));
        }
    }
}
