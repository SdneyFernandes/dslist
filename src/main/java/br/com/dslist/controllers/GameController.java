package br.com.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation. *;


import br.com.dslist.entities.Game;
import br.com.dslist.service.GameService;


/**
 * @author fsdney
 */


@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	public List<Game> findAll() {
		List<Game> result = gameService.findAll();
		return result;
		
	}
}
