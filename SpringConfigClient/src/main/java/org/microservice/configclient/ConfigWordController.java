package org.microservice.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigWordController {

  @Value("${config-word}") String configWord;

  @GetMapping("/config-word")
  public String showLuckyWord() {
    return "The Config word is: " + configWord;
  }
}
