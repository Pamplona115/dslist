package com.jpgames.dslist.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpgames.dslist.entidades.Game;

public interface GameRepositorio extends JpaRepository<Game, Long> {
	
}
