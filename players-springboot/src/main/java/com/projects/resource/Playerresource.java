package com.projects.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projects.model.Player;
import com.projects.model.Players;

@RestController
@RequestMapping(value="/player")
public class Playerresource {
	
	@RequestMapping(value="/all", method=RequestMethod.GET, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Players getPlayers(){
		
		return loadPlayers();
	}
	
	public Players loadPlayers(){
		
		
		
		Players players = new Players();
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		p1.setName("Sachin Tendulkar");
		p1.setAvgScore("50");
		p1.setRole("Batsman");
		
		p2.setName("Virat KOHLI");
		p2.setAvgScore("79");
		p2.setRole("right-handed Batsman");
		
		p3.setName("ms DHONI");
		p3.setAvgScore("56");
		p3.setRole("Wicket keepeer");
		
		Player[] pArray = new Player[10];
		pArray[0]=p1;
		pArray[1]=p2;
		pArray[2]=p3;
		
		players.setPlayer(pArray);
		return players;
		
	}
	

}
