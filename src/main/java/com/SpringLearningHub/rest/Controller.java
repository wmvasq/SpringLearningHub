package com.SpringLearningHub.rest;

import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
  public String welcome() throws IOException {

  /*  if (true) throw new ResponseStatusException(
      HttpStatus.NOT_FOUND,
      "Not Found Exception."
    );*/
    return "Welcome to SpringLearningHub..";
  }
}
