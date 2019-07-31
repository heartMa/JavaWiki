package com.w3cjava.modules.test.service;

import org.springframework.stereotype.Service;

import com.w3cjava.common.service.CrudService;
import com.w3cjava.modules.test.entity.Test;
import com.w3cjava.modules.test.mapper.TestDao;
@Service
public class TestService extends CrudService<TestDao, Test>{

}
