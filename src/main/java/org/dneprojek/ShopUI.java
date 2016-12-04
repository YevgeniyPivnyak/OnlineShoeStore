package org.dneprojek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 04.12.2016.
 */
public class ShopUI {

        public ShopUI() {
        JFrame f = new JFrame("Shoes Shop");
        f.setVisible(true);
        f.setMinimumSize(new Dimension(800, 600));
        f.setLocation(300, 100);

        f.getContentPane().add(createSellingPannel());

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();

    }

    private JPanel createSellingPannel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        JLabel custName = new JLabel("Customer Name");
        JTextField cuName = new JTextField();
        cuName.setColumns(25);

        panel.add(custName,new GridBagConstraints(0,0,1,1,0,0, GridBagConstraints.LINE_START,GridBagConstraints.NONE, new Insets(0,0,0,0),0,0));
        panel.add(cuName,new GridBagConstraints(1,0,1,1,0,0, GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));

        JLabel cms = new JLabel("Choose the model of shoes:");
        cms.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        JRadioButton rbCMS1 = new JRadioButton("sneakers");
        JRadioButton rbCMS2 = new JRadioButton("slippers");
        panel.add(cms,new GridBagConstraints(0,1,1,1,0,0, GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));
        panel.add(rbCMS1,new GridBagConstraints(0,2,1,1,0,0, GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));
        panel.add(rbCMS2,new GridBagConstraints(0,3,1,1,0,0, GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));

        JLabel quantity = new JLabel("Enter quantity");
        JTextField quantityText = new JTextField();
        quantityText.setColumns(5);
        panel.add(quantity,new GridBagConstraints(0,4,1,1,0,0, GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));
        panel.add(quantityText,new GridBagConstraints(1,4,1,1,0,0, GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));

        JButton buttonBuy = new JButton("Buy");
        panel.add(buttonBuy, new GridBagConstraints(0,5,1,1,0,0, GridBagConstraints.LINE_START,0, new Insets(0,0,0,0),0,0));
        buttonBuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customers c = new Customers();
                c.setName(cuName.getText());
                System.out.println("Congratulations! Your purchase was successful.");
            }
        });

        return panel;
    }

}