package org.microservice.sentence.service;

import org.microservice.sentence.domain.Word;

import rx.Observable;

public interface WordService {

	Observable<Word> getVerb();
	Observable<Word> getAdjective();
}