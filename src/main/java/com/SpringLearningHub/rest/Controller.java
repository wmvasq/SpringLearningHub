package com.SpringLearningHub.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearningHub.SpringLearningHub.SpringLearningHubApplication;

@RestController
public class Controller {

  @Autowired
  SpringLearningHubApplication service;

  @GetMapping("/")
  public String welcome() throws IOException {
    /*  if (true) throw new ResponseStatusException(
      HttpStatus.NOT_FOUND,
      "Not Found Exception."
    );*/
    return "Welcome to SpringLearningHub..";
  }

  @GetMapping("decryptor")
  public ResponseEntity<String> decryptor(@RequestParam("token") String token)
    throws IOException {
    /*  if (true) throw new ResponseStatusException(
      HttpStatus.NOT_FOUND,
      "Not Found Exception."
    );*/
    return ResponseEntity.ok(service.decryptor(token));
  }
}
