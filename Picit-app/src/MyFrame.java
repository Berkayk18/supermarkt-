import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        Container container= getContentPane();
        Border mainBorder = BorderFactory.createLineBorder(Color.red, 3);

        setSize(1200, 800);
        setResizable(false);
        setLayout(null);
        setTitle("PICIT");
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("Maincorner.png");
        setIconImage(icon.getImage());




        setVisible(true);


    }


}
