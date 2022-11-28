package src.ilhamakbar.guiform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CardFom {
    private JTextField textField4;
    private JButton simpanButton;
    private JButton browseButton;
    private JLabel img;
    private JTextArea textArea1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField TextFIeld1;
    private JPanel card;

    public String ImageName;

    public void insertingDataToFile(String inputtedData) throws IOException {
        try {
            FileWriter myFile = new FileWriter("fileData.txt", true);
            myFile.write(inputtedData);
            myFile.close();
            System.out.println("Succesfully wrote to the file");
        } catch (IOException ex) {
            System.out.println("An error occured");
            ex.printStackTrace();
        }
    }

    public CardFom() {
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String NC = TextFIeld1.getText();
                String ATM = (String) comboBox1.getSelectedItem();
                String BANK = (String) comboBox2.getSelectedItem();
                String NM = textField4.getText();

                Card card = new Card();
                card.setNC(NC);
                card.setATM(ATM);
                card.setBANK(BANK);
                card.setNM(NM);

                String result = "Saved!" + "\nCard Number : " + NC + "\nATM types : " + ATM + "\nBank : " + BANK +
                        "\nUsername : " + NM + "\nFile Image : " + ImageName;

                textArea1.append(result);

                try {
                    insertingDataToFile(result + "\n\n");
                    ImageName = null;
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser SearchImage = new JFileChooser();

                int showOpenDialogue = SearchImage.showOpenDialog(null);

                if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    File PickImage = SearchImage.getSelectedFile();
                    String PickImagePath = PickImage.getAbsolutePath();

                    ImageName = SearchImage.getSelectedFile().getName();

                    ImageIcon ii = new ImageIcon(PickImagePath);
                    Image image = ii.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);

                    img.setIcon(new ImageIcon(image));
                }

            }
        });
    }

    public JPanel getCard() {
        return card;
    }
}
