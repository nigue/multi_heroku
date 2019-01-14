package com.tapir.org.controller;

import com.tapir.org.BasicResponse;
import com.tapir.org.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tapir")
public class TestController {

    @Value( "${test.saludo}" )
    private String saludo;

    @Autowired
    private BasicService basicService;

    @RequestMapping("/api/helloworld")
    public ResponseEntity<BasicResponse> findAll(){
        BasicResponse result = basicService.getBasic(saludo);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
