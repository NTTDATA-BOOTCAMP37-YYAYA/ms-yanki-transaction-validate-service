package com.nttdata.bootcamp.msyankitransactionvalidate.infrastructure.web.adapter.rest;


import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.msyankitransactionvalidate.domain.model.YankiTransactionValidate;
import com.nttdata.bootcamp.msyankitransactionvalidate.infrastructure.web.adapter.rest.response.ResponseYankiValidate;

import reactor.core.publisher.Mono;

/**.*/
@RestController
@RequestMapping("/yankiTransactionValidate")
public class YankiTransactionValidateControllerAdapter {

  final Logger logger = LoggerFactory.getLogger(YankiTransactionValidateControllerAdapter.class);
   
  /**.*/
  @GetMapping
  public Mono<ResponseEntity<ResponseYankiValidate>> validate(@RequestBody YankiTransactionValidate validateTransaction) {
    return    Mono.just(new ResponseEntity<ResponseYankiValidate>(
                 new ResponseYankiValidate(HttpStatus.SC_OK, Boolean.TRUE, "Validate Yanki transaction"),
                 null, HttpStatus.SC_OK));
  
  }
}
