import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstclass {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("My First Java GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);
        frame.setLayout(new BorderLayout(10, 10));

        // Create a label
        JLabel label = new JLabel("Hello, welcome to your first Java GUI!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(label, BorderLayout.NORTH);

        // Create a panel for form inputs
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 8, 8));
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        JLabel messageLabel = new JLabel("Message:");
        JTextField messageField = new JTextField();

        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(messageLabel);
        formPanel.add(messageField);

        frame.add(formPanel, BorderLayout.CENTER);

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");
        buttonPanel.add(submitButton);
        buttonPanel.add(clearButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String email = emailField.getText().trim();
                String message = messageField.getText().trim();
                JOptionPane.showMessageDialog(frame,
                        "Submitted!\nName: " + name + "\nEmail: " + email + "\nMessage: " + message,
                        "Submission",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                emailField.setText("");
                messageField.setText("");
            }
        });

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Show the frame
        frame.setVisible(true);
    }
}