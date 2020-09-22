package org.microservice.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigWordController {

	@Value("${config-words.word}")
	String word;

	@GetMapping("/config-words")
	public String showLuckyWord() {
		return "The Config word is: " + word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String configWord) {
		this.word = configWord;
	}
}