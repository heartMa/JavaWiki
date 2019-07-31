package com.w3cjava.common.persistence;

import java.util.Date;

import com.w3cjava.common.utils.IdGen;

/**
 * 
 * @class  DataEntity
 * @version 1.0.0
 * @author cos
 * @date   2019年6月25日
 * @desc   数据Entity类
 *
 * @param <T>
 */
public abstract class DataEntity<T> extends BaseEntity<T> {
	private static final long serialVersionUID = 1L;
	protected String remarks;	// 备注
	protected Date createDate;	// 创建日期
	protected Date updateDate;	// 更新日期
	protected String delFlag; 	// 删除标记（0：正常；1：删除；2：审核）
	
	public DataEntity() {
		super();
		this.delFlag = DEL_FLAG_NORMAL;
	}
	
	public DataEntity(String id) {
		super(id);
	}
	
	
	/**
	 * 插入之前执行方法，需要手动调用
	 */
	@Override
	public void preInsert(){
		// 不限制ID为UUID，调用setIsNewRecord()使用自定义ID
		if (this.isNewRecord){
			setId(IdGen.uuid());
		}
		this.updateDate = new Date();
		this.createDate = this.updateDate;
	}
	
	/**
	 * 更新之前执行方法，需要手动调用
	 */
	@Override
	public void preUpdate(){
		this.updateDate = new Date();
	}
}
