package assignments.lesson7.problem1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetricConvertionAssistant extends JFrame {
    private JPanel leftJPanel;
    private JPanel rightJPanel;
    private JTextField txtMile;
    private JTextField txtGallon;
    private JTextField txtFahrenheit;
    private JTextField txtKilometer;
    private JTextField txtCentrigrade;
    private JTextField txtKilogram;
    private JTextField txtLiters;
    private JButton btConvert;
    private JLabel lblMile;
    private JTextField txtPound;
    private JLabel lblPound;
    private JLabel lblGalon;
    private JLabel lblfahrenheit;
    private JLabel lblKilometer;
    private JLabel lblLiters;
    private JLabel lblKilogram;
    private JLabel lblCentrigrade;

    private void createUIComponents() {
        lblMile = new JLabel("Mile:");
        txtMile = new JTextField(10);
        lblKilometer = new JLabel("Kilometer:");
        txtKilometer = new JTextField(10);
        lblPound = new JLabel("Pound:");
        txtPound = new JTextField(10);
        lblKilogram = new JLabel("Kilogram:");
        txtKilogram = new JTextField(10);
        lblGalon = new JLabel("Gallon:");
        txtGallon = new JTextField(10);
        lblLiters = new JLabel("Liters:");
        txtLiters = new JTextField(10);
        lblfahrenheit = new JLabel("Fahrenheit:");
        txtFahrenheit = new JTextField(10);
        lblCentrigrade = new JLabel("Centigrade:");
        txtCentrigrade = new JTextField(10);
        btConvert = new JButton("Convert");
    }

    public MetricConvertionAssistant() {
        // Initialize components
//        lblMile = new JLabel("Mile:");
//        txtMile = new JTextField(10);
//        lblKilometer = new JLabel("Kilometer:");
//        txtKilometer = new JTextField(10);
//        lblPound = new JLabel("Pound:");
//        txtPound = new JTextField(10);
//        lblKilogram = new JLabel("Kilogram:");
//        txtKilogram = new JTextField(10);
//        lblGalon = new JLabel("Gallon:");
//        txtGallon = new JTextField(10);
//        lblLiters = new JLabel("Liters:");
//        txtLiters = new JTextField(10);
//        lblfahrenheit = new JLabel("Fahrenheit:");
//        txtFahrenheit = new JTextField(10);
//        lblCentrigrade = new JLabel("Centigrade:");
//        txtCentrigrade = new JTextField(10);
//        btConvert = new JButton("Convert");

        // Initialize panels
        leftJPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        rightJPanel = new JPanel(new GridLayout(5, 2, 10, 10));

        // Add components to panels
        leftJPanel.add(lblMile);
        leftJPanel.add(txtMile);
        rightJPanel.add(lblKilometer);
        rightJPanel.add(txtKilometer);
        leftJPanel.add(lblPound);
        leftJPanel.add(txtPound);
        rightJPanel.add(lblKilogram);
        rightJPanel.add(txtKilogram);
        leftJPanel.add(lblGalon);
        leftJPanel.add(txtGallon);
        rightJPanel.add(lblLiters);
        rightJPanel.add(txtLiters);
        leftJPanel.add(lblfahrenheit);
        leftJPanel.add(txtFahrenheit);
        rightJPanel.add(lblCentrigrade);
        rightJPanel.add(txtCentrigrade);
        rightJPanel.add(btConvert);

        // Create main panel and add left and right panels
        JPanel mainPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        mainPanel.add(leftJPanel);
        mainPanel.add(rightJPanel);

        // Set main panel as content pane
        setContentPane(mainPanel);

        // Set frame properties
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Metric Conversion Assistant");
        setSize(450, 250); // Adjusted size for better layout
        setLocationRelativeTo(null);
        setResizable(false);

        // Add action listener to the convert button
        btConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add conversion logic here
                // Example:
                if (txtMile.getText().isEmpty() && !txtKilometer.getText().isEmpty()) {
                    txtMile.setText(kilometersToMiles(txtKilometer.getText()));
                }
                if (!txtMile.getText().isEmpty() && txtKilometer.getText().isEmpty()) {
                    txtKilometer.setText(milesToKilometers(txtMile.getText()));
                }

                if (txtPound.getText().isEmpty() && !txtKilogram.getText().isEmpty()) {
                    txtPound.setText(kilogramsToPounds(txtKilogram.getText()));
                }
                if (!txtPound.getText().isEmpty() && txtKilogram.getText().isEmpty()) {
                    txtKilogram.setText(poundsToKilograms(txtPound.getText()));
                }

                if (!txtGallon.getText().isEmpty() && txtLiters.getText().isEmpty()) {
                    txtLiters.setText(gallonsToLiters(txtGallon.getText()));
                }

                if (!txtLiters.getText().isEmpty() && txtGallon.getText().isEmpty()) {
                    txtGallon.setText(litersToGallons(txtLiters.getText()));
                }

                if (!txtFahrenheit.getText().isEmpty() && txtCentrigrade.getText().isEmpty()) {
                    txtCentrigrade.setText(fahrenheitToCelsius(txtFahrenheit.getText()));
                }

                if (!txtCentrigrade.getText().isEmpty() && txtFahrenheit.getText().isEmpty()) {
                    txtFahrenheit.setText(celsiusToFahrenheit(txtCentrigrade.getText()));
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MetricConvertionAssistant();
            }
        });
    }

    public static String milesToKilometers(String miles) {
        double milesValue = parseInput(miles);
        double kilometers = milesValue * 1.60934;
        return formatDouble(kilometers);
    }

    public static String kilometersToMiles(String kilometers) {
        double kilometersValue = parseInput(kilometers);
        double miles = kilometersValue / 1.60934;
        return formatDouble(miles);
    }

    public static String poundsToKilograms(String pounds) {
        double poundsValue = parseInput(pounds);
        double kilograms = poundsValue * 0.453592;
        return formatDouble(kilograms);
    }

    public static String kilogramsToPounds(String kilograms) {
        double kilogramsValue = parseInput(kilograms);
        double pounds = kilogramsValue / 0.453592;
        return formatDouble(pounds);
    }

    public static String gallonsToLiters(String gallons) {
        double gallonsValue = parseInput(gallons);
        double liters = gallonsValue * 3.78541;
        return formatDouble(liters);
    }

    public static String litersToGallons(String liters) {
        double litersValue = parseInput(liters);
        double gallons = litersValue / 3.78541;
        return formatDouble(gallons);
    }

    public static String fahrenheitToCelsius(String fahrenheit) {
        double fahrenheitValue = parseInput(fahrenheit);
        double celsius = (fahrenheitValue - 32) * 5.0 / 9.0;
        return formatDouble(celsius);
    }

    public static String celsiusToFahrenheit(String celsius) {
        double celsiusValue = parseInput(celsius);
        double fahrenheit = (celsiusValue * 9.0 / 5.0) + 32.0;
        return formatDouble(fahrenheit);
    }

    public static String formatDouble(double value) {
        return String.format("%.2f", value);
    }

    public static double parseInput(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
