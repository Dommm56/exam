package cs.csf.dfc.poo.e2019.ressourceshumaines.classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EntrepriseTest {

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
	
		leDepartement.PresenterListeEmploye();
		
		Departement leDepartement2 = new Departement(2,"Services");
		leDepartement2.AjouterEmploye(sam);
		Departement leDepartement3 = new Departement(3,"Prod");
		leDepartement3.AjouterEmploye(ben);
		
		Succursale laSuccursale = new Succursale(1,"Ste-Foy");
		laSuccursale.AjouterDepartement(leDepartement);
		laSuccursale.AjouterDepartement(leDepartement2);
		
		
		laSuccursale.PresenterListeDepartements(laSuccursale);//marche les 3 departements ont le meme nom
		
		Succursale laSuccursale2 = new Succursale(2,"St-Roch");
		laSuccursale2.AjouterDepartement(leDepartement3);
		laSuccursale2.PresenterListeDepartements(laSuccursale2);//marche les 3 departements ont le meme nom
		
		Entreprise lEntreprise = new Entreprise(1,"TechnoDom");
		lEntreprise.AjouterSuccursale(laSuccursale);
		lEntreprise.AjouterSuccursale(laSuccursale2);


		assertEquals(masseDouble, Entreprise.PresenterMasseSalarialeEntreprise(lEntreprise));
	}

}
