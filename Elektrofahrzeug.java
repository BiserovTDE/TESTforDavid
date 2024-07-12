package htle.biserov07022024;

public class Elektrofahrzeug extends Auto {
    private int batteriekapazitaet;
    private int ladezeit;

    public Elektrofahrzeug(String marke, int baujahr, int ps, int tuere, int batteriekapazitaet, int ladezeit, int maxreichweite) {
        super(marke, baujahr, ps, tuere,maxreichweite);
        this.batteriekapazitaet = batteriekapazitaet;
        this.ladezeit = ladezeit;
    }


    public int getBatteriekapazitaet() {
        return batteriekapazitaet;
    }

    public int getLadezeit() {
        return ladezeit;
    }
    
    @Override
    public void starten() {
        if (!motorGestartet) {
            System.out.println("Das Elektrofahrzeug wurde gestartet.");
            motorGestartet = true;
        } else {
            System.out.println("Das Elektrofahrzeug ist bereits gestartet.");
        }
        
    }
    
    @Override
    public void ausschalten() {
        if (motorGestartet) {
            System.out.println("Das Elektrofahrzeug wurde ausgeschaltet.");
            motorGestartet = false;
            geschwindigkeit = 0; 
        } else {
            System.out.println("Das Elektrofahrzeug ist bereits ausgeschaltet.");
        }
    }
    
    @Override
    public void anhalten() {
        System.out.println("Das Elektrofahrzeug wurde angehalten.");
        geschwindigkeit = 0; 
    }
    
    @Override
	public String toString() {
		return "Elektrofahrzeug: " +getMarke()+","+" Baujahr: "+ getBaujahr() +","+" PS: "+ getPs()+","+" Türe: "+getTuere()+","+" Batteriekapazität: "+getBatteriekapazitaet()+","+" Ladezeit: "+getLadezeit()+","+" Maximale Reichweite des Fahrzeuges: " +getMaxreichweite()+"km";
		}
   
}
