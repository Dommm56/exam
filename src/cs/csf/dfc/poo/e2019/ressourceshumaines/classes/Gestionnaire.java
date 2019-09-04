package cs.csf.dfc.poo.e2019.ressourceshumaines.classes;

import java.util.List;

public class Gestionnaire extends Employe {
	private List<Employe> m_ListeEmployes;
	//constructeur
		public Gestionnaire(Integer p_id, String p_nom, Double p_salaire) {
			this.m_idEmploye=p_id;
			this.m_nomEmploye=p_nom;
			this.m_salaireEmploye=p_salaire;
		}

		@Override
		protected void PresenterDonnees() {
			// TODO Auto-generated method stub
			
		}
	

}
