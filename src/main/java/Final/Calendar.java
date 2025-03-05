package Final;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.YearMonth;

public class Calendar extends JPanel {
    private JLabel monthYearLabel;
    private JPanel calendarPanel;
    private JButton prevButton, nextButton;
    private YearMonth currentYearMonth;

    public Calendar() {
        currentYearMonth = YearMonth.now();
        setSize(500, 400);
        setLayout(new BorderLayout());
        setLocation(10,50);
        setVisible(true);

        // Month and Year Label
        monthYearLabel = new JLabel();
        setBackground(Color.decode("#88BDF2"));
        monthYearLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        updateMonthYearLabel();
        add(monthYearLabel, BorderLayout.NORTH);

        // Calendar Panel
        calendarPanel = new JPanel(new GridLayout(0, 7));
        add(calendarPanel, BorderLayout.CENTER);


        // Navigation Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        prevButton = new JButton("<");
        prevButton.setBackground(Color.decode("#BDDDFc"));


        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentYearMonth = currentYearMonth.minusMonths(1);
                updateCalendar();
            }
        });
        buttonPanel.add(prevButton);

        nextButton = new JButton(">");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentYearMonth = currentYearMonth.plusMonths(1);
                updateCalendar();
            }
        });
        buttonPanel.add(nextButton);
        add(buttonPanel, BorderLayout.SOUTH);

        updateCalendar();
    }

    private void updateMonthYearLabel() {
        monthYearLabel.setText(currentYearMonth.getMonth().name() + " " + currentYearMonth.getYear());
    }

    private void updateCalendar() {
        updateMonthYearLabel();
        calendarPanel.removeAll(); // Clear previous calendar

        // Day names
        String[] dayNames = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : dayNames) {
            calendarPanel.add(new JLabel(day, SwingConstants.CENTER));
        }

        // Dates
        LocalDate firstDayOfMonth = currentYearMonth.atDay(1);
        int dayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();
        int daysInMonth = currentYearMonth.lengthOfMonth();

        // Add padding for days of the previous month
        for (int i = 0; i < dayOfWeek; i++) {
            calendarPanel.add(new JLabel(""));
        }

        // Add days of the current month
        for (int i = 1; i <= daysInMonth; i++) {
            calendarPanel.add(new JLabel(String.valueOf(i), SwingConstants.CENTER));
        }

        calendarPanel.revalidate();
        calendarPanel.repaint();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Calendar();
            }
        });
    }
}
