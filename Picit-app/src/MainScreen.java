import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;


public class MainScreen {

    ResourceBundle bundle = ResourceBundle.getBundle("Language");

    ArrayList<Product> foodArrayList = new ArrayList<>();
    ArrayList<Product> drinkArrayList = new ArrayList<>();
    ArrayList<Product> otherArrayList = new ArrayList<>();
    ArrayList<Product> cartList = new ArrayList<>();
    ArrayList<Product> favoritList = new ArrayList<>();


    public void mainScreen() {

        MyFrame frame = new MyFrame();
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBackground(Color.white);
        header.setBorder(new LineBorder(Color.black, 2));
        header.setBounds(0, 0, 1200, 100);

        JPanel navigation = new JPanel();
        navigation.setBackground(Color.white);
        navigation.setLayout(null);
        navigation.setBorder(new LineBorder(Color.black, 2));
        navigation.setBounds(0, 600, 1200, 100);
        frame.add(navigation);

//        URL url = Main.class.getResource("C:\\Users\\Tarek\\IdeaProjects\\PicItApp\\PT2\\cart.png");
        JButton cartButton = new JButton();
        ImageIcon cartIcon = new ImageIcon("cart.png");
        cartButton.setIcon(cartIcon);
        cartButton.setFocusable(false);
        cartButton.setBorder(new LineBorder(Color.black, 2));
        cartButton.setFont(new Font("broadway", Font.BOLD, 20));
        cartButton.setBounds(500, 5, 90, 90);
        cartButton.setBackground(Color.white);

        cartButton.setForeground(Color.black);
        navigation.add(cartButton);

        cartButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Cart();
                frame.dispose();
            }
        });


        JButton favoButton = new JButton();
        ImageIcon favIcon = new ImageIcon("Favoriteicon.jpg");
        favoButton.setIcon(favIcon);
        favoButton.setFocusable(false);
        favoButton.setBorder(new LineBorder(Color.black, 2));
        favoButton.setFont(new Font("broadway", Font.BOLD, 20));
        favoButton.setBounds(650, 5, 90, 90);
        favoButton.setBackground(Color.white);

        favoButton.setForeground(Color.black);
        navigation.add(favoButton);
        favoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Favorite();
                frame.dispose();
            }
        });


        JButton endsButton = new JButton(bundle.getString("Menu05"));
        endsButton.setFont(new Font("Broadway", Font.BOLD, 20));
        endsButton.setBounds(820, 705, 350, 50);
        endsButton.setBackground(Color.white);
        endsButton.setBorder(new LineBorder(Color.black, 2));
        endsButton.setForeground(Color.black);
        frame.add(endsButton);


        JLabel endsLabel = new JLabel("PIC IT " + "    " + "@ 2022");
        endsLabel.setBounds(5, 690, 250, 75);
        endsLabel.setFont(new Font("Broadway", Font.BOLD, 25));
        endsLabel.setForeground(Color.black);
        frame.add(endsLabel);

        ImageIcon headLabelImage = new ImageIcon("MainPhoto.png");
        JLabel headLabel = new JLabel(bundle.getString("Menu01"));

        headLabel.setIcon(headLabelImage);
        headLabel.setHorizontalAlignment(JLabel.LEFT);
        headLabel.setVerticalAlignment(JLabel.TOP);
        headLabel.setVerticalTextPosition(JLabel.CENTER);
        headLabel.setHorizontalTextPosition(JLabel.RIGHT);
        headLabel.setBounds(5, 2, 600, 100);
        headLabel.setIcon(headLabelImage);
        headLabel.setForeground(Color.black);
        headLabel.setFont(new Font("cooper black", Font.ITALIC, 30));


        header.add(headLabel);
        JButton english = new JButton();

        english.setBounds(785, 4, 93, 93);
        ImageIcon englishIcon = new ImageIcon("English.jpg");
        english.setIcon(englishIcon);
        english.setBorder(new LineBorder(Color.black));
        english.setFocusable(true);
        header.add(english);
        english.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResourceBundle bundle = ResourceBundle.getBundle("Language");
                Locale.setDefault(new Locale("English"));
                MainScreen change = new MainScreen();
                change.mainScreen();
                frame.dispose();
            }
        });


        JButton dutch = new JButton();
        dutch.setBounds(980, 4, 93, 93);
        ImageIcon dutchIcon = new ImageIcon("dutch.jpg");
        dutch.setIcon(dutchIcon);
        dutch.setBorder(new LineBorder(Color.black));
        dutch.setFocusable(true);

        header.add(dutch);
        dutch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Locale.setDefault(new Locale("Dutch"));
                MainScreen change = new MainScreen();
                change.mainScreen();
                frame.dispose();
            }
        });

        JLabel mainSc = new JLabel();
        ImageIcon mainIcon = new ImageIcon("Main screen jpg.jpg");
        mainSc.setIcon(mainIcon);
        mainSc.setBounds(710, 120, 400, 400);
        frame.add(mainSc);


// Food Button
        JButton foodButton = new JButton();
        foodButton.setFocusable(false);
        foodButton.setBorder(new LineBorder(Color.black, 2));
        ImageIcon foodIcon = new ImageIcon("grocerie.png");
        foodButton.setBackground(Color.white);
        foodButton.setFont(new Font("cooper black", Font.PLAIN, 25));
        foodButton.setIcon(foodIcon);
        foodButton.setText(bundle.getString("Menu02"));
        foodButton.setForeground(Color.black);
        foodButton.setBounds(5, 105, 600, 150);
        foodButton.setHorizontalAlignment(JLabel.LEFT);
        foodButton.setVerticalAlignment(JLabel.TOP);
        foodButton.setVerticalTextPosition(JLabel.CENTER);
        foodButton.setHorizontalTextPosition(JLabel.RIGHT);
        frame.add(foodButton);

        foodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                food();
                frame.dispose();
            }
        });

//Drinks button
        JButton drinksButton = new JButton();
        ImageIcon drinksIcon = new ImageIcon("drinks2png.png");
        drinksButton.setFocusable(false);
        drinksButton.setBorder(new LineBorder(Color.black, 2));
        drinksButton.setBackground(Color.white);
        drinksButton.setFont(new Font("cooper black", Font.PLAIN, 25));
        drinksButton.setIcon(drinksIcon);
        drinksButton.setText(bundle.getString("Menu03"));
        drinksButton.setForeground(Color.black);
        drinksButton.setBounds(5, 275, 600, 150);
        drinksButton.setHorizontalAlignment(JLabel.LEFT);
        drinksButton.setVerticalAlignment(JLabel.TOP);
        drinksButton.setVerticalTextPosition(JLabel.CENTER);
        drinksButton.setHorizontalTextPosition(JLabel.RIGHT);
        drinksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Drinks();
                frame.dispose();
            }
        });


        frame.add(drinksButton);


        JButton otherButton = new JButton();
        ImageIcon otherIcon = new ImageIcon("other.jpg");
        otherButton.setBackground(Color.white);
        otherButton.setFocusable(false);
        otherButton.setBorder(new LineBorder(Color.black, 2));

        otherButton.setFont(new Font("cooper black", Font.PLAIN, 25));
        otherButton.setIcon(otherIcon);
        otherButton.setText(bundle.getString("Menu04"));
        otherButton.setForeground(Color.black);
        otherButton.setBounds(5, 445, 600, 150);
        otherButton.setHorizontalAlignment(JLabel.LEFT);
        otherButton.setVerticalAlignment(JLabel.TOP);
        otherButton.setVerticalTextPosition(JLabel.CENTER);
        otherButton.setHorizontalTextPosition(JLabel.RIGHT);
        frame.add(otherButton);
        otherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Other();
                frame.dispose();
            }
        });


        frame.add(header);

        //frame.setVisible(true);
    }


    // Food void method
    public void food() {

        MyFrame frame = new MyFrame();
        Container contentPane = frame.getContentPane();
        //Hoofd Panel
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBackground(Color.white);
        header.setBorder(new LineBorder(Color.black, 2));
        header.setBounds(0, 0, 1200, 100);
        // Hoofd Label
        ImageIcon headLabelImage = new ImageIcon("prpoducts list.png");
        JLabel headLabel = new JLabel(bundle.getString("Menu02"));
        headLabel.setIcon(headLabelImage);
        headLabel.setHorizontalAlignment(JLabel.LEFT);
        headLabel.setVerticalAlignment(JLabel.TOP);
        headLabel.setVerticalTextPosition(JLabel.CENTER);
        headLabel.setHorizontalTextPosition(JLabel.RIGHT);
        headLabel.setBounds(5, 2, 600, 100);
        headLabel.setIcon(headLabelImage);
        headLabel.setForeground(Color.black);
        headLabel.setFont(new Font("cooper black", Font.ITALIC, 30));
        header.add(headLabel);
        //Main menu Button
        JButton mainMenu = new JButton();
        ImageIcon dutchIcon = new ImageIcon("Home.jpg");
        mainMenu.setIcon(dutchIcon);
        mainMenu.setBorder(new LineBorder(Color.black, 2));
        mainMenu.setBounds(950, 2, 98, 96);
        header.add(mainMenu);
        mainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foodArrayList = new ArrayList<>();
                mainScreen();
                frame.dispose();
            }
        });


        //Food List


        Product banana = new Product("        Bananen" + "1 kg (ca. 5 Pieces)" + "   " + "€", new ImageIcon("banana.png"), 1.19f);
        Product brocoly = new Product("        Broccoli  1 kg (ca. 2 Pieces)" + "    " + "€", new ImageIcon("brocoly.png"), 1.75f);
        Product lime = new Product("       Fresh Limes    3 Pieces      ", new ImageIcon("lime.png"), 2.25f);
        Product mango = new Product("        Mango    " + "Big mango" + "per piece" + "   " + "€", new ImageIcon("mango.png"), 2.15f);
        Product tomato = new Product("        the Best Roma tomatoes" + "6 pieces" + "   " + "€", new ImageIcon("tomato.png"), 3.25f);
        Product strawberry = new Product("        The best Strawberry" + "   " + "€", new ImageIcon("strawberry.png"), 3.69f);
        Product radish = new Product("         The best Radish  per bunch" + "   " + "€", new ImageIcon("radish.png"), 0.79f);


        foodArrayList.add(banana);
        foodArrayList.add(brocoly);

        foodArrayList.add(mango);
        foodArrayList.add(tomato);
        foodArrayList.add(lime);
        foodArrayList.add(strawberry);
        foodArrayList.add(radish);


        JList list = new JList(foodArrayList.toArray());

        list.setCellRenderer(new Productrenderer());


        JScrollPane scroll = new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(800, 480));
        scroll.setBorder(new LineBorder(Color.black, 2));
        JPanel panel = new JPanel();
        panel.add(scroll);
        panel.setBounds(5, 105, 800, 490);
        panel.setBackground(Color.white);
        frame.add(panel);


        //Navigatie Panel
        JPanel navigation = new JPanel();
        navigation.setBackground(Color.white);
        navigation.setLayout(null);
        navigation.setBorder(new LineBorder(Color.black, 2));
        navigation.setBounds(0, 600, 1200, 100);
        frame.add(navigation);
        //Cart Button
        JButton cartButton = new JButton();
        ImageIcon cartIcon = new ImageIcon("cart.png");
        cartButton.setIcon(cartIcon);
        cartButton.setFont(new Font("broadway", Font.BOLD, 20));
        cartButton.setBounds(500, 5, 90, 90);
        cartButton.setBackground(Color.white);
        cartButton.setBorder(new LineBorder(Color.black, 2));
        cartButton.setForeground(Color.black);
        navigation.add(cartButton);
        cartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cart();
                frame.dispose();
            }
        });
        //Favorite Button
        JButton favoButton = new JButton();
        ImageIcon favIcon = new ImageIcon("Favoriteicon.jpg");
        favoButton.setIcon(favIcon);
        favoButton.setFont(new Font("broadway", Font.BOLD, 20));
        favoButton.setBounds(650, 5, 90, 90);
        favoButton.setBackground(Color.white);
        favoButton.setBorder(new LineBorder(Color.black, 2));
        favoButton.setForeground(Color.black);
        navigation.add(favoButton);
        favoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Favorite();
                frame.dispose();
            }
        });


        // add to (favorite-cart)
        JButton addToCart = new JButton();
        ImageIcon addCart = new ImageIcon("addtocart.png");
        addToCart.setIcon(addCart);
        addToCart.setBounds(950, 200, 100, 100);
        addToCart.setBackground(Color.white);
        addToCart.setBorder(new LineBorder(Color.black, 2));
        addToCart.setForeground(Color.black);
        frame.add(addToCart);
        addToCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product item = (Product) list.getSelectedValue();
                addToCart(item);
//                cartList.add(item);
            }
        });
        //**********************************
        JButton addToFav = new JButton();
        ImageIcon addTofa = new ImageIcon("addtofav.png");
        addToFav.setIcon(addTofa);
        addToFav.setBounds(950, 410, 100, 100);
        addToFav.setBackground(Color.white);
        addToFav.setBorder(new LineBorder(Color.black, 2));
        addToFav.setForeground(Color.black);
        frame.add(addToFav);
        addToFav.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product item = (Product) list.getSelectedValue();
                addToFavorite(item);
//                favoritList.add(item);
            }
        });


        //Contact gegevens Button
        JButton endsButton = new JButton(bundle.getString("Menu05"));
        endsButton.setFont(new Font("Broadway", Font.BOLD, 20));
        endsButton.setBounds(820, 705, 350, 50);
        endsButton.setBackground(Color.white);
        endsButton.setBorder(new LineBorder(Color.black, 2));
        endsButton.setForeground(Color.black);
        frame.add(endsButton);
        //Pic It Label in het einde
        JLabel endsLabel = new JLabel("PIC IT " + "    " + "@ 2022");
        endsLabel.setBounds(5, 690, 250, 75);
        endsLabel.setFont(new Font("Broadway", Font.BOLD, 25));

        endsLabel.setForeground(Color.black);
        frame.add(endsLabel);

        frame.add(header);

        //frame.add(footer);
        //frame.add(scrollFood);
        frame.setVisible(true);

    }

    public void Drinks() {

        MyFrame frame = new MyFrame();
        Container contentPane = frame.getContentPane();
        //Hoofd Panel
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBackground(Color.white);
        header.setBorder(new LineBorder(Color.black, 2));
        header.setBounds(0, 0, 1200, 100);
        // Hoofd Label
        ImageIcon headLabelImage = new ImageIcon("drinks2.png");
        JLabel headLabel = new JLabel(bundle.getString("Menu03"));
        headLabel.setIcon(headLabelImage);
        headLabel.setHorizontalAlignment(JLabel.LEFT);
        headLabel.setVerticalAlignment(JLabel.TOP);
        headLabel.setVerticalTextPosition(JLabel.CENTER);
        headLabel.setHorizontalTextPosition(JLabel.RIGHT);
        headLabel.setBounds(5, 2, 600, 100);
        headLabel.setIcon(headLabelImage);
        headLabel.setForeground(Color.black);
        headLabel.setFont(new Font("cooper black", Font.ITALIC, 40));
        header.add(headLabel);
        //Main menu Button
        JButton mainMenu = new JButton();
        ImageIcon dutchIcon = new ImageIcon("Home.jpg");
        mainMenu.setIcon(dutchIcon);
        mainMenu.setBorder(new LineBorder(Color.black, 2));
        mainMenu.setBounds(950, 2, 98, 96);
        header.add(mainMenu);
        mainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkArrayList = new ArrayList<>();
                mainScreen();
                frame.dispose();
            }
        });


        //Drink List


        Product coffee = new Product("  Douwe Egberts Aroma Rood oploskoffie" + "  €", new ImageIcon("coffee.png"), 5.25f);
        Product beer = new Product("  Heineken Mono pilsener twist off" + "  (6 x 250 ml)" + "  €", new ImageIcon("beer.png"), 5.75f);
        Product cola = new Product("  Coca-Cola Regular cherry" + "  (4 x 250 ml)" + "  €", new ImageIcon("cola.png"), 2.25f);
        Product apple = new Product("  Appelsientje Multivitamientje appel-peer" + "  (1 liter)" + "  €", new ImageIcon("juice.png"), 1.79f);
        Product juice = new Product("  de Beste Frisse fruitdrank appel bosvruchten" + "  (6 x 200 ml)" + "  €", new ImageIcon("apple.png"), 1.25f);
        Product wine = new Product("Three Oaks Chardonnay" + "  (750 ml)" + "  €", new ImageIcon("wine.png"), 4.69f);
        Product capsule = new Product("de Beste Koffiecups cappuccino" + "  (sterkte 3)" + "  €", new ImageIcon("coffee2.png"), 0.79f);


        drinkArrayList.add(coffee);
        drinkArrayList.add(beer);

        drinkArrayList.add(apple);
        drinkArrayList.add(juice);
        drinkArrayList.add(cola);
        drinkArrayList.add(wine);
        drinkArrayList.add(capsule);
        JList list = new JList(drinkArrayList.toArray());
        list.setCellRenderer(new Productrenderer());


        JScrollPane scroll = new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(800, 480));
        scroll.setBorder(new LineBorder(Color.black, 2));
        JPanel panel = new JPanel();
        panel.add(scroll);
        panel.setBounds(5, 105, 800, 490);
        panel.setBackground(Color.white);
        frame.add(panel);


        //Navigatie Panel
        JPanel navigation = new JPanel();
        navigation.setBackground(Color.white);
        navigation.setLayout(null);
        navigation.setBorder(new LineBorder(Color.black, 2));
        navigation.setBounds(0, 600, 1200, 100);
        frame.add(navigation);
        //Cart Button
        JButton cartButton = new JButton();
        ImageIcon cartIcon = new ImageIcon("cart.png");
        cartButton.setIcon(cartIcon);
        cartButton.setFont(new Font("broadway", Font.BOLD, 20));
        cartButton.setBounds(500, 5, 90, 90);
        cartButton.setBackground(Color.white);
        cartButton.setBorder(new LineBorder(Color.black, 2));
        cartButton.setForeground(Color.black);
        navigation.add(cartButton);
        cartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cart();
                frame.dispose();
            }
        });
        //Favorite Button
        JButton favoButton = new JButton();
        ImageIcon favIcon = new ImageIcon("Favoriteicon.jpg");
        favoButton.setIcon(favIcon);
        favoButton.setFont(new Font("broadway", Font.BOLD, 20));
        favoButton.setBounds(650, 5, 90, 90);
        favoButton.setBackground(Color.white);
        favoButton.setBorder(new LineBorder(Color.black, 2));
        favoButton.setForeground(Color.black);
        navigation.add(favoButton);
        favoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Favorite();
                frame.dispose();
            }
        });


        // add to (favorite-cart)
        JButton addToCart = new JButton();
        ImageIcon addCart = new ImageIcon("addtocart.png");
        addToCart.setIcon(addCart);
        addToCart.setBounds(950, 200, 100, 100);
        addToCart.setBackground(Color.white);
        addToCart.setBorder(new LineBorder(Color.black, 2));
        addToCart.setForeground(Color.black);
        frame.add(addToCart);
        addToCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product item = (Product) list.getSelectedValue();
                addToCart(item);

            }
        });
        //**********************************
        JButton addToFav = new JButton();
        ImageIcon addTofa = new ImageIcon("addtofav.png");
        addToFav.setIcon(addTofa);
        addToFav.setBounds(950, 410, 100, 100);
        addToFav.setBackground(Color.white);
        addToFav.setBorder(new LineBorder(Color.black, 2));
        addToFav.setForeground(Color.black);
        frame.add(addToFav);





        //Contact gegevens Button
        JButton endsButton = new JButton(bundle.getString("Menu05"));
        endsButton.setFont(new Font("MV Boli", Font.BOLD, 20));
        endsButton.setBounds(820, 705, 350, 50);
        endsButton.setBackground(Color.white);
        endsButton.setBorder(new LineBorder(Color.black, 2));
        endsButton.setForeground(Color.black);
        frame.add(endsButton);
        //Pic It Label in het einde
        JLabel endsLabel = new JLabel("PIC IT " + "    " + "@ 2022");
        endsLabel.setBounds(5, 690, 250, 75);
        endsLabel.setFont(new Font("Broadway", Font.BOLD, 25));

        endsLabel.setForeground(Color.black);
        frame.add(endsLabel);

        frame.add(header);

        //frame.add(footer);
        //frame.add(scrollFood);
        frame.setVisible(true);

    }

    public void Other() {

        MyFrame frame = new MyFrame();
        Container contentPane = frame.getContentPane();
        //Hoofd Panel
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBackground(Color.white);
        header.setBorder(new LineBorder(Color.black, 2));
        header.setBounds(0, 0, 1200, 100);
        // Hoofd Label
        ImageIcon headLabelImage = new ImageIcon("other1.png");
        JLabel headLabel = new JLabel(bundle.getString("Menu04"));
        headLabel.setIcon(headLabelImage);
        headLabel.setHorizontalAlignment(JLabel.LEFT);
        headLabel.setVerticalAlignment(JLabel.TOP);
        headLabel.setVerticalTextPosition(JLabel.CENTER);
        headLabel.setHorizontalTextPosition(JLabel.RIGHT);
        headLabel.setBounds(5, 2, 600, 100);
        headLabel.setIcon(headLabelImage);
        headLabel.setForeground(Color.black);
        headLabel.setFont(new Font("cooper black", Font.ITALIC, 30));
        header.add(headLabel);
        //Main menu Button
        JButton mainMenu = new JButton();
        ImageIcon dutchIcon = new ImageIcon("Home.jpg");
        mainMenu.setIcon(dutchIcon);
        mainMenu.setBorder(new LineBorder(Color.black, 2));
        mainMenu.setBounds(950, 2, 98, 96);
        header.add(mainMenu);
        mainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                otherArrayList = new ArrayList<>();
                mainScreen();
                frame.dispose();
            }
        });


        //Ohter List


        Product dreft = new Product("Dreft Afwasmiddel 0% pure clean" + "450 ml" + "  €", new ImageIcon("dreft.png"), 2.99f);
        Product Mr = new Product("Mr. Muscle Ontstopper voor badkamer en keuken" + "500 ml" + "  €", new ImageIcon("mr.png"), 2.39f);
        Product persil = new Product("Persil Poeder wasmiddel megaperls color 17 wasbeurten" + "1,02 kg" + "  €", new ImageIcon("persil.png"), 2.25f);
        Product tissues = new Product("Page Vochtig toiletpapier aloe vera maxi pack" + "74 stuks" + "  €", new ImageIcon("tissues.png"), 2.95f);
        Product paperRoll = new Product("Popla Toiletpapier 2-laags" + "4 stuks" + "  €", new ImageIcon("toilet.png"), 2.79f);
        Product strawberry = new Product("Hegron Haargel extra strong" + "1liter" + "  €", new ImageIcon("gel.png"), 1.75f);
        Product radish = new Product("         The best Radish  per bunch" + "   " + "  €", new ImageIcon("nivea.png"), 0.79f);


        otherArrayList.add(dreft);
        otherArrayList.add(Mr);

        otherArrayList.add(tissues);
        otherArrayList.add(paperRoll);
        otherArrayList.add(persil);
        otherArrayList.add(strawberry);
        otherArrayList.add(radish);
        JList list = new JList(otherArrayList.toArray());
        list.setCellRenderer(new Productrenderer());


        JScrollPane scroll = new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(800, 480));
        scroll.setBorder(new LineBorder(Color.black, 2));
        JPanel panel = new JPanel();
        panel.add(scroll);
        panel.setBounds(5, 105, 800, 490);
        panel.setBackground(Color.white);
        frame.add(panel);


        //Navigatie Panel
        JPanel navigation = new JPanel();
        navigation.setBackground(Color.white);
        navigation.setLayout(null);
        navigation.setBorder(new LineBorder(Color.black, 2));
        navigation.setBounds(0, 600, 1200, 100);
        frame.add(navigation);
        //Cart Button
        JButton cartButton = new JButton();
        ImageIcon cartIcon = new ImageIcon("cart.png");
        cartButton.setIcon(cartIcon);
        cartButton.setFont(new Font("broadway", Font.BOLD, 20));
        cartButton.setBounds(500, 5, 90, 90);
        cartButton.setBackground(Color.white);
        cartButton.setBorder(new LineBorder(Color.black, 2));
        cartButton.setForeground(Color.black);
        navigation.add(cartButton);
        cartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cart();
                frame.dispose();
            }
        });
        //Favorite Button
        JButton favoButton = new JButton();
        ImageIcon favIcon = new ImageIcon("Favoriteicon.jpg");
        favoButton.setIcon(favIcon);
        favoButton.setFont(new Font("broadway", Font.BOLD, 20));
        favoButton.setBounds(650, 5, 90, 90);
        favoButton.setBackground(Color.white);
        favoButton.setBorder(new LineBorder(Color.black, 2));
        favoButton.setForeground(Color.black);
        navigation.add(favoButton);
        favoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Favorite();
                frame.dispose();
            }
        });


        // add to (favorite-cart)
        JButton addToCart = new JButton();
        ImageIcon addCart = new ImageIcon("addtocart.png");
        addToCart.setIcon(addCart);
        addToCart.setBounds(950, 200, 100, 100);
        addToCart.setBackground(Color.white);
        addToCart.setBorder(new LineBorder(Color.black, 2));
        addToCart.setForeground(Color.black);
        frame.add(addToCart);
        addToCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product item = (Product) list.getSelectedValue();
                addToCart(item);
            }
        });
        //*************.*********************
        JButton addToFav = new JButton();
        ImageIcon addTofa = new ImageIcon("addtofav.png");
        addToFav.setIcon(addTofa);
        addToFav.setBounds(950, 410, 100, 100);
        addToFav.setBackground(Color.white);
        addToFav.setBorder(new LineBorder(Color.black, 2));
        addToFav.setForeground(Color.black);
        frame.add(addToFav);
        addToFav.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product item = (Product) list.getSelectedValue();
                addToFavorite(item);
            }
        });


        //Contact gegevens Button
        JButton endsButton = new JButton(bundle.getString("Menu05"));
        endsButton.setFont(new Font("Broadway", Font.BOLD, 20));
        endsButton.setBounds(820, 705, 350, 50);
        endsButton.setBackground(Color.white);
        endsButton.setBorder(new LineBorder(Color.black, 2));
        endsButton.setForeground(Color.black);
        frame.add(endsButton);
        //Pic It Label in het einde
        JLabel endsLabel = new JLabel("PIC IT " + "    " + "@ 2022");
        endsLabel.setBounds(5, 690, 250, 75);
        endsLabel.setFont(new Font("Broadway", Font.BOLD, 25));

        endsLabel.setForeground(Color.black);
        frame.add(endsLabel);

        frame.add(header);

        //frame.setVisible(true);

    }

    public void Favorite() {

        MyFrame frame = new MyFrame();
        Container contentPane = frame.getContentPane();
        //Hoofd Panel
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBackground(Color.white);
        header.setBorder(new LineBorder(Color.black, 2));
        header.setBounds(0, 0, 1200, 100);
        // Hoofd Label
        ImageIcon headLabelImage = new ImageIcon("favorites-icon.png");
        JLabel headLabel = new JLabel(bundle.getString("Menu06"));
        headLabel.setIcon(headLabelImage);
        headLabel.setHorizontalAlignment(JLabel.LEFT);
        headLabel.setVerticalAlignment(JLabel.TOP);
        headLabel.setVerticalTextPosition(JLabel.CENTER);
        headLabel.setHorizontalTextPosition(JLabel.RIGHT);
        headLabel.setBounds(5, 2, 600, 100);
        headLabel.setIcon(headLabelImage);
        headLabel.setForeground(Color.black);
        headLabel.setFont(new Font("cooper black", Font.ITALIC, 30));
        header.add(headLabel);
        //Main menu Button
        JButton mainMenu = new JButton();
        ImageIcon dutchIcon = new ImageIcon("Home.jpg");
        mainMenu.setIcon(dutchIcon);
        mainMenu.setBorder(new LineBorder(Color.black, 2));
        mainMenu.setBounds(950, 2, 98, 96);
        header.add(mainMenu);
        mainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foodArrayList = new ArrayList<>();
                drinkArrayList = new ArrayList<>();
                otherArrayList = new ArrayList<>();
                mainScreen();
                frame.dispose();
            }
        });


        //Favorite List


        JList list = new JList(favoritList.toArray());
        list.setCellRenderer(new Productrenderer());


        JScrollPane scroll = new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(800, 480));
        scroll.setBorder(new LineBorder(Color.black, 2));
        JPanel panel = new JPanel();
        panel.add(scroll);
        panel.setBounds(5, 105, 800, 490);
        panel.setBackground(Color.white);
        frame.add(panel);


        //Navigatie Panel
        JPanel navigation = new JPanel();
        navigation.setBackground(Color.white);
        navigation.setLayout(null);
        navigation.setBorder(new LineBorder(Color.black, 2));
        navigation.setBounds(0, 600, 1200, 100);
        frame.add(navigation);
        //Cart Button
        JButton cartButton = new JButton();
        ImageIcon cartIcon = new ImageIcon("cart.png");
        cartButton.setIcon(cartIcon);
        cartButton.setFont(new Font("broadway", Font.BOLD, 20));
        cartButton.setBounds(500, 5, 90, 90);
        cartButton.setBackground(Color.white);
        cartButton.setBorder(new LineBorder(Color.black, 2));
        cartButton.setForeground(Color.black);
        navigation.add(cartButton);
        cartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Cart();
                frame.dispose();
            }
        });


        // add to (favorite-cart)
        JButton addToCart = new JButton();
        ImageIcon addCart = new ImageIcon("addtocart.png");
        addToCart.setIcon(addCart);
        addToCart.setBounds(950, 200, 100, 100);
        addToCart.setBackground(Color.white);
        addToCart.setBorder(new LineBorder(Color.black, 2));
        addToCart.setForeground(Color.black);
        frame.add(addToCart);
        addToCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product item = (Product) list.getSelectedValue();
                cartList.add(item);
            }
        });
        //**********************************
        JButton removeFavorite = new JButton();
        ImageIcon addTofa = new ImageIcon("favoritesremoveicon.png");
        removeFavorite.setIcon(addTofa);
        removeFavorite.setBounds(950, 410, 100, 100);
        removeFavorite.setBackground(Color.white);
        removeFavorite.setBorder(new LineBorder(Color.black, 2));
        removeFavorite.setForeground(Color.black);
        frame.add(removeFavorite);
        removeFavorite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product item = (Product) list.getSelectedValue();
                favoritList.remove(item);
                frame.dispose();
                Favorite();

            }
        });


        //Contact gegevens Button
        JButton endsButton = new JButton(bundle.getString("Menu05"));
        endsButton.setFont(new Font("Broadway", Font.BOLD, 20));
        endsButton.setBounds(820, 705, 350, 50);
        endsButton.setBackground(Color.white);
        endsButton.setBorder(new LineBorder(Color.black, 2));
        endsButton.setForeground(Color.black);
        frame.add(endsButton);
        //Pic It Label in het einde
        JLabel endsLabel = new JLabel("PIC IT " + "    " + "@ 2022");
        endsLabel.setBounds(5, 690, 250, 75);
        endsLabel.setFont(new Font("Broadway", Font.BOLD, 25));

        endsLabel.setForeground(Color.black);
        frame.add(endsLabel);

        frame.add(header);

        //frame.setVisible(true);

    }

    public void Cart() {

        MyFrame frame = new MyFrame();
        Container contentPane = frame.getContentPane();
        //Hoofd Panel
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBackground(Color.white);
        header.setBorder(new LineBorder(Color.black, 2));
        header.setBounds(0, 0, 1200, 100);
        // Hoofd Label
        ImageIcon headLabelImage = new ImageIcon("cart.png");
        JLabel headLabel = new JLabel(bundle.getString("Menu07"));
        headLabel.setIcon(headLabelImage);
        headLabel.setHorizontalAlignment(JLabel.LEFT);
        headLabel.setVerticalAlignment(JLabel.TOP);
        headLabel.setVerticalTextPosition(JLabel.CENTER);
        headLabel.setHorizontalTextPosition(JLabel.RIGHT);
        headLabel.setBounds(5, 2, 600, 100);
        headLabel.setIcon(headLabelImage);
        headLabel.setForeground(Color.black);
        headLabel.setFont(new Font("cooper black", Font.ITALIC, 30));
        header.add(headLabel);
        //Main menu Button
        JButton mainMenu = new JButton();
        ImageIcon dutchIcon = new ImageIcon("Home.jpg");
        mainMenu.setIcon(dutchIcon);
        mainMenu.setBorder(new LineBorder(Color.black, 2));
        mainMenu.setBounds(950, 2, 98, 96);
        header.add(mainMenu);
        mainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foodArrayList = new ArrayList<>();
                drinkArrayList = new ArrayList<>();
                otherArrayList = new ArrayList<>();
                mainScreen();
                frame.dispose();
            }
        });


        //Food List

        JList list = new JList(cartList.toArray());
        list.setCellRenderer(new Productrenderer());


        JScrollPane scroll = new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(800, 480));
        scroll.setBorder(new LineBorder(Color.black, 2));
        JPanel panel = new JPanel();
        panel.add(scroll);
        panel.setBounds(5, 105, 800, 490);
        panel.setBackground(Color.white);
        frame.add(panel);


        //Navigatie Panel
        JPanel navigation = new JPanel();
        navigation.setBackground(Color.white);
        navigation.setLayout(null);
        navigation.setBorder(new LineBorder(Color.black, 2));
        navigation.setBounds(0, 600, 1200, 100);
        frame.add(navigation);
        //Cart Button
        JButton favButton = new JButton();
        ImageIcon cartIcon = new ImageIcon("Favoriteicon.jpg");
        favButton.setIcon(cartIcon);
        favButton.setFont(new Font("broadway", Font.BOLD, 20));
        favButton.setBounds(500, 5, 90, 90);
        favButton.setBackground(Color.white);
        favButton.setBorder(new LineBorder(Color.black, 2));
        favButton.setForeground(Color.black);
        navigation.add(favButton);
        favButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Favorite();
                frame.dispose();
            }
        });


        // add to (favorite-cart)
        JButton addToCart = new JButton();
        ImageIcon addCart = new ImageIcon("Add.png");
        addToCart.setIcon(addCart);
        addToCart.setBounds(1025, 125, 80, 80);
        addToCart.setBackground(Color.white);
        addToCart.setBorder(new LineBorder(Color.black, 2));
        addToCart.setForeground(Color.black);

        frame.add(addToCart);
        //**********************************
        JButton remove = new JButton();

        ImageIcon addFavorite = new ImageIcon("remove.png");
        remove.setIcon(addFavorite);
        remove.setBounds(875, 125, 80, 80);
        remove.setBackground(Color.white);
        remove.setBorder(new LineBorder(Color.black, 2));

        frame.add(remove);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product item = (Product) list.getSelectedValue();
                cartList.remove(item);
                frame.dispose();
                Cart();
            }
        });


        // Pay button
        JButton payButton = new JButton(bundle.getString("Menu08"));
        payButton.setBounds(870, 440, 260, 80);
        payButton.setBackground(Color.white);
        ImageIcon payImage = new ImageIcon("payment.jpg");
        payButton.setIcon(payImage);
        payButton.setBorder(new LineBorder(Color.black, 3));
        payButton.setFont(new Font("helvitica", Font.BOLD, 20));
        payButton.setFocusable(false);
        payButton.setHorizontalAlignment(JLabel.LEFT);
        payButton.setVerticalAlignment(JLabel.TOP);
        payButton.setVerticalTextPosition(JLabel.CENTER);
        payButton.setHorizontalTextPosition(JLabel.RIGHT);
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code;
                if (!cartList.isEmpty()) {
                    code = JOptionPane.showInputDialog(null, "Voer Uw Code in  ");

                    while (true)
                        if (code.equals("1234")) {
                            JOptionPane.showMessageDialog(null, "Bedankt Voor U besteling   ");

                            cartList.removeAll(cartList);
                            Cart();
                            frame.dispose();
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "probeer weer   ");
                            code = JOptionPane.showInputDialog(null, "Voer Uw Code in  ");
                        }
                } else {
                    JOptionPane.showMessageDialog(null, "Uw winkel mand is leeg");
                }
            }
        });


        frame.add(payButton);


        //Contact gegevens Button
        JButton endsButton = new JButton(bundle.getString("Menu05"));
        endsButton.setFont(new Font("Broadway", Font.BOLD, 20));
        endsButton.setBounds(820, 705, 350, 50);
        endsButton.setBackground(Color.white);
        endsButton.setBorder(new LineBorder(Color.black, 2));
        endsButton.setForeground(Color.black);
        frame.add(endsButton);
        //Pic It Label in het einde
        JLabel endsLabel = new JLabel("PIC IT " + "    " + "@ 2022");
        endsLabel.setBounds(5, 690, 250, 75);
        endsLabel.setFont(new Font("Broadway", Font.BOLD, 25));

        endsLabel.setForeground(Color.black);
        frame.add(endsLabel);

        frame.add(header);

        //frame.setVisible(true);

    }

    void addToFavorite(Product item) {
        String itemName = item.getProductName();
        boolean isFound = false;
        for (int i = 0; i < favoritList.size(); i++) {
            if (favoritList.get(i).getProductName() == itemName) {
                isFound = true;
            }
        }
        if (!isFound) {
            favoritList.add(item);
        } else {
            System.out.println("Item is already exist");
        }


    }

    void addToCart(Product item) {

        String itemName = item.getProductName();
        boolean isFound = false;
        int itemPosition = 0;
        int currentTotal = 0;
        for (int i = 0; i < cartList.size(); i++) {
            if (cartList.get(i).getProductName() == itemName) {
                isFound = true;
                itemPosition = i;
                currentTotal = cartList.get(i).getTotal();
            }
        }
        if (!isFound) {
            cartList.add(item);
        } else {
            cartList.get(itemPosition).setTotal(currentTotal + 1);
            System.out.println(currentTotal);
        }
    }

}


