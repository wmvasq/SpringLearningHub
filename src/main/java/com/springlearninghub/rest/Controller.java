package com.springlearninghub.rest;

import com.springlearninghub.model.Book;
import com.springlearninghub.repository.BookRepository;
import com.springlearninghub.service.ServiceClass;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class Controller {

  private final ServiceClass serviceClass;

  @Autowired
  public Controller(ServiceClass serviceClass) {
    this.serviceClass = serviceClass;
  }

  @RequestMapping(
    value = "/",
    method = RequestMethod.GET,
    produces = "text/plain"
  )
  public String welcome() throws IOException {
    /*  if (true) throw new ResponseStatusException(
      HttpStatus.NOT_FOUND,
      "Not Found Exception."
    );*/
    return "Welcome to SpringLearningHub..";
  }

  @RequestMapping(
    value = "/decryptor",
    method = RequestMethod.GET,
    produces = "atext/plain"
  )
  public ResponseEntity<String> decryptor(@RequestParam("token") String token)
    throws IOException {
    /*  if (true) throw new ResponseStatusException(
      HttpStatus.NOT_FOUND,
      "Not Found Exception."
    );*/
    return ResponseEntity.ok(serviceClass.decryptor(token));
  }

  //
  @Autowired
  private BookRepository bookRepository;

  @PostMapping("/book")
  public Book save(@RequestBody Book book) {
    return bookRepository.save(book);
  }

  @GetMapping("/book")
  public List<Book> getBooks() {
    return bookRepository.findAll();
  }
}
