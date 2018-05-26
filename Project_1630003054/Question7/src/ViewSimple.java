import javax.swing.*;

public class ViewSimple extends JFrame implements ModelListener {

    private Bank m;
    private ControllerSimple c;
    private JLabel label;

    public ViewSimple(Bank m, ControllerSimple c) {
        this.m = m;
        this.c = c;
        label = new JLabel("Total amount of money: " + m.totalMoney());
    }


    @Override
    public void update() {
        label.setText("Total amount of money: " + m.totalMoney());
    }
}
