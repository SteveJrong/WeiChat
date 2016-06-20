package com.weichat.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.weichat.dao.UserDao;
import com.weichat.model.User;

/**
 * 用户接口的实现类
 * 
 * 项目名称：WeiChat 类名称：UserDaoImpl.java 类描述：TODO 创建人：王晶 创建时间：2016-6-20 下午12:09:01
 * 修改人：王晶 修改时间：2016-6-20 下午12:09:01 修改备注：
 * 
 * KangAndWang Soft Team
 * 
 * @version 1.0 Beta
 */
@Repository("userDaoImpl")
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

	/**
	 * 查找全部用户信息.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		return entityManager.createQuery("from User user").getResultList();
	}
}
