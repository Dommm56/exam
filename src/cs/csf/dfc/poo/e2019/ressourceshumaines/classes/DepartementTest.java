package cs.csf.dfc.poo.e2019.ressourceshumaines.classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepartementTest {

	@Test

		void test_CALCULERMASSE_SALARIALE2() {
			Employe dom = new Gestionnaire(1,"dom",25000.0);
			Employe van = new Gestionnaire(2,"van",35000.0);
			Double tOTALVOULUDouble = 60000.0;
			
			Departement leDepartement = new Departement(1,"Ventes");
			leDepartement.AjouterEmploye(dom);
			leDepartement.AjouterEmploye(van);
		
			assertEquals(tOTALVOULUDouble, Departement.PresenterMasseSalarialeDuDepartement(leDepartement));
			
		
	}

}
