package com.jpgames.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpgames.dslist.dto.GameDTO;
import com.jpgames.dslist.dto.GameMinDTO;
import com.jpgames.dslist.entidades.Game;
import com.jpgames.dslist.projections.GameMinProjection;
import com.jpgames.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game r = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(r);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> r = gameRepository.findAll();
		return r.stream().map(x -> new GameMinDTO(x)).toList();
		 
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> r = gameRepository.searchByList(listId);
		return r.stream().map(x -> new GameMinDTO(x)).toList();
		 
	}
}
