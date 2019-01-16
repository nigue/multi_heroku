package com.tapir.org.controller;

import com.tapir.org.BasicResponse;
import com.tapir.org.BasicService;
import com.tapir.org.controller.response.TypeResponse;
import com.tapir.org.model.BasicType;
import com.tapir.org.service.BasicTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/tapir")
public class TestController {

    @Value("${test.saludo}")
    private String saludo;

    @Autowired
    private BasicService basicService;

    @Autowired
    private BasicTypeService basicTypeService;

    @RequestMapping("/api/helloworld")
    public ResponseEntity<BasicResponse> helloworld() {
        BasicResponse result = basicService.getBasic(" cambio en modulo " + saludo);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping("/api/type/all")
    public ResponseEntity<List<TypeResponse>> findAll() {
        List<TypeResponse> result = new ArrayList<>();
        List<BasicType> types = basicTypeService.findAll();
        for (BasicType bt:types){
            result.add(new TypeResponse(bt));
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
