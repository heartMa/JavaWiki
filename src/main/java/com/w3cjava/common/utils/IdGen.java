package com.w3cjava.common.utils;

import java.util.UUID;
/**
 * 
 * @class  IdGen
 * @version 1.0.0
 * @author cos
 * @date   2019年6月25日
 * @desc   封装各种生成唯一性ID算法的工具类.
 *
 */
public class IdGen {
	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
