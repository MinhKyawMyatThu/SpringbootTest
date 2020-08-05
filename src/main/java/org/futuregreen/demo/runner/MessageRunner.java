package org.futuregreen.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
		System.out.println("Hello modified");
		System.out.println("Hello");
	}

}
