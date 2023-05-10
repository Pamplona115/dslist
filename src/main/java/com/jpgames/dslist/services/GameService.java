package com.jpgames.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpgames.dslist.dto.GameMinDTO;
import com.jpgames.dslist.entidades.Game;
import com.jpgames.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> r = gameRepository.findAll();
		return r.stream().map(x -> new GameMinDTO(x)).toList();
		 
	}
}
