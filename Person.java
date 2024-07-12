package htle.biserov07022024;

public class Person {
    private String name;
    private Fahrzeug[] fahrzeuge;

    public Person(String name, Fahrzeug[] fahrzeuge) {
        this.name = name;
        this.fahrzeuge = fahrzeuge;
    }

    @Override
    public String toString() {
        String anzeigen = "Person: " + name + "\nFahrzeuge:\n";
       
        for (Fahrzeug fahrzeug : fahrzeuge) {
            anzeigen += fahrzeug.toString() + "\n";
            
        }
        return anzeigen;
    }
    
    
}