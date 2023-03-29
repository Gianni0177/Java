package interfaccia_ut;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PannelloForm extends JPanel{

    private JLabel labelMarca;
    private JLabel labelModello;

    private JTextField fieldMarca;
    private JTextField fieldModello;

    private JButton bottoneAggiungi;

    PannelloForm(){
        setPreferredSize(new Dimension(300,100));
        setLayout(new GridBagLayout());

        //bordi
        Border bordoInterno = BorderFactory.createTitledBorder("Titolo bordo");
        Border bordoEsterno = BorderFactory.createEmptyBorder(0,5,5,5);
        Border bordoFinale = BorderFactory.createCompoundBorder(bordoEsterno,bordoInterno);

        setBorder(bordoFinale);

        //componenti
        labelMarca = new JLabel("Marca: ");
        fieldMarca = new JTextField(15);

        labelModello = new JLabel("Modello: ");
        fieldModello = new JTextField(15);

        bottoneAggiungi = new JButton("Aggiungi");

        //layout
        GridBagConstraints gbc = new GridBagConstraints();

        //label marca
        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.weightx = 0.0;
        gbc.weighty = 0.0;

        add(labelMarca,gbc);

        //field marca
        gbc.gridx = 1;
        gbc.gridy = 0;

        gbc.weightx = 0.0;
        gbc.weighty = 0.0;

        add(fieldMarca,gbc);

        //label modello
        gbc.gridx = 0;
        gbc.gridy = 1;

        gbc.weightx = 0.0;
        gbc.weighty = 0.0;

        add(labelModello,gbc);

        //field modello
        gbc.gridx = 1;
        gbc.gridy = 1;

        gbc.weightx = 0.0;
        gbc.weighty = 0.0;

        add(fieldModello,gbc);

        //bottone
        gbc.gridx = 0;
        gbc.gridy = 2;

        gbc.weightx = 0.0;
        gbc.weighty = 0.0;

        add(bottoneAggiungi,gbc);

    }
}
