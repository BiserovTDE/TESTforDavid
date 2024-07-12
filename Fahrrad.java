package htle.biserov07022024;

public class Fahrrad extends Fahrzeug {
    private int gaenge;
    private String biketyp;
    private String radtyp;
    private int zoll;

    public Fahrrad(String marke, int baujahr, int gaenge, String biketyp, String radtyp, int zoll) {
        super(marke, baujahr);
        this.gaenge = gaenge;
        this.biketyp = biketyp;
        this.radtyp = radtyp;
        this.zoll = zoll;
        
    }
    @Override
    public void starten() {
        System.out.println("Das Fahrrad rollt.");
    }

    @Override
    public void ausschalten() {
        System.out.println("Das Fahrrad rollt nicht mehr.");
    }
    
    @Override
    public void anhalten() {
        System.out.println("Das Fahrrad wurde angehalten.");
        geschwindigkeit = 0; 
    }
    
    @Override
    public String toString() {
        return "Fahrrad - Marke: " + getMarke() + ", Baujahr: " + getBaujahr() + ", Gänge: " + gaenge + ", Biketyp: " + biketyp+ " Radtyp: " +radtyp+" Größe in Zoll: "+zoll ;
    }
    
    
}

	

