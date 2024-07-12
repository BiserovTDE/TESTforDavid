package htle.biserov07022024;



public abstract class Auto extends Fahrzeug {
    private int ps;
    private int tuere;
    private int maxreichweite;
    protected  boolean motorGestartet;
  

    public Auto(String marke, int baujahr, int ps, int tuere, int maxreichweite) {
        super(marke, baujahr);
        this.ps = ps;
        this.tuere = tuere;
        this.maxreichweite = maxreichweite;
        this.motorGestartet = false;
        
    }

    
    public abstract void starten();

    
    public abstract void ausschalten();
    
    public abstract void anhalten();
    
  
    public int getPs() {
        return ps;
    }

    public int getTuere() {
        return tuere;
    }
    
    
public int getMaxreichweite() {
		return maxreichweite;
}


	@Override
	public String toString() {
		return "Auto ps=" + ps + ","+" Maximale Reichweite des Fahrzeuges "+maxreichweite+" km "+", tuere=" + tuere + "";
	}
    
    
}
