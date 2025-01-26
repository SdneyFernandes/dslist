package br.com.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dslist.entities.Game;
import br.com.dslist.repositories.GameRepository;

/**
 * @author fsdney
 */

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	
	public List<Game> findAll() {
		List<Game> result = gameRepository.findAll();
		return result;
	}
	
}
