
package GUI;


import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class Spielfeld extends JFrame {

    private Werte werte = new Werte();   
    private Schachbrett schachbrett;


    public Spielfeld() {
        SetUpSpielfeld();
        SetUpSchachbrett();                  
        this.setVisible(true);          
        
    }
    
    private void SetUpSpielfeld(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                    // fügt ExitButten hinzu
        this.setTitle("Paranoid");                                              // setzt name 
        this.setSize(werte.GetHauptFGroesse(), werte.GetHauptFGroesse()); 
        this.setLocationRelativeTo(null);                                       // setzt größe
        

        Container darstellungsFlaeche = this.getContentPane();                  // holt Container
        darstellungsFlaeche.setLayout(new BorderLayout());                      // setze Borderlayout
    }
    
    private void SetUpSchachbrett(){
        schachbrett = new Schachbrett();                                        // erzeugt ein schachbrett
        this.add(schachbrett);                                                  // fügt das schachbrett dem containder hinzu
    }  
}
