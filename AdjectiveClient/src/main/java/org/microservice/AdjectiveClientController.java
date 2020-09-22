package org.microservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdjectiveClientController {
	
	@Value("${words}") String words;
	
	@GetMapping("/")
	public Map<String, String> getWord() {
		Map<String, String> valueMap = new HashMap<String, String>();
		String[] wordArray = words.split(",");
		int i = (int) Math.round(Math.random() * (wordArray.length - 1));
		valueMap.put("word", wordArray[i]);
		return valueMap;
	}
}
