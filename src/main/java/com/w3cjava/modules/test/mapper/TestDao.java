package com.w3cjava.modules.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.w3cjava.common.persistence.CrudDao;
import com.w3cjava.modules.test.entity.Test;
@Mapper
public interface TestDao extends CrudDao<Test> {

}
