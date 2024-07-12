package htle.biserov07022024;

public class Verbrennerfahrzeug extends Auto {
    private String kraftstofftyp;
    private int tankfuellung;

    public Verbrennerfahrzeug(String marke, int baujahr, int ps, int tuere, int hubraum, int tankfuellung, int maxreichweite, String kraftstofftyp) {
        super(marke, baujahr, ps, tuere, maxreichweite);
        this.kraftstofftyp = kraftstofftyp;
        this.tankfuellung = tankfuellung;
    }

    
    public String getKraftstofftyp() {
        return kraftstofftyp;
    }

    public int getTankfuellung() {
        return tankfuellung;
    }
    
    @Override
    public void starten() {
        if (!motorGestartet) {
            System.out.println("Der Verbrennungsmotor wurde gestartet.");
            motorGestartet = true;
        } else {
            System.out.println("Der Verbrennungsmotor ist bereits gestartet.");
        }
        
    }
    
    @Override
    public void ausschalten() {
        if (motorGestartet) {
            System.out.println("Der Verbrennungsmotor wurde ausgeschaltet.");
            motorGestartet = false;
            geschwindigkeit = 0;
        } else {
            System.out.println("Der Verbrennungsmotor ist bereits ausgeschaltet.");
        }
        
    }
    @Override
    public void anhalten() {
        System.out.println("Das Auto mit Verbrennungsmotor wurde angehalten.");
        geschwindigkeit = 0; 
    }


	@Override
	public String toString() {
		return "Verbrennerfahrzeug: " +getMarke()+","+" Baujahr: "+ getBaujahr() +","+" PS: "+ getPs()+","+" Türe: "+getTuere()+","+" Kraftstofftyp: "+getKraftstofftyp()+","+" Tankfüllung: "+getTankfuellung()+","+" Maximale Reichweite des Fahrzeuges: " +getMaxreichweite()+"km";
		}
    
    
}

