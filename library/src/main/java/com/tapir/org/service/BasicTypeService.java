package com.tapir.org.service;

import com.tapir.org.model.BasicType;

import java.util.List;

public interface BasicTypeService {
    List<BasicType> findAll();

    BasicType save(BasicType basicType);
}
