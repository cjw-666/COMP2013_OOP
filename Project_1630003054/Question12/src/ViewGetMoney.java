import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewGetMoney extends View {

    private ControllerGetMoney c;
    private JTextField t;

    public ViewGetMoney(Bank m, ControllerGetMoney c) {
        super(m);
        this.c = c;
        this.setTitle("Get Money");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout());
        t = new JTextField();
        JButton btn = new JButton("Get Money");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = c.getMoney(t.getText()); // get the input text and get the money
                JOptionPane.showMessageDialog(null, result); // message dialog
            }
        });
        this.add(t);
        this.add(btn);
        this.setVisible(true);
    }

    @Override
    public void update() {
        // do nothing
    }
}
