package fr.eni.tp.Filmotheque.bll;

import fr.eni.tp.Filmotheque.bo.Membre;

public interface ContexteService {
	public Membre charger(String email);
}
