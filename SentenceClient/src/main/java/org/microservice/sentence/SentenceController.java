package org.microservice.sentence;

import org.microservice.sentence.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SentenceController {

	@Autowired
	SentenceService sentenceService;

	/**
	 * Display a small list of Sentences to the caller:
	 */
	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
		String htmlValue = "<h3>Some Sentences</h3><br/>" + sentenceService.buildSentence() + "<br/><br/>"
				+ sentenceService.buildSentence() + "<br/><br/>" + sentenceService.buildSentence() + "<br/><br/>"
				+ sentenceService.buildSentence() + "<br/><br/>" + sentenceService.buildSentence() + "<br/><br/>";
		return htmlValue;
	}
}
