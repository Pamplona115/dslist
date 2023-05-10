package com.jpgames.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jpgames.dslist.entidades.Game;

public interface GameRepository extends JpaRepository<Game ,Long>{
	
}
