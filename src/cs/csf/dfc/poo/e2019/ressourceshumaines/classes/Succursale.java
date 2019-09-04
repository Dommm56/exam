package cs.csf.dfc.poo.e2019.ressourceshumaines.classes;

import java.util.ArrayList;
import java.util.List;

public class Succursale {
	//donnes membres
		private Integer m_idSuccursale;
		private String m_nomSuccursale;
		private List<Departement> m_listDepartments;
		
		public String getM_nomSuccursale() {
			return m_nomSuccursale;
		}
		//Constructeur
		public Succursale(int p_id, String p_nom) {
			this.m_idSuccursale=p_id;
			this.m_nomSuccursale=p_nom;
			this.m_listDepartments = new ArrayList<Departement>();
				
		}	//fin constructeur
		
		//methodes
		public void AjouterDepartement(Departement unDepartement) {
			
			this.m_listDepartments.add(unDepartement);
		}
		
		public void SupprimerDepartement(Departement unDepartement) {
			this.m_listDepartments.remove(unDepartement);
		}
		
		
		public void PresenterListeDepartements(Succursale unSuccursale) {
			for (Departement dep : unSuccursale.m_listDepartments) {
				System.out.println(dep.getM_nomDepartement());
			}
		}
		
		public static int PresenterMasseSalarialeSuccursale(Succursale unSuccursale) {
			int totalSalaireSuccursale =0;
			for (Departement dep : unSuccursale.m_listDepartments) {
				totalSalaireSuccursale+= Departement.PresenterMasseSalarialeDuDepartement(dep);
				
			}
			return totalSalaireSuccursale;
			
		}
		
		
}//fin Succursale
