package com.example.testgenericscan;

import java.util.StringJoiner;

/**
 *
 * @author Stephane Nicoll
 */
public class Pair<L, R> {

	private final L left;

	private final R right;

	public Pair(L left, R right) {
		this.left = left;
		this.right = right;
	}

	public L getLeft() {
		return this.left;
	}

	public R getRight() {
		return this.right;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Pair.class.getSimpleName() + "[", "]")
				.add("left=" + left)
				.add("right=" + right)
				.toString();
	}
}
