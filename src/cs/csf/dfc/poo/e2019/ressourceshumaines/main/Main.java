package cs.csf.dfc.poo.e2019.ressourceshumaines.main;
import cs.csf.dfc.poo.e2019.ressourceshumaines.classes.*;

public class Main {

	public static void main(String[] args) {
		Employe dom = new Gestionnaire(1,"dom",25000.0);
		Employe van = new Gestionnaire(2,"van",35000.0);
		Employe sam = new Gestionnaire(2,"sam",35000.0);
		Employe ben = new Gestionnaire(2,"ben",35000.0);
		Departement leDepartement = new Departement(1,"Ventes");
		leDepartement.AjouterEmploye(dom);
		leDepartement.AjouterEmploye(van);
	
		leDepartement.PresenterListeEmploye();
		System.out.println(Departement.PresenterMasseSalarialeDuDepartement(leDepartement));
		
		Departement leDepartement2 = new Departement(2,"Services");
		leDepartement2.AjouterEmploye(sam);
		Departement leDepartement3 = new Departement(3,"Prod");
		leDepartement3.AjouterEmploye(ben);
		
		Succursale laSuccursale = new Succursale(1,"Ste-Foy");
		laSuccursale.AjouterDepartement(leDepartement);
		laSuccursale.AjouterDepartement(leDepartement2);
		
		
		laSuccursale.PresenterListeDepartements(laSuccursale);//marche les 3 departements ont le meme nom
		System.out.println(Succursale.PresenterMasseSalarialeSuccursale(laSuccursale));
		
		Succursale laSuccursale2 = new Succursale(2,"St-Roch");
		laSuccursale2.AjouterDepartement(leDepartement3);
		laSuccursale2.PresenterListeDepartements(laSuccursale2);//marche les 3 departements ont le meme nom
		System.out.println(Succursale.PresenterMasseSalarialeSuccursale(laSuccursale2));
		
		Entreprise lEntreprise = new Entreprise(1,"TechnoDom");
		lEntreprise.AjouterSuccursale(laSuccursale);
		System.out.println("Cash entreprise: "+Entreprise.PresenterMasseSalarialeEntreprise(lEntreprise));
		lEntreprise.AjouterSuccursale(laSuccursale2);
		lEntreprise.PresenterListeSuccursale(lEntreprise);
		System.out.println("Cash entreprise: "+Entreprise.PresenterMasseSalarialeEntreprise(lEntreprise));

		
	}//fin main

}//fin Main
