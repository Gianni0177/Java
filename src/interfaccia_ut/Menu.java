package interfaccia_ut;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{

    private TextAreaPanel textAreaPanel;
    private BarraStrumenti barraStrumenti;
    private PannelloForm pannelloForm;

    public Menu(){

        super("Menù PUB");
        
        setLayout(new BorderLayout());  //inizializza il layout manager

        barraStrumenti = new BarraStrumenti();
        textAreaPanel = new TextAreaPanel(); //area di testo (tutto lo spazio libero)
        pannelloForm = new PannelloForm();

        barraStrumenti.setTextListener(new TextListener() {

            @Override
            public void testoEmesso(String testo) {
                textAreaPanel.appendiTesto(testo);
            }
            
        });

        //aggiunta degli "oggetti"
        add(textAreaPanel,BorderLayout.CENTER);
        add(barraStrumenti,BorderLayout.PAGE_START);
        add(pannelloForm,BorderLayout.LINE_START);

        setSize(800,600);   //dimensione della finestra in pixel
        //frame.setLocation(550,200);   //imposta le coordinate dove verrà collocata la finestra 
        setLocationRelativeTo(null);    //la finestra viene collocata al centro della pagina
        setResizable(false);    //blocca le dimensioni della finestra
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //chiude il processo alla chiusura della finestra
        setVisible(true);   //rende la finestra visibile
    }
}
