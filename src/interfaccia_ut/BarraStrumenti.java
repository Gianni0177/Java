package interfaccia_ut;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BarraStrumenti extends JPanel implements ActionListener{
    
    private JButton botonInverno;
    private JButton botonEstate;
    private TextListener textListener;

    BarraStrumenti(){
        botonInverno = new JButton("Inverno");
        botonEstate = new JButton("Estate");

        botonEstate.addActionListener(this);
        botonInverno.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(botonEstate);
        add(botonInverno);
    }

    public void setTextListener(TextListener textListener){
        this.textListener = textListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton idBoton = (JButton) e.getSource();

        if(textListener != null){
            if(idBoton == botonEstate){
                textListener.testoEmesso("1");
            }else if(idBoton == botonInverno){
                textListener.testoEmesso("2");
            }
        }
        
    }

    
}
