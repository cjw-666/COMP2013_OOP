import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HistoryPanel extends JPanel {

    private Bank m;

    public HistoryPanel(Bank m){
        this.m = m;
    }

    private int historyMax(ArrayList<Integer> history){
        int max = history.get(0);
        for (Integer number: history){
            if (max < number){
                max = number;
            }
        }
        return max;
    }

    private int historyMin(ArrayList<Integer> history){
        int min = history.get(0);
        for (Integer number: history){
            if (min > number){
                min = number;
            }
        }
        return min;
    }

    private int historyRange(ArrayList<Integer> history){
        int range;
        int max = history.get(0);
        for (Integer number: history){
            if (max < number){
                max = number;
            }
        }
        int min = history.get(0);
        for (Integer number: history){
            if (min > number){
                min = number;
            }
        }
        range = max - min;
        if (range < 100){
            range = 100; // strictly less than 100 then return 100;
        }
        return range;
    }

    @Override
    protected void printComponent(Graphics g) {
        super.printComponent(g);
        int min = historyMin(m.getHistory());
        int range = historyRange(m.getHistory());
        int maxX = getWidth() - 1;
        int maxY = getHeight() - 1;
        int zero = maxY + min * maxY / range;
        g.setColor(Color.BLUE);
        g.drawLine(0, zero, maxX, zero);
        g.setColor(Color.RED);
        if (m.getHistory().size() == 1){
            int x = 10 * 1;
            int y = zero - m.getHistory().get(1) * maxY;
            g.drawRect(x, y, 1, 1);
        }else{
            for (int i = 1; i < m.getHistory().size(); i++){
                int x1 = 10 * (i - 1);
                int y1 = zero - m.getHistory().get(i - 1) * maxY;
                int x2 = 10 * i;
                int y2 = zero - m.getHistory().get(i) * maxY;
                g.drawRect(x1, y1, x2, y2);
            }
        }
    }
}
