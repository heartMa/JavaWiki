package com.w3cjava.modules.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.w3cjava.common.web.BaseController;
import com.w3cjava.modules.test.entity.Test;
import com.w3cjava.modules.test.service.TestService;
@Controller
@RequestMapping(value="test")
public class TestController extends BaseController{
	@Autowired
	private TestService testService;
	@RequestMapping(value="save")
	public String save() {
		logger.info("##########开始保存操作##########");
		Test test = new Test();
		test.setName("test");
		testService.save(test);
		logger.info("##########保存结束操作##########");
		return this.render("test/save");
	}
}
