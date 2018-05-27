import javax.swing.*;
import java.awt.*;

public class ViewHistory extends View {
    private ControllerHistory c;

    public ViewHistory(Bank m, ControllerHistory c) {
        super(m);
        this.c = c;
        this.setTitle("View History");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        HistoryPanel hp = new HistoryPanel(m);
        this.add(hp);
        // this.add(new HistoryPanel(m));
        this.setVisible(true);
    }

    @Override
    public void update() {
        repaint();
    }
}
