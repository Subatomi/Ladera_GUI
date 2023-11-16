package FoodOrderingSystem;

import javax.swing.*;

public class FoodOrdering extends JFrame{
    private JCheckBox cFries;
    private JCheckBox cSundae;
    private JCheckBox cBurger;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JPanel fopanel;

    public FoodOrdering(){
        btnOrder.addActionListener(e ->{
            double price = 0;
            if(cPizza.isSelected()){
                price += 100;
            }
            if(cBurger.isSelected()){
                price += 80;
            }
            if(cFries.isSelected()){
                price += 65;
            }
            if(cSoftDrinks.isSelected()){
                price += 55;
            }
            if(cTea.isSelected()){
                price += 50;
            }
            if(cSundae.isSelected()){
                price += 40;
            }
            if(rb5.isSelected()){
                price*=.95;
            }
            if(rb10.isSelected()){
                price*=.90;
            }
            if(rb15.isSelected()){
                price*=.85;
            }
            JOptionPane.showMessageDialog(this, "The total price is " + String.format("%.2f", price));
        });
    }
    public static void main(String[] args) {
        FoodOrdering app = new FoodOrdering();
        app.setContentPane(app.fopanel);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");


    }

}
