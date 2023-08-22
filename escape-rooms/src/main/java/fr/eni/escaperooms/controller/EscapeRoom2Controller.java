package fr.eni.escaperooms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.eni.escaperooms.bll.RoomService;
@Component("room2")
public class EscapeRoom2Controller {
	
	@Autowired
	private RoomService roomService;

	public EscapeRoom2Controller(RoomService roomService) {
		this.roomService = roomService;
	}

	public void entreeSalle2() {
		System.out.println(roomService.entreeSalle());
	}

}
