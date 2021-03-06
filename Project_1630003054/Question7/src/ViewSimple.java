import javax.swing.*;
import java.awt.*;

public class ViewSimple extends JFrame implements ModelListener {

    private Bank m;
    private ControllerSimple c;
    private JLabel label;

    public ViewSimple(Bank m, ControllerSimple c) {
        this.m = m;
        this.c = c;
        this.setTitle("Total Money");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        label = new JLabel("Total amount of money: " + m.totalMoney()); // init the label
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void update() {
        label.setText("Total amount of money: " + m.totalMoney());
        repaint();
    }
}
