package com.jpgames.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpgames.dslist.dto.GameListDTO;
import com.jpgames.dslist.entidades.GameList;
import com.jpgames.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> r = gameListRepository.findAll();
		return r.stream().map(x -> new GameListDTO(x)).toList();
		 
	}
}
