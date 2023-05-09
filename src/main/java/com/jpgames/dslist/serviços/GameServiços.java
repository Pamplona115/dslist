package com.jpgames.dslist.serviços;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpgames.dslist.DTO.gameMinDTO;
import com.jpgames.dslist.entidades.Game;
import com.jpgames.dslist.repositorio.GameRepositorio;

@Service
public class GameServiços {
	@Autowired
	private GameRepositorio gameRepositorio;
	
	public List<Game> findAll(){
		List<Game> r = gameRepositorio.findAll();
		return r;
	}
}
