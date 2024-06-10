package assignments.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;

public class Manipulator extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel myPanel;
    private JTextField textField1;
    private JTextField textField2;


    public Manipulator() {
        // Create the frame
        JFrame frame = new JFrame("String Utility");

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setResizable(false); // Disable resizing

        // Create panel to hold components
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(2, 2, 2, 2);

        // Create labels and text fields
        JLabel inputLabel = new JLabel("Input");
        JTextField inputField = new JTextField(15);
        JLabel outputLabel = new JLabel("Output");
        JTextField outputField = new JTextField(15);

        // Create buttons
        JButton countLettersButton = new JButton("Count Letters");
        JButton reverseLettersButton = new JButton("Reverse Letters");
        JButton removeDuplicatesButton = new JButton("Remove Duplicates");

        // Add buttons to panel
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.WEST;
        panel.add(countLettersButton, c);

        c.gridy = 1;
        panel.add(reverseLettersButton, c);

        c.gridy = 2;
        panel.add(removeDuplicatesButton, c);

        // Add labels and text fields to panel
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.WEST;
        panel.add(inputLabel, c);

        c.gridy = 1;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.WEST;
        panel.add(inputField, c);

        c.gridy = 2;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.WEST;
        panel.add(outputLabel, c);

        c.gridy = 3;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.WEST;
        panel.add(outputField, c);

        // Add action listeners for buttons
        countLettersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                outputField.setText(String.valueOf(input.length()));
            }
        });

        reverseLettersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String reversed = new StringBuilder(input).reverse().toString();
                outputField.setText(reversed);
            }
        });

        removeDuplicatesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                StringBuilder noDuplicates = new StringBuilder();
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for (char c : input.toCharArray()) {
                    if (set.add(c)) {
                        noDuplicates.append(c);
                    }
                }
                outputField.setText(noDuplicates.toString());
            }
        });

        // Add panel to frame
        frame.getContentPane().add(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        /*
        While it is not mandatory to use EventQueue.invokeLater,
        it is a best practice for all Swing applications to ensure
        thread safety and avoid potential concurrency issues.
         */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Manipulator mf = new Manipulator();
            }
        });
    }
}
