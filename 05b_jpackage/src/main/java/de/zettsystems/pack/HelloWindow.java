package de.zettsystems.pack;

import javax.swing.JFrame;

public class HelloWindow extends JFrame {

    public static void main(String[] args) {
        // Fenster erstellen
        HelloWindow window = new HelloWindow();
        window.setTitle("Hello from jpackage!");
        window.setSize(300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
