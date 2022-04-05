import java.awt.*;

public class MyCanvas extends Canvas {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(100,100,100,100);
        g.setColor(Color.green);
        g.fillPolygon(new int [] {100,200,150}, new int[] {100,100,80}, 3);

        for(int x = 0; x<2;x++){
            for (int y = 0; y< 2; y++){
                g.fillRect(110+45*x, 110+45*y, 35,35);
            }
        }
    }
}
