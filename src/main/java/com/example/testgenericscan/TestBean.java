package com.example.testgenericscan;

import org.springframework.stereotype.Component;

/**
 *
 * @author Stephane Nicoll
 */
@Component
public class TestBean implements Context<Pair<String, Integer>> {

	private final Pair<String, Integer> pair;

	public TestBean() {
		this.pair = new Pair<>("Test", 42);
	}

	@Override
	public Pair<String, Integer> getTarget() {
		return this.pair;
	}

}
