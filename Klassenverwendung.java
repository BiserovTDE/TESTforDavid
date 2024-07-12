package htle.biserov07022024;

public class Klassenverwendung {

	public static void main(String[] args) {
		
		Fahrzeug verbrenner = new Verbrennerfahrzeug(null, 0, 0, 0, 0, 0, 0, null);
		Fahrzeug elektro = new Elektrofahrzeug(null, 0, 0, 0, 0, 0, 0);
		Fahrzeug fahrrad = new Fahrrad(null, 0, 0, null, null, 0);
		
		
		System.out.println("Verbrenner :");
		verbrenner.starten();
		verbrenner.beschleunigen();
		verbrenner.bremsen();
		verbrenner.anhalten();
		verbrenner.ausschalten();
		System.out.println();


		System.out.println("Elektrofahrzeug: ");
		elektro.starten();
		elektro.beschleunigen();
		elektro.bremsen();
		elektro.anhalten();
		elektro.ausschalten();
		System.out.println();
		
		
		System.out.println("Fahhrad: ");
		fahrrad.starten();
		fahrrad.beschleunigenfahrrad();
		fahrrad.bremsenfahrrad();
		fahrrad.anhalten();
		fahrrad.ausschalten();
		System.out.println();
		
		
		
		 Fahrzeug[] fahrzeuge = new Fahrzeug[9];
	        fahrzeuge[0] = new Verbrennerfahrzeug("BMW", 2018, 200, 4, 2000, 60, 400,"Benzin");
	        fahrzeuge[1] = new Verbrennerfahrzeug("Audi", 2020, 250, 4, 2500, 70,650,"Diesel");
	        fahrzeuge[2] = new Verbrennerfahrzeug("Mercedes", 2020, 250, 4, 2500, 70,250,"Diesel");
	        System.out.println("");
	        fahrzeuge[3] = new Elektrofahrzeug("Tesla", 2022, 300, 4, 100, 250,900);
	        fahrzeuge[4] = new Elektrofahrzeug("Nissan", 2019, 150, 4, 80, 200,600);
	        fahrzeuge[5] = new Elektrofahrzeug("Polestar", 2019, 150, 4, 80, 200,990);
	        System.out.println("");
	        fahrzeuge[6] = new Fahrrad("Giant", 2023, 21, "Mountainbike", "Mountain Reifen", 21);
	        fahrzeuge[7] = new Fahrrad("Trek", 2024, 18, "Rennrad","Street Reifen", 18);
	        fahrzeuge[8] = new Fahrrad("Street", 2024, 18, "Rennrad","Street Reifen", 18);

	        Person person = new Person("Biser Biserov", fahrzeuge);

	        System.out.print(person);
	        
	        
	        
	        }

}
