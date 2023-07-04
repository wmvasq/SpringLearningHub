package com.springlearninghub.rest;



import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springlearninghub.service.ServiceClass;


@RequestMapping("/api")
@RestController
public class Controller {

  private final ServiceClass serviceClass;
 
  @Autowired
  public Controller(ServiceClass serviceClass) {
    this.serviceClass = serviceClass;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
  
  public String welcome() throws IOException {
    /*  if (true) throw new ResponseStatusException(
      HttpStatus.NOT_FOUND,
      "Not Found Exception."
    );*/
    return "Welcome to SpringLearningHub..";
  }

  @GetMapping("/decryptor")
  public ResponseEntity<String> decryptor(@RequestParam("token") String token)
    throws IOException {
    /*  if (true) throw new ResponseStatusException(
      HttpStatus.NOT_FOUND,
      "Not Found Exception."
    );*/
    return ResponseEntity.ok(serviceClass.decryptor(token));
  }
}
