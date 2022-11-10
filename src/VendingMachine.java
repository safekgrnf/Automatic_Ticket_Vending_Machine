import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendingMachine {
        private JTabbedPane Menu;
        private JPanel Food;
        private JButton BibimbaButton;
        private JButton TsukimiButton;
        private JButton ThirtyButton;
        private JButton SabaButton;
        private JButton ChickenButton;
        private JButton DashiButton;
        private JPanel Dessert;
        private JButton HojiKakiButton;
        private JButton MonburanButton;
        private JButton AnmitsuButton;
        private JButton MacchaButton;
        private JPanel Drink;
        private JButton HotGreenButton;
        private JButton HotBlackButton;
        private JButton ColdGreenButton;
        private JButton ColdHojiButton;
        private JPanel Order;
        private JTextPane textPane1;
        private JButton CheckoutButton;
        private JTextPane Total;
        private JPanel root;

    int sum = 0;
    int tmp = 0;
    int price = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VendingMachine");
        frame.setContentPane(new VendingMachine().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public VendingMachine(){

        BibimbaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 1320;
                Order("Bibimbap Buddha Bowl.");

            }
        });

        TsukimiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 1430;
                Order("Tsukimi Buddha Bowl");
            }
        });

        ThirtyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 1210;
                Order("Thirty Balanced Buddha Bowl");
            }
        });

        SabaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 1000;
                Order("Saba-miso Rice Set");
            }
        });

        ChickenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 1200;
                Order("Japanese FliedChicken Rice Set");
            }
        });


        DashiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 1500;
                Order("Ochazuke");
            }
        });

        HojiKakiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 1300;
                Order("Hojitea Chushed ice");
            }
        });


        MacchaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 1250;
                Order("Maccha Chushed Ice");
            }
        });

        MonburanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 800;
                Order("Kinako Mont Blanc cake");
            }
        });

        AnmitsuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 900;
                Order("Anmitsu");
            }
        });

        HotGreenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 450;
                Order("Hot Green Tea");
            }
        });

        HotBlackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 500;
                Order("Japanese Black Tea");
            }
        });

        ColdGreenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 550;
                Order("Cold Green Tea");
            }
        });

        ColdHojiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 600;
                Order("Cold Hoji Tea");
            }
        });

        CheckoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirmation =JOptionPane.showConfirmDialog(null,
                        "Would you like to order Check Out?",
                        "order confirmation",
                        JOptionPane.YES_NO_OPTION);
                if(confirmation ==0 ) {
                    JOptionPane.showMessageDialog(null,"Thank you. The total is " + sum + " yen");
                    sum=0;
                    Total.setText("Total");
                    textPane1.setText(null);
                }
            }
        });
    }

        void Order(String food){
            String currentText= textPane1.getText();
            int confirmation =JOptionPane.showConfirmDialog(null,
                    "Would you like to order "+ food +"?",
                    "order confirmation",
                    JOptionPane.YES_NO_OPTION);
            if(confirmation ==0 ){
                JOptionPane.showMessageDialog(null, "Thank you for ordering "+food+". It will be served as soon as possible!!");
                Total.setText("Total: "+sum+"yen");
                price = sum -tmp;
                textPane1.setText(currentText + food +"："+price+"yen\n");
                tmp = sum;
            }
        }

}
