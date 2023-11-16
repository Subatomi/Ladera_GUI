package LeapYear;

import javax.swing.*;

public class Main extends JFrame{
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel jpanel;

    public Main(){
        btnCheckYear.addActionListener(e ->{
            String text = tfYear.getText();
            int year = Integer.parseInt(text);
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                JOptionPane.showMessageDialog(this,"Leap Year");
            }else{
                JOptionPane.showMessageDialog(this,"Not a leap year");
            }
        });
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setContentPane(app.jpanel);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");


    }
}


