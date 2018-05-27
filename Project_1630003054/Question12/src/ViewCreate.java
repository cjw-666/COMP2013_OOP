import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewCreate extends View{
    private ControllerCreate c;
    private JTextField t1;
    private JTextField t2;
    private JComboBox<String> cb;

    public ViewCreate(Bank m, ControllerCreate c){
        super(m);
        this.c = c;
        this.setTitle("Create");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout());
        t1 = new JTextField();
        t2 = new JTextField();
        this.add(t1);
        this.add(t2);
        String[] accountType = {"credit account", "student account"};
        cb = new JComboBox<String>(accountType);
        this.add(cb);
        JButton btn = new JButton("Create");
        this.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int type = cb.getSelectedIndex();
                String result = c.create(t1.getText(), t2.getText(), type);
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
