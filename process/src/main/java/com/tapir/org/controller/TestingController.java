package com.tapir.org.controller;

import com.tapir.org.BasicResponse;
import com.tapir.org.BasicService;
import com.tapir.org.controller.request.TypeRequest;
import com.tapir.org.model.BasicType;
import com.tapir.org.service.BasicTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tapor")
public class TestingController {

    @Value( "${test.saludo}" )
    private String saludo;

    @Autowired
    private BasicService basicService;

    @Autowired
    private BasicTypeService basicTypeService;

    @RequestMapping("/api/helloworld")
    public ResponseEntity<BasicResponse> findAll(){
        BasicResponse result = basicService.getBasic(saludo + " 1234 ");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping("/api/typeSave")
    public ResponseEntity<BasicResponse> save(@RequestBody TypeRequest request){

        BasicType basicType = new BasicType();
        basicType.setMensaje(request.getMsg());

        basicType = basicTypeService.save(basicType);
        BasicResponse result = basicService.getBasic(saludo + " servicio guardado OK " + basicType.getId());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
