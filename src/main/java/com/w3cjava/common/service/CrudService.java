package com.w3cjava.common.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.w3cjava.common.persistence.CrudDao;
import com.w3cjava.common.persistence.DataEntity;

/**
 * 
 * @class  CrudService
 * @version 1.0.0
 * @author cos
 * @date   2019年6月25日
 * @desc   Service基类
 *
 * @param <D>
 * @param <T>
 */
public abstract class CrudService<D extends CrudDao<T>, T extends DataEntity<T>> extends BaseService {
	/**
	 * 持久层对象
	 */
	@Autowired
	protected D dao;
	
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String id) {
		return dao.get(id);
	}
	
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity) {
		return dao.get(entity);
	}
	
	/**
	 * 查询列表数据
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity) {
		return dao.findList(entity);
	}
	

	/**
	 * 保存数据（插入或更新）
	 * @param entity
	 */
	public void save(T entity) {
		if (entity.getIsNewRecord()){
			entity.preInsert();
			dao.insert(entity);
		}else{
			entity.preUpdate();
			dao.update(entity);
		}
	}
	
	/**
	 * 删除数据
	 * @param entity
	 */
	public void delete(T entity) {
		dao.delete(entity);
	}
	
	
	/**
	 * 删除全部数据
	 * @param entity
	 */
	public void deleteAll(Collection<T> entitys) {
		for (T entity : entitys) {
			dao.delete(entity);
		}
	}

}
