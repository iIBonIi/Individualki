import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    JLabel l1, l2;
    JTextField t1, t2;
    JTextArea t;
    Library lib;
    Panel() {

        lib = new Library();
        //t.setText("");

        l1 = new JLabel("Добавить Название");
        add(l1);
        t1 = new JTextField();
        t1.setColumns(10);
        add(t1);

        l2 = new JLabel("Добавить Автора");
        add(l2);
        t2 = new JTextField();
        t2.setColumns(10);
        add(t2);
    }
}

class Listener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        String name;
        String author;
        int page;
        int year;
        int price;
        Library lib = new Library();
        JTextArea t;
        Book book = new Book("name", "author", 100, 2024, 1500);

        lib.addBook(book);
        //t.append(book.showBooks());
    }
}

/*
class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int s1 = Integer.parseInt(f1.getText());
            int s2 = Integer.parseInt(f2.getText());
            int s3 = s1 + s2;
            f3.setText(String.valueOf(s3));
        }
    }
 */