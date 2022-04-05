import javax.swing.*;
import java.awt.*;

public class App {

    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300,300);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLayout(new GridLayout(3,4));

        JPanel panel = new JPanel();
        panel.setLayout((new GridLayout(2,2)));

        for (int i = 0; i < 4; i++){
            panel.add(new JLabel("Panel " + i));
        }

        panel.setBackground(new Color(190,120,150));
        okno.getContentPane().setBackground(Color.yellow);

        JLabel label = new JLabel("Fero Hora");
        okno.add(label);

        for (int i = 0 ; i < 10; i++){
            if (i == 5){
                okno.add(panel);
            }
            else{
                //System.out.println();
                okno.add(new JLabel(" "+ i));
            }

        }
    }
}
