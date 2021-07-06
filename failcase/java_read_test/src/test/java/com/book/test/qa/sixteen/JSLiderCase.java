package test.java.com.book.test.qa.sixteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSLiderCase extends JFrame {
    private JLabel labelHoehe;
    private JLabel labelBreite;
    private JLabel labelTiefe;
    private JLabel labelErgebnis;
    private JTextField textHoehe;
    private JTextField textBreite;
    private JTextField textTiefe;
    private JTextField textErgebnise;
    private JButton schaltflaecheBerechnen;
    private JButton schaltflaecheLeeren;
    private JSlider schiebereglerHoehe;
    private JSlider schiebereglerBreite;
    private JSlider schiebereglerTiefe;
    NurZahlenVerifier nurZahlenVerifier = new NurZahlenVerifier();


    public JSLiderCase() {
        super("Schuhkarton Volumenberechner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350,200);
        this.initialisiereKomponenten();
        this.ordenKomponentenAn();
        this.setVisible(true);
        this.registriereListener();
        this.registriereValidatoren();
    }

    private void initialisiereKomponenten() {
        this.labelHoehe = new JLabel("Honhe");
        this.labelBreite = new JLabel("Breite");
        this.labelTiefe = new JLabel("Tiefe");
        this.labelErgebnis = new JLabel("Ergebnis");
        this.textHoehe = new JTextField("Honhe");
        this.textBreite = new JTextField("Breite");
        this.textTiefe = new JTextField("Tiefe");
        this.textErgebnise = new JTextField("Ergebnis");
        this.schaltflaecheBerechnen = new JButton("Berechnen");
        this.schaltflaecheLeeren = new JButton("Leeren");
    }

    private void ordenKomponentenAn() {
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4,4,4,4);
        c.gridx = 0;
        c.gridy = 0;
        this.getContentPane().add(this.labelHoehe, c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.getContentPane().add(this.textHoehe, c);
        c.gridx = 3;
        c.gridwidth = 1;
        this.getContentPane().add(new JLabel("cm"), c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        this.getContentPane().add(this.labelBreite, c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.getContentPane().add(this.textBreite, c);
        c.gridx = 3;
        c.gridwidth = 1;
        this.getContentPane().add(new JLabel("cm"), c);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        this.getContentPane().add(this.labelTiefe, c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.getContentPane().add(this.textTiefe, c);
        c.gridx = 3;
        c.gridwidth = 1;
        this.getContentPane().add(new JLabel("cm"), c);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        this.getContentPane().add(this.labelErgebnis, c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.getContentPane().add(this.textErgebnise, c);
        c.gridx = 3;
        c.gridwidth = 1;
        this.getContentPane().add(new JLabel("cm³"), c);
        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        this.getContentPane().add(this.schaltflaecheBerechnen, c);
        c.gridx = 2;
        this.getContentPane().add(this.schaltflaecheLeeren, c);

    }

    // 添加事件监听器
    private void registriereListener() {
        this.schaltflaecheBerechnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer hoehe = Integer.parseInt(textHoehe.getText());
                Integer breite = Integer.parseInt(textBreite.getText());
                Integer tiefe = Integer.parseInt(textTiefe.getText());
                Integer ergebnis = hoehe * breite * tiefe;
                textErgebnise.setText(ergebnis.toString());
            }
        });
    }

    public static void main(String[] args) {
        new PracticeCase();

    }

    private static class NurZahlenVerifier extends InputVerifier {
        @Override
        public boolean verify(JComponent input) {
            String text = ((JTextField) input).getText();
            try {
                Integer.parseInt(text);
                return true;
            }catch (NumberFormatException e) {
                return false;
            }
        }

    }

    private void registriereValidatoren() {
        this.textHoehe.setInputVerifier(this.nurZahlenVerifier);
        this.textBreite.setInputVerifier(this.nurZahlenVerifier);
        this.textTiefe.setInputVerifier(this.nurZahlenVerifier);
    }
}
