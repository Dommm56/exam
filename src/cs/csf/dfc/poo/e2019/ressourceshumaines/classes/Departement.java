package cs.csf.dfc.poo.e2019.ressourceshumaines.classes;

import java.util.ArrayList;
import java.util.List;


public class Departement {
	
	//donnes membres
	private Integer m_idDepartement;
	private String m_nomDepartement; //ici mit a public car manque de temps
	private List<Employe> m_listEmploye;
	
	public String getM_nomDepartement() {
		return m_nomDepartement;
	}

	
	//Constructeurs
	public Departement(int p_id, String p_nom) {
		this.m_idDepartement=p_id;
		this.m_nomDepartement=p_nom;
		this.m_listEmploye = new ArrayList<Employe>();
			
	}
	
	
	
	//methodes
	public void AjouterEmploye(Employe unEmploye) {
		
		this.m_listEmploye.add(unEmploye);
	}
	
	public void SupprimerEmploye(Employe unEmploye) {
		this.m_listEmploye.remove(unEmploye);
	}
	
	public void ModifierGestionnaireDunEmploye(Employe unEmploye,
			Employe nouveauGestionnaire) {
		
	}
	
	public void PresenterListeEmploye() {
		for (Employe employe : m_listEmploye) {
			System.out.println("Id: " +employe.m_idEmploye+", Nom: "+ employe.m_nomEmploye
					+ ", Salaire($): "
					+employe.m_salaireEmploye);
		}
	}
	
	public static int PresenterMasseSalarialeDuDepartement(Departement unDepartement) {
		int totalSalaireDepartement =0;
		for (Employe employe : unDepartement.m_listEmploye) {
			totalSalaireDepartement+= employe.m_salaireEmploye;
			
		}
		
		return totalSalaireDepartement;
	}
	
	
}//fin departement
