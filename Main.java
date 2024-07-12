package htle.biserov07022024;

public class Main {
    public static void main(String[] args) {
       
        Fahrzeug[] fahrzeuge = new Fahrzeug[6];
        fahrzeuge[0] = new Verbrennerfahrzeug("BMW", 2018, 200, 4, 2000, 60, 400,"Benzin");
        fahrzeuge[1] = new Verbrennerfahrzeug("Audi", 2020, 250, 4, 2500, 70,650,"Diesel");
        fahrzeuge[2] = new Elektrofahrzeug("Tesla", 2022, 300, 4, 100, 250,900);
        fahrzeuge[3] = new Elektrofahrzeug("Nissan", 2019, 150, 4, 80, 200,600);
        fahrzeuge[4] = new Fahrrad("Giant", 2023, 21, "Mountainbike", "Mountain Reifen", 21);
        fahrzeuge[5] = new Fahrrad("Trek", 2024, 18, "Rennrad","Street Reifen", 18);

        Person person = new Person("Biser Biserov", fahrzeuge);

        System.out.print(person);
    }
}
