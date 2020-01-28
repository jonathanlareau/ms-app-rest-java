package com.example.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiClientController {

  @Autowired
  private SayHelloServiceProxy proxy;

  @GetMapping("/apino/sayhello/{msg}")
  public String retrieveExchangeMsg(@PathVariable final String msg) {

    Map<String, String> uriVariables = new HashMap<>();
    uriVariables.put("msg", msg + " resttemplate ");

    ResponseEntity<String> responseEntity = new RestTemplate().getForEntity("http://localhost:3000/api/sayhello/{msg}",
        String.class, uriVariables);

    String response = responseEntity.getBody();

    return response;
  }

  @GetMapping("/api/sayhello/{msg}")
  public String retrieveExchangeMsgFeign(@PathVariable final String msg) {

    final String response = proxy.retrieveExchangeMsg(msg + " proxy ");

    return response;
  }

}