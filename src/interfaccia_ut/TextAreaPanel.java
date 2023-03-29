package interfaccia_ut;

import java.awt.BorderLayout;

import javax.swing.*;

public class TextAreaPanel extends JPanel{
    
    private JTextArea textArea;

    public TextAreaPanel(){ //dichiaro una textArea nel centro pagina

        textArea = new JTextArea();

        setLayout(new BorderLayout());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
 
    
    }

    public void appendiTesto(String testo){
        textArea.append(testo);
    }
}