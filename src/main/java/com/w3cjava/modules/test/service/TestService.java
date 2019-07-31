package com.w3cjava.modules.test.service;

import org.springframework.stereotype.Service;

import com.w3cjava.common.service.CrudService;
import com.w3cjava.modules.test.entity.Test;
import com.w3cjava.modules.test.mapper.TestDao;
/**
 * 
 * @class  TestService
 * @version 1.0.0
 * @author cos
 * @date   2019年7月31日
 * @desc   测试增删改查基础功能Service
 *
 */
@Service
public class TestService extends CrudService<TestDao, Test>{

}
