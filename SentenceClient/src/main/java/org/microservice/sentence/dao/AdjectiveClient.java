package org.microservice.sentence.dao;

import org.microservice.sentence.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("AdjectiveClient")
public interface AdjectiveClient {

	@GetMapping(value = "/")
	public Word getWord();

	static class HystrixClientFallback implements AdjectiveClient {

		@Override
		public Word getWord() {
			return new Word();
		}
	}
}
