package com.police.fir.controller;

import com.police.fir.Entity.FIRSearchBean;
import com.police.fir.service.FIRSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FIRSearchController {

    private final FIRSearchService firSearchService;

    @Autowired
    public FIRSearchController(FIRSearchService firSearchService) {
        this.firSearchService = firSearchService;
    }



    @GetMapping("/hello")
    public ResponseEntity<String> getFIR(){
        System.out.println("hi");
       return new ResponseEntity<String>(firSearchService.searchAPIConsume(), HttpStatus.OK);
    }
}
