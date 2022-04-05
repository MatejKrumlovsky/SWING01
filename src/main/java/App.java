import javax.swing.*;
import java.awt.*;

public class App {

    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300,300);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        okno.add(new MyCanvas());
    }
}
