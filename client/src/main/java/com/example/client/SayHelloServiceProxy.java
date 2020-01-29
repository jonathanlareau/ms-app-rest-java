package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="sayhello-service", url="sayhello-service:3000")
public interface SayHelloServiceProxy {
  @GetMapping("/api/sayhello/{msg}/")
  public String retrieveExchangeMsg(@PathVariable("msg") String msg);
}