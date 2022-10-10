package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(10, 10, 500, 300);
        f.setTitle("JListWindow");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());

        JLabel label = new JLabel("JList");
        label.setBorder(BorderFactory.createLoweredBevelBorder());
        mainPanel.add(
                label,
                new GridBagConstraints(
                        0,
                        0,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.BOTH,
                        new Insets(10, 20, 10, 10),
                        0,
                        0
                )
        );
        JTextField textElement = new JTextField();
        mainPanel.add(
                textElement,
                new GridBagConstraints(
                        0,
                        1,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(10, 20, 10, 10),
                        0,
                        0
                )
        );
        JButton addButton = new JButton("Agregar");
        mainPanel.add(addButton,
                new GridBagConstraints(
                        1,
                        1,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(10, 20, 10, 10),
                        0,
                        0
                )
        );

        JList<String> peopleList = new JList<>();
        DefaultListModel<String> peopleModel = new DefaultListModel<>();
        peopleList.setModel(peopleModel);
        peopleModel.addElement("álvaro pallarés");
        peopleModel.addElement("josé nchaso");
        peopleModel.addElement("adrián martínez");
        peopleModel.addElement("alex lópez");
        peopleModel.addElement("ana");
        peopleModel.addElement("pepe");

        mainPanel.add(
                new JScrollPane(peopleList),
                new GridBagConstraints(
                        0,
                        2,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(10, 20, 10, 10),
                        0,
                        0
                )
        );
        addButton.addActionListener(actionEvent -> {
            String text = textElement.getText();
            peopleModel.addElement(text);
            textElement.setText("");
        });

        mainPanel.add(
                new JButton("Eliminar"),
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(10, 20, 10, 10),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JButton("Borrar lista"),
                new GridBagConstraints(
                        1,
                        3,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(10, 20, 10, 10),
                        0,
                        0
                )
        );

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();

    }
}