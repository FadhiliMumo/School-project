/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;
// Java program to implement
// a Simple Registration Form
// using Java Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Reg extends JFrame implements ActionListener {
    // Components of the Form    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel reg_name;
    private JTextField txt_reg_name;
    private JLabel pass_lbl;
    private JTextField pass_in;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;

    private JButton sub;
    private JButton reset;
    private JTextArea summ_out;
    private JLabel res;
    private JTextArea resadd;

    private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
            = { "2009", "2010","2011", "2012", "2013", "2014","2015", "2016", "2017", "2018",
            "2019","2020","2021","2022","2023","2024","2025" };

    // constructor, to initialize the components
    // with default values.
    public Reg()
    {
        setTitle("Registration Form");
        setBounds(300, 90, 570, 380);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 18));
        title.setSize(300, 30);
        title.setLocation(40, 10);
        c.add(title);

        reg_name = new JLabel("Name");
        reg_name.setFont(new Font("Arial", Font.PLAIN, 14));
        reg_name.setSize(100, 20);
        reg_name.setLocation(30, 50);
        c.add(reg_name);

        txt_reg_name = new JTextField();
        txt_reg_name.setFont(new Font("Arial", Font.PLAIN, 14));
        txt_reg_name.setSize(190, 20);
        txt_reg_name.setLocation(90, 50);
        c.add(txt_reg_name);

        pass_lbl = new JLabel("Password");
        pass_lbl.setFont(new Font("Arial", Font.PLAIN,14 ));
        pass_lbl.setSize(100, 20);
        pass_lbl.setLocation(30, 80);
        c.add(pass_lbl);

        pass_in = new JPasswordField();
        pass_in.setFont(new Font("Arial", Font.PLAIN, 14));
        pass_in.setSize(150, 20);
        pass_in.setLocation(110, 80);
        c.add(pass_in);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 15));
        gender.setSize(100, 20);
        gender.setLocation(30, 110);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 14));
        male.setSelected(true);
        male.setSize(60, 20);
        male.setLocation(90, 110);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 14));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(150, 110);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("Reg Date");
        dob.setFont(new Font("Arial", Font.PLAIN, 14));
        dob.setSize(100, 20);
        dob.setLocation(30, 140);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 13));
        date.setSize(50, 20);
        date.setLocation(100, 140);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 13));
        month.setSize(60, 20);
        month.setLocation(155, 140);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 13));
        year.setSize(60, 20);
        year.setLocation(220, 140);
        c.add(year);

        add = new JLabel("More Info");
        add.setFont(new Font("Arial", Font.PLAIN, 14));
        add.setSize(100, 15);
        add.setLocation(30, 170);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(150, 100);
        tadd.setLocation(120, 170);
        tadd.setLineWrap(true);
        c.add(tadd);


        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(80, 20);
        sub.setLocation(380, 300);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(75, 20);
        reset.setLocation(290, 300);
        reset.addActionListener(this);
        c.add(reset);

        summ_out = new JTextArea();
        summ_out.setFont(new Font("Arial", Font.PLAIN, 15));
        summ_out.setSize(250, 250);
        summ_out.setLocation(300, 20);
        summ_out.setLineWrap(true);
        summ_out.setEditable(false);
        c.add(summ_out);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {

                String data1;
                String data
                        = "Name : "+ txt_reg_name.getText() + "\n"
                        + "Mobile : "+ pass_in.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"+ "\n";
                else
                    data1 = "Gender : Female"+ "\n";
                String data2
                        = "Date of Registration : "+ (String)date.getSelectedItem()+ "/" + (String)month.getSelectedItem()+ "/"
                        + (String)year.getSelectedItem()+ "\n";

                String data3 = "More Info : " + tadd.getText();
                summ_out.setText(data + data1 + data2 + data3);
                summ_out.setEditable(false);
                res.setText("Registered");
            }


        else if (e.getSource() == reset) {
            String def = "";
            txt_reg_name.setText(def);
            tadd.setText(def);
            pass_in.setText(def);
            res.setText(def);
            summ_out.setText(def);

            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }


// Driver Code

    public static void main(String[] args) throws Exception
    {
        new Reg();
    }
}


