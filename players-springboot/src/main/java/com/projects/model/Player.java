package com.projects.model;

public class Player {
	
	private String name;
	private String avgScore;
	private String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(String avgScore) {
		this.avgScore = avgScore;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", avgScore=" + avgScore + ", role="
				+ role + "]";
	}
	

}
