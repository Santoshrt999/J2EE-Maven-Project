package com.projects.model;

import java.util.Arrays;

public class Players {

	
	Player[] player = new Player[10];

	public Player[] getPlayer() {
		return player;
	}

	public void setPlayer(Player[] player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Players [player=" + Arrays.toString(player) + "]";
	}
	
}
