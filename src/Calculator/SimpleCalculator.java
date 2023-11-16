package Calculator;

import javax.swing.*;

public class SimpleCalculator extends JFrame{
    private JTextField textField1;
    private JButton btnCompute;
    private JTextField textField2;
    private JComboBox cbOperations;
    private JTextField lblResult;
    private JLabel tfNumber1;
    private JLabel tfNumber2;
    private JPanel cpanel;

    public SimpleCalculator(){
        btnCompute.addActionListener(e ->{
            int result = 0;
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            String prog = (String) cbOperations.getSelectedItem();
            switch (prog){
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            lblResult.setText(Integer.toString(result));
        });
    }
    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.cpanel);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");


    }
}
