package com.weichat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weichat.dao.UserDao;
import com.weichat.model.User;
import com.weichat.service.UserService;

/**
 * 用户业务接口的实现类
 * 
 * 项目名称：WeiChat 类名称：UserServiceImpl.java 类描述：TODO 创建人：王晶 创建时间：2016-6-20
 * 下午12:11:52 修改人：王晶 修改时间：2016-6-20 下午12:11:52 修改备注：
 * 
 * KangAndWang Soft Team
 * 
 * @version 1.0 Beta
 */
@Service("userServiceImpl")
public class UserServiceImpl extends BaseServiceImpl implements UserService {

	/**
	 * 用户接口
	 */
	// @Resource(name = "userDaoImpl")
	@Autowired
	private UserDao userDao;

	/**
	 * 查找全部用户信息.
	 */
	@Override
	public List<User> finAllService() {
		return userDao.findAll();
	}
}
