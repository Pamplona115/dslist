package com.jpgames.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jpgames.dslist.entidades.GameList;

public interface GameListRepository extends JpaRepository<GameList ,Long>{
	
}
