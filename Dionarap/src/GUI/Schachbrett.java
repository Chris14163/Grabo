
package GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JPanel;


public class Schachbrett extends JPanel {

    Werte werte = new Werte();

    Label[][] feld = new Label[werte.GetFelderZahl()][werte.GetFelderZahl()];                                     // erstellt ein 2D array von label

    public Schachbrett() {
        this.setLayout(new GridLayout(werte.GetFelderZahl(), werte.GetFelderZahl()));                             // setzt gridlayut als layout

        FarbVerteilung(werte.GetFeldfarbe1(), werte.GetFeldfarbe2());

        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                feld[i][j].setAlignment(Label.CENTER);
            }
        }
    }

    public void FarbVerteilung(Color a, Color b) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                feld[i][j] = new Label();
                feld[i][j].setName("Feld_" + i + "." + j);                       // benennt die labels
                if ((i + j) % 2 == 0) {
                    feld[i][j].setBackground(a);
                } else {
                    feld[i][j].setBackground(b);
                }
                feld[i][j].setSize(werte.GetFeldGroesse(), werte.GetFeldGroesse());
                this.add(feld[i][j]);
                feld[i][j].setForeground(GetInverseFarbe(feld[i][j].getBackground()));
                //AufFeldSchreiben(i, j, i + "/" + j);              
            }
        }
    }
   

    private Color GetInverseFarbe(Color in) {
        return new Color(255 - in.getRed(), 255 - in.getGreen(), 255 - in.getBlue(), in.getAlpha());

    }
}
