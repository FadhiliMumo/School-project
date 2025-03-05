package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events extends JFrame implements ActionListener {
    private JLabel event;
    private JTextField title_txt;
    private Container cont;
    private  JLabel Date;
    private JButton add;
    private JTextField Date_txt;
    private JTextField event_txt;

    private JTextArea out;
    public Events(){





        event = new JLabel("Name");
        event.setFont(new Font("Arial", Font.PLAIN, 14));
        event.setSize(100, 20);
        event.setLocation(30, 50);
        cont.add(event);

        title_txt = new JTextField();
        title_txt .setFont(new Font("Arial", Font.PLAIN, 14));
        title_txt .setSize(190, 20);
        title_txt .setLocation(90, 50);
        cont.add(title_txt );

        Date = new JLabel("Date");
        Date.setFont(new Font("Arial", Font.PLAIN,14 ));
        Date.setSize(100, 20);
        Date.setLocation(30, 80);
        cont.add(Date);

        Date_txt = new JTextField();
        Date_txt .setFont(new Font("Arial", Font.PLAIN, 14));
        Date_txt .setSize(190, 20);
        Date_txt.setLocation(90, 50);
        cont.add( Date_txt );

        event = new JLabel("Name");
        event.setFont(new Font("Arial", Font.PLAIN, 14));
        event.setSize(100, 20);
        event.setLocation(30, 50);
        cont.add(event);

        event_txt = new JTextField();
        event_txt .setFont(new Font("Arial", Font.PLAIN, 14));
        event_txt .setSize(190, 20);
        event_txt.setLocation(90, 50);
        cont.add( event_txt );

        out = new JTextArea();
        out.setFont(new Font("Arial", Font.PLAIN, 15));
        out.setSize(250, 250);
        out.setLocation(300, 20);
        out.setLineWrap(true);
        out.setEditable(false);
        cont.add(out);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {


            String data
                    = "Title : "+ title_txt.getText() + "\n"
                    + "Events : "+ event_txt.getText() + "\n";
            String data1 = "More Info : " +event_txt .getText();
            out.setText(data    + data1);
            out.setEditable(false);

        }
    }
public static void main (String[]args){
        new Events();

}



}
