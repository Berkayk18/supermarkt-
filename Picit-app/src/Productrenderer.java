import javax.swing.*;
import java.awt.*;

public class Productrenderer extends DefaultListCellRenderer {

    Font font = new Font("helvitica", Font.BOLD, 25);

    @Override
    public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {

        JLabel label = (JLabel) super.getListCellRendererComponent(
                list, value, index, isSelected, cellHasFocus);


        Product product = (Product) value;
        label.setIcon(product.getProductIcon());
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setText(product.getProductName()+ product.getProductPrice());
        label.setFont(font);
        return label;
    }
}
