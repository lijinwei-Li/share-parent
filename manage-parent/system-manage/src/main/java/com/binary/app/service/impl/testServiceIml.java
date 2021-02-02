package com.binary.app.service.impl;

import com.binary.app.dao.TestDao;
import com.binary.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class testServiceIml implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<Map<String, Object>> query() {
        List<Map<String, Object>> list = testDao.query();
        return list;

    }
}
