package com.jpgames.dslis.controlet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpgames.dslist.entidades.Game;
import com.jpgames.dslist.serviços.GameServiços;

@RestController
@RequestMapping (value = "/games")
public class GameControle {
	@Autowired
	private GameServiços gameserviço;
	@GetMapping
	public List<Game> fingAll(){
		List<Game> r = gameserviço.findAll();
		return r;
				
	}
	

}
