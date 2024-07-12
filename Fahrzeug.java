package htle.biserov07022024;

public  abstract class Fahrzeug {
	
    private String marke;
    private int baujahr;
    protected int geschwindigkeit = 120;
    protected int geschwindigkeitf = 20;
   

    public Fahrzeug(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
        this.geschwindigkeit = 120;
        this.geschwindigkeitf = 20;

    }
    
    public void beschleunigen() {
        ++geschwindigkeit;
        System.out.println("Beschleunigt auf "+ geschwindigkeit);
    }
    
  
    public void beschleunigenfahrrad() {
        ++geschwindigkeitf;
        System.out.println("Beschleunigt auf "+ geschwindigkeitf);
    }
    
  
    public void bremsen() {
        if (geschwindigkeit > 0) {
            geschwindigkeit--;
        }
        System.out.println("Abgebremst auf "+geschwindigkeit);
    }
    
    
    public void bremsenfahrrad() {
        if (geschwindigkeitf > 0) {
            geschwindigkeitf--;
        }
        System.out.println("Abgebremst auf "+geschwindigkeitf);
    }
    
    
    public abstract void starten();
    public abstract void ausschalten();
    public abstract void anhalten();

    
    public int getGeschwindigkeit() {
    	return geschwindigkeit;
    }
  
    public String getMarke() {
        return marke;
    }

    public int getBaujahr() {
        return baujahr;
    }
    
  
}

