package com.example.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
final public class ServerController {

  static int count =0;
    
  @GetMapping("/api/sayhello/{msg}")
  public String retrieveExchangeMsg(@PathVariable final String msg) {

    final String str = "Hello from java";
    
    count++;

    return "{\"Msg\":\"" + msg +  " <-> " + str + " -> " + count + " \"}";
  }
}