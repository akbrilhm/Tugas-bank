package src.ilhamakbar.guiform;

import javax.swing.*;

public class RunCard {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Data");
        jFrame.setContentPane(new CardFom().getCard());
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600,300);
        jFrame.setVisible(true);
    }
}
