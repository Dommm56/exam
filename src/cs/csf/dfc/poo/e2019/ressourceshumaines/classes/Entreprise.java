package cs.csf.dfc.poo.e2019.ressourceshumaines.classes;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

	//donnes membres
			private Integer m_idEntreprise;
			private String m_nomEntreprise;
			private List<Succursale> m_listSuccursales;
			
			//Constructeur
			public Entreprise(int p_id, String p_nom) {
				this.m_idEntreprise=p_id;
				this.m_nomEntreprise=p_nom;
				this.m_listSuccursales = new ArrayList<Succursale>();
					
			}	//fin constructeur
			
			//methodes
			public void AjouterSuccursale(Succursale unSuccursale) {
				
				this.m_listSuccursales.add(unSuccursale);
			}
			
			public void SupprimerSuccursale(Succursale unSuccursale) {
				this.m_listSuccursales.remove(unSuccursale);
			}
			
			
			public void PresenterListeSuccursale(Entreprise uneEntrprise) {
				for (Succursale suc : uneEntrprise.m_listSuccursales) {
					System.out.println(suc.getM_nomSuccursale());
				}
			}
			
			public static int PresenterMasseSalarialeEntreprise(Entreprise uneEntrprise) {
				int totalSalaireEntreprise =0;
				for (Succursale suc : uneEntrprise.m_listSuccursales) {
					totalSalaireEntreprise+= Succursale.PresenterMasseSalarialeSuccursale(suc);
					
				}
				return totalSalaireEntreprise;
				
			}
	
}//fin Entreprise
