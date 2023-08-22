package fr.eni.escaperooms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.eni.escaperooms.bll.TreasureService;
@Component
public class TreasureRoomController {
	
	@Autowired
	private TreasureService tresorService;

	public String fin() {
		return tresorService.ouvrir();
	}

	public void setTresorService(TreasureService tresorService) {
		this.tresorService = tresorService;
	}
}
