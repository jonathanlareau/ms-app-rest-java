package com.example.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
final public class ServerController {

  static int count =0;
  
  @Autowired
  private Environment environment;
  
  @GetMapping("/api/sayhello/{msg}")
  public String retrieveExchangeMsg(@PathVariable final String msg) {

    final String str = "Hello from java";
    
    count++;

    return "Msg: " + msg +  " <-> " + str + " -> " + count;
  }
}