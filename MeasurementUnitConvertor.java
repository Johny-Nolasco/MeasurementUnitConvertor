import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeasurementUnitConvertor extends JFrame {
    
    public MeasurementUnitConvertor(String title) {
        JFrame converterWindow = new JFrame(title);
        converterWindow.setSize(600, 400);
        converterWindow.setMinimumSize(new Dimension(600, 100));

        converterWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text Field where values to be converted will be inputted
        JTextField poundsInputField = new JTextField();
        JTextField kilosInputField = new JTextField();

        // Buttons to be used
        JButton enterButton = new JButton("Enter");
        JButton clearButton = new JButton("Clear");

        // Aesthetic of buttons
        Font buttonsFont = new Font("Arial", 1, 20);
        enterButton.setFont(buttonsFont);
        clearButton.setFont(buttonsFont);
        enterButton.setForeground(new Color(0, 100, 0)); // Dark green color
        clearButton.setForeground(new Color(139, 0, 0)); // Dark red color
    }
}