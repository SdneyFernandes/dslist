package br.com.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dslist.entities.Game;

/**
 * @author fsdney
 */

public interface GameRepository extends JpaRepository<Game, Long> {

}
