package org.microservice.sentence.dao;

import org.microservice.sentence.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("VerbClient")
public interface VerbClient {

	@GetMapping(value = "/")
	public Word getWord();

}