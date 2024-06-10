package assignments.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetricConversionAssistant extends JFrame {

    // Declare components
    private JLabel mileLabel;
    private JLabel kilometerLabel;
    private JLabel poundLabel;
    private JLabel kilogramLabel;
    private JLabel gallonLabel;
    private JLabel literLabel;
    private JLabel fahrenheitLabel;
    private JLabel centigradeLabel;
    private JTextField mileTextField;
    private JTextField kilometerTextField;
    private JTextField poundTextField;
    private JTextField kilogramTextField;
    private JTextField gallonTextField;
    private JTextField literTextField;
    private JTextField fahrenheitTextField;
    private JTextField centigradeTextField;
    private JButton convertButton;

    public MetricConversionAssistant() {
        // Initialize components
        mileLabel = new JLabel("Mile:");
        kilometerLabel = new JLabel("Kilometer:");
        poundLabel = new JLabel("Pound:");
        kilogramLabel = new JLabel("Kilogram:");
        gallonLabel = new JLabel("Gallon:");
        literLabel = new JLabel("Liters:");
        fahrenheitLabel = new JLabel("Fahrenheit:");
        centigradeLabel = new JLabel("Centigrade:");
        mileTextField = new JTextField(10);
        kilometerTextField = new JTextField(10);
        poundTextField = new JTextField(10);
        kilogramTextField = new JTextField(10);
        gallonTextField = new JTextField(10);
        literTextField = new JTextField(10);
        fahrenheitTextField = new JTextField(10);
        centigradeTextField = new JTextField(10);
        convertButton = new JButton("Convert");

        // Set preferred size for text fields (narrow in height)
        Dimension textFieldSize = new Dimension(100, 15); // Adjust height as necessary
        mileTextField.setPreferredSize(textFieldSize);
        kilometerTextField.setPreferredSize(textFieldSize);
        poundTextField.setPreferredSize(textFieldSize);
        kilogramTextField.setPreferredSize(textFieldSize);
        gallonTextField.setPreferredSize(textFieldSize);
        literTextField.setPreferredSize(textFieldSize);
        fahrenheitTextField.setPreferredSize(textFieldSize);
        centigradeTextField.setPreferredSize(textFieldSize);

        // Create panel and set layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Add components to panel with GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(mileLabel, gbc);
        gbc.gridx = 1;
        panel.add(mileTextField, gbc);
        gbc.gridx = 2;
        panel.add(kilometerLabel, gbc);
        gbc.gridx = 3;
        panel.add(kilometerTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(poundLabel, gbc);
        gbc.gridx = 1;
        panel.add(poundTextField, gbc);
        gbc.gridx = 2;
        panel.add(kilogramLabel, gbc);
        gbc.gridx = 3;
        panel.add(kilogramTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(gallonLabel, gbc);
        gbc.gridx = 1;
        panel.add(gallonTextField, gbc);
        gbc.gridx = 2;
        panel.add(literLabel, gbc);
        gbc.gridx = 3;
        panel.add(literTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(fahrenheitLabel, gbc);
        gbc.gridx = 1;
        panel.add(fahrenheitTextField, gbc);
        gbc.gridx = 2;
        panel.add(centigradeLabel, gbc);
        gbc.gridx = 3;
        panel.add(centigradeTextField, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        panel.add(convertButton, gbc);

        // Set frame properties
        setTitle("Metric Conversion Assistant");
        setContentPane(panel);
        pack(); // Adjusts frame size to fit components
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Add action listener to the button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertUnits();
            }
        });
    }

    private void convertUnits() {
        // Mile to Kilometer or Kilometer to Mile
        try {
            if (!mileTextField.getText().trim().isEmpty()) {
                double miles = Double.parseDouble(mileTextField.getText());
                kilometerTextField.setText(String.format("%.2f", miles * 1.60934));
            } else if (!kilometerTextField.getText().trim().isEmpty()) {
                double kilometers = Double.parseDouble(kilometerTextField.getText());
                mileTextField.setText(String.format("%.2f", kilometers / 1.60934));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for miles or kilometers", "Input Error", JOptionPane.ERROR_MESSAGE);
        }

        // Pound to Kilogram or Kilogram to Pound
        try {
            if (!poundTextField.getText().trim().isEmpty()) {
                double pounds = Double.parseDouble(poundTextField.getText());
                kilogramTextField.setText(String.format("%.2f", pounds * 0.453592));
            } else if (!kilogramTextField.getText().trim().isEmpty()) {
                double kilograms = Double.parseDouble(kilogramTextField.getText());
                poundTextField.setText(String.format("%.2f", kilograms / 0.453592));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for pounds or kilograms", "Input Error", JOptionPane.ERROR_MESSAGE);
        }

        // Gallon to Liters or Liters to Gallon
        try {
            if (!gallonTextField.getText().trim().isEmpty()) {
                double gallons = Double.parseDouble(gallonTextField.getText());
                literTextField.setText(String.format("%.2f", gallons * 3.78541));
            } else if (!literTextField.getText().trim().isEmpty()) {
                double liters = Double.parseDouble(literTextField.getText());
                gallonTextField.setText(String.format("%.2f", liters / 3.78541));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for gallons or liters", "Input Error", JOptionPane.ERROR_MESSAGE);
        }

        // Fahrenheit to Centigrade or Centigrade to Fahrenheit
        try {
            if (!fahrenheitTextField.getText().trim().isEmpty()) {
                double fahrenheit = Double.parseDouble(fahrenheitTextField.getText());
                centigradeTextField.setText(String.format("%.2f", (fahrenheit - 32) * 5 / 9));
            } else if (!centigradeTextField.getText().trim().isEmpty()) {
                double centigrade = Double.parseDouble(centigradeTextField.getText());
                fahrenheitTextField.setText(String.format("%.2f", (centigrade * 9 / 5) + 32));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for Fahrenheit or Centigrade", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MetricConversionAssistant().setVisible(true);
            }
        });
    }
}
