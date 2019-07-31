package com.w3cjava.modules.test.entity;

import com.w3cjava.common.persistence.DataEntity;

import lombok.Getter;
import lombok.Setter;

public class Test extends DataEntity<Test> {
	private static final long serialVersionUID = 1L;
	@Getter @Setter private String name;
}
