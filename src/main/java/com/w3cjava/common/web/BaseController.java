package com.w3cjava.common.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
/**
 * 
 * @class  BaseController
 * @version 1.0.0
 * @author cos
 * @desc   基础Controller层
 *
 */
public abstract class BaseController {
	public static String THEME = "default";
	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());
	/**
	 * 管理基础路径
	 */
	@Value("${adminPath}")
	protected String adminPath;
	/**
	 * 
	 * @author cos
	 * @desc 根据配置显示对应的主题
	 * @param viewName
	 * @return
	 */
    public String render(String viewName) {
        return THEME + "/" + viewName;
    }
    
    
    
	
}
