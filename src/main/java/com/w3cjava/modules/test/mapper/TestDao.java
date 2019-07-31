package com.w3cjava.modules.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.w3cjava.common.persistence.CrudDao;
import com.w3cjava.modules.test.entity.Test;
/**
 * 
 * @class  TestDao
 * @version 1.0.0
 * @author cos
 * @date   2019年7月31日
 * @desc   测试增删改查基础功能Mapper
 *
 */
@Mapper
public interface TestDao extends CrudDao<Test> {

}
