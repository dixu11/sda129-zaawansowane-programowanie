package gpt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiRaty {

    private JTextField cenaTextField;
    private JTextField liczbaRatTextField;
    private JLabel wynikLabel;

    public GuiRaty() {
        JFrame frame = new JFrame("Ratalna sprzedaż AGD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 10, 10, 10);

        JLabel cenaLabel = new JLabel("Cena towaru (od 100 zł do 10 tys. zł):");
        cenaTextField = new JTextField();
        cenaTextField.setColumns(10);
        c.gridx = 0;
        c.gridy = 0;
        panel.add(cenaLabel, c);
        c.gridx = 1;
        panel.add(cenaTextField, c);

        JLabel liczbaRatLabel = new JLabel("Liczba rat (od 6 do 48):");
        liczbaRatTextField = new JTextField();
        liczbaRatTextField.setColumns(10);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(liczbaRatLabel, c);
        c.gridx = 1;
        panel.add(liczbaRatTextField, c);

        JButton obliczButton = new JButton("Oblicz");
        obliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obliczMiesiecznaRate();
            }
        });
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER;
        panel.add(obliczButton, c);

        wynikLabel = new JLabel();
        c.gridx = 0;
        c.gridy = 3;
        panel.add(wynikLabel, c);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void obliczMiesiecznaRate() {
        String cenaString = cenaTextField.getText();
        String liczbaRatString = liczbaRatTextField.getText();

        try {
            double cena = Double.parseDouble(cenaString);
            int liczbaRat = Integer.parseInt(liczbaRatString);

            if (cena < 100 || cena > 10000) {
                JOptionPane.showMessageDialog(null, "Błędna cena towaru!", "Błąd", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (liczbaRat < 6 || liczbaRat > 48) {
                JOptionPane.showMessageDialog(null, "Błędna liczba rat!", "Błąd", JOptionPane.ERROR_MESSAGE);
                return;
            }

            SklepAGD sklep = new SklepAGD();
            double rata = sklep.obliczMiesiecznaRate(cena, liczbaRat);
            wynikLabel.setText("Miesięczna rata wynosi: " + String.format("%.2f zł", rata));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Błędne dane wejściowe!", "Błąd", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiRaty();
            }
        });
    }
}
