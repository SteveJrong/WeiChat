package com.weichat.dao;

import java.util.List;

import com.weichat.model.User;

/**
 * 用户接口
 * 
 * 项目名称：WeiChat 类名称：UserDao.java 类描述：TODO 创建人：王晶 创建时间：2016-6-20 上午11:33:18
 * 修改人：王晶 修改时间：2016-6-20 上午11:33:18 修改备注：
 * 
 * KangAndWang Soft Team
 * 
 * @version 1.0 Beta
 */
public interface UserDao extends BaseDao {
	/**
	 * 查找全部用户信息.
	 * 
	 * @return
	 */
	List<User> findAll();
}
