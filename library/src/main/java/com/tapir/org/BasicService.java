package com.tapir.org;

import org.springframework.stereotype.Service;

@Service
public class BasicService {
    public BasicResponse getBasic(String saludo) {
        BasicResponse result = new BasicResponse();
        result.setCode(200);
        result.setMsg(" servicio " + saludo);
        return result;
    }
}
