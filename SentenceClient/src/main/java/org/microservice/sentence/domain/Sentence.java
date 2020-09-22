package org.microservice.sentence.domain;

import java.util.LinkedList;
import java.util.List;

public class Sentence {

	private List<String> words = new LinkedList<String>();

	public void add(Word word) {
		words.add(word.getWord());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (String word : words) {
			sb.append(word + " ");
		}
		return sb.toString();
	}
}
