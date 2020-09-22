package org.microservice.sentence.service;

import org.microservice.sentence.dao.AdjectiveClient;
import org.microservice.sentence.dao.VerbClient;
import org.microservice.sentence.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	VerbClient verbClient;
	@Autowired
	AdjectiveClient adjectiveClient;

	@Override
	public Word getVerb() {
		return verbClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public Word getAdjective() {
		return adjectiveClient.getWord();
	}
	
	public Word getFallbackAdjective() {
		return new Word("schön");
	}
}
