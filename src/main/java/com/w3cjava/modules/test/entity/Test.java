package com.w3cjava.modules.test.entity;

import com.w3cjava.common.persistence.DataEntity;

import lombok.Getter;
import lombok.Setter;
/**
 * 
 * @class  Test
 * @version 1.0.0
 * @author cos
 * @date   2019年7月31日
 * @desc   测试增删改查基础功能Entity
 *
 */
public class Test extends DataEntity<Test> {
	private static final long serialVersionUID = 1L;
	@Getter @Setter private String name;
}
