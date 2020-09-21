package org.microservice.sentence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class SentenceController {

	@Autowired RestTemplate restTemplate;
	
	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
		return getWord("VerbClient") + " " + getWord("AdjectiveClient");
	}

	public String getWord(String service) {
		return restTemplate.getForObject("http://" + service, String.class);
	}
}
