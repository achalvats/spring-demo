package com.example.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring.learnspringframework.game.ContraGame;
import com.example.spring.learnspringframework.game.GameRunner;
import com.example.spring.learnspringframework.game.MarioGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game1 = new MarioGame();
		ContraGame game2 = new ContraGame();
		GameRunner runner1 = new GameRunner(game1);
		GameRunner runner2 = new GameRunner(game2);
		runner1.run();
		runner2.run();
	}

}
