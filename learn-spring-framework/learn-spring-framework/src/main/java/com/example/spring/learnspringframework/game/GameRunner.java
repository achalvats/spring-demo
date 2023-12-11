package com.example.spring.learnspringframework.game;

public class GameRunner {
	
	private GaminConsole game;

	public GameRunner(GaminConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
