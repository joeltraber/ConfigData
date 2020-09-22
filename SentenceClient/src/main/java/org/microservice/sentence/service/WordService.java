package org.microservice.sentence.service;

import org.microservice.sentence.domain.Word;

public interface WordService {

	Word getVerb();
	Word getAdjective();
}