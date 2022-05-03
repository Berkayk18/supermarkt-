import javax.swing.*;

public class Product {
    private String productName;
    private ImageIcon productIcon;
    private float productPrice;
    private int total=0;


    //Constructor
    public Product(String productName, ImageIcon productIcon,float productPrice) {
        this.productName = productName;
        this.productIcon = productIcon;
        this.productPrice= productPrice;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    //Getter Setter


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ImageIcon getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(ImageIcon productIcon) {
        this.productIcon = productIcon;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
}
