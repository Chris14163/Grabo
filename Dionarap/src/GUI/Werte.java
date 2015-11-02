package GUI;




import java.awt.Color;

public class Werte {

    
    private final int groesseNavigationsFenster = 200;
    private final int groesseHautfenster = 500;
    private final int feldGroesse = 50;
    private final int felderZahl = 10;
    private final int rahmenBreite = 3;
    
    private final Color rahmenFarbe = Color.RED;
    private final Color feldFarbe1 = Color.BLACK;
    private final Color feldFarbe2 = Color.WHITE;
    private final Color eckfelderFarbe = Color.RED;
    
    public final Color GetEckfelderFarbe(){
        return eckfelderFarbe;
    }
    public final Color GetRahmenFarbe(){
        return rahmenFarbe;
    }
    
    public final Color GetFeldfarbe1(){
        return feldFarbe1;
    }
    
    public final Color GetFeldfarbe2(){
        return feldFarbe2;
    }
    
    public final int GetRahmenBreite(){
        return rahmenBreite;
    }

    public final int GetNavFGroesse() {
        return groesseNavigationsFenster;
    }

    public final int GetHauptFGroesse() {
        return groesseHautfenster;
    }

    public final int GetFeldGroesse() {
        return feldGroesse;
    }
    
    public final int GetFelderZahl(){
        return felderZahl;
    }
}
