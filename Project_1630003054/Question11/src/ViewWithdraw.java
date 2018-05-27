import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewWithdraw extends View {

    private ControllerWithdraw c;
    private JTextField t1;
    private JTextField t2;

    public ViewWithdraw(Bank m, ControllerWithdraw c) {
        super(m);
        this.c = c;
        this.setTitle("Withdraw");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout());
        t1 = new JTextField();
        t2 = new JTextField();
        this.add(t1);
        this.add(t2);
        JButton btn = new JButton("Withdraw");
        this.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = c.withdraw(t1.getText(), t2.getText());
                if(!result.equals("")){
                    JOptionPane.showMessageDialog(null, result);
                }
            }
        });
        this.setVisible(true);
    }

    @Override
    public void update() {
        // do nothing
    }
}
