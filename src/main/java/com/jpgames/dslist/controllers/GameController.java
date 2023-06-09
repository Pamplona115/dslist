package com.jpgames.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpgames.dslist.dto.GameDTO;
import com.jpgames.dslist.dto.GameMinDTO;
import com.jpgames.dslist.services.GameService;

@RestController
@RequestMapping (value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		GameDTO r = gameService.findById(id);
		return r;
	} 
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> r = gameService.findAll();
		return r;
	} 

}
