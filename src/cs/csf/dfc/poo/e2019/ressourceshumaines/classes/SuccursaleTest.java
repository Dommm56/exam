package cs.csf.dfc.poo.e2019.ressourceshumaines.classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuccursaleTest {

	@Test
	void test() {
		Double masseDouble = 25000.0+(3*35000.0);
		Employe dom = new Gestionnaire(1,"dom",25000.0);
		Employe van = new Gestionnaire(2,"van",35000.0);
		Employe sam = new Gestionnaire(2,"sam",35000.0);
		Employe ben = new Gestionnaire(2,"ben",35000.0);
		Departement leDepartement = new Departement(1,"Ventes");
		leDepartement.AjouterEmploye(dom);
		leDepartement.AjouterEmploye(van);

		Departement leDepartement2 = new Departement(2,"Services");
		leDepartement2.AjouterEmploye(sam);
		Departement leDepartement3 = new Departement(3,"Prod");
		leDepartement3.AjouterEmploye(ben);
		
		Succursale laSuccursale = new Succursale(1,"Ste-Foy");
		laSuccursale.AjouterDepartement(leDepartement);
		laSuccursale.AjouterDepartement(leDepartement2);
		laSuccursale.AjouterDepartement(leDepartement3);
		
		
		assertEquals(masseDouble, Succursale.PresenterMasseSalarialeSuccursale(laSuccursale));
	}

}
