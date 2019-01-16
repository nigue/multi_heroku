package com.tapir.org.service.impl;

import com.tapir.org.dao.BasicTypeDAO;
import com.tapir.org.model.BasicType;
import com.tapir.org.service.BasicTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicTypeServiceImpl implements BasicTypeService {

    @Autowired
    private BasicTypeDAO basicTypeDAO;

    @Override
    public List<BasicType> findAll() {
        return basicTypeDAO.findAll();
    }

    @Override
    public BasicType save(BasicType basicType) {
        return basicTypeDAO.save(basicType);
    }
}
