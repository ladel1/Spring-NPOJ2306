package fr.eni.tp.Filmotheque.bll.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.eni.tp.Filmotheque.bll.ContexteService;
import fr.eni.tp.Filmotheque.bo.Membre;



@Service
@Profile("dev")
public class ContexteServiceBouchon implements ContexteService {
	// Liste des membres
	private static List<Membre> lstMembres;

	public ContexteServiceBouchon() {
		// initialisation de la liste
		lstMembres = new ArrayList<>();
		lstMembres.add(new Membre(1L, "Baille", "Anne-Lise", "abaille@campus-eni.fr", null));
		Membre admin = new Membre(2L, "Gobin", "Stéphane", "sgobin@campus-eni.fr", null);
		admin.setAdmin(true);
		lstMembres.add(admin);
		lstMembres.add(new Membre(3L, "Trillard", "Julien", "jtrillard@campus-eni.fr", null));
	}

	@Override
	public Membre charger(String email) {
		return lstMembres.stream().filter(item -> item.getPseudo().equals(email)).findAny().orElse(null);
	}


}
