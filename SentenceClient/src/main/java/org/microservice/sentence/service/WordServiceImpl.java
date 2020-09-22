package org.microservice.sentence.service;

import java.util.concurrent.Executor;

import org.microservice.sentence.dao.AdjectiveClient;
import org.microservice.sentence.dao.VerbClient;
import org.microservice.sentence.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import rx.Observable;
import rx.schedulers.Schedulers;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	VerbClient verbClient;
	@Autowired
	AdjectiveClient adjectiveClient;

	@Autowired
	Executor executor; // Source of threads

	@Override
	public Observable<Word> getVerb() {
		return Observable.fromCallable(() -> new Word(verbClient.getWord().getWord())).subscribeOn(Schedulers.from(executor));
	}

	@Override
	@HystrixCommand(fallbackMethod = "getFallbackAdjective")
	public Observable<Word> getAdjective() {
		return Observable.fromCallable(() -> new Word(adjectiveClient.getWord().getWord())).subscribeOn(Schedulers.from(executor));
	}

	public Word getFallbackAdjective() {
		return new Word("schön");
	}

}
