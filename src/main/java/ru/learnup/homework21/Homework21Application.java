package ru.learnup.homework21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Locale;
import java.util.ResourceBundle;

@SpringBootApplication
public class Homework21Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Homework21Application.class, args);
		ResourceBundle resource = ResourceBundle.getBundle("text", Locale.US);
		Game game = context.getBean(Game.class);

		System.out.println(resource.getString("start"));
		System.out.println(resource.getString("attempt"));
		game.doGame(resource);
	}

}
