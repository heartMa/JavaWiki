package com.w3cjava.common.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @class  BaseService
 * @version 1.0.0
 * @author cos
 * @date   2019年6月25日
 * @desc   Service基类
 *
 */
public abstract class BaseService {
	
	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());

}