package org.microservice.sentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Build a sentence by assembling randomly generated verbs, and adjectives. The
 * individual parts of speech will be obtained by calling the various DAOs.
 */
@Service
public class SentenceServiceImpl implements SentenceService {

	@Autowired
	WordService wordService;

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() {
		return String.format("%s %s.", wordService.getVerb().getString(), wordService.getAdjective().getString());
	}
}
