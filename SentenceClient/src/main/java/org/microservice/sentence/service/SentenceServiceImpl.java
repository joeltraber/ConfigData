package org.microservice.sentence.service;

import org.microservice.sentence.dao.AdjectiveClient;
import org.microservice.sentence.dao.VerbClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Build a sentence by assembling randomly generated verbs, and adjectives. The
 * individual parts of speech will be obtained by calling the various DAOs.
 */
@Service
public class SentenceServiceImpl implements SentenceService {

	VerbClient verbService;
	AdjectiveClient adjectiveService;

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		sentence = String.format("%s %s.", verbService.getWord().getString(), adjectiveService.getWord().getString());
		return sentence;
	}

	@Autowired
	public void setVerbService(VerbClient verbService) {
		this.verbService = verbService;
	}

	@Autowired
	public void setAdjectiveService(AdjectiveClient adjectiveService) {
		this.adjectiveService = adjectiveService;
	}
}
