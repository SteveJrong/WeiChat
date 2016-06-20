package com.weichat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weichat.dao.UserDao;
import com.weichat.model.User;
import com.weichat.service.UserService;

/**
 * �û�ҵ��ӿڵ�ʵ����
 * 
 * ��Ŀ���ƣ�WeiChat �����ƣ�UserServiceImpl.java ��������TODO �����ˣ����� ����ʱ�䣺2016-6-20
 * ����12:11:52 �޸��ˣ����� �޸�ʱ�䣺2016-6-20 ����12:11:52 �޸ı�ע��
 * 
 * KangAndWang Soft Team
 * 
 * @version 1.0 Beta
 */
@Service("userServiceImpl")
public class UserServiceImpl extends BaseServiceImpl implements UserService {

	/**
	 * �û��ӿ�
	 */
	// @Resource(name = "userDaoImpl")
	@Autowired
	private UserDao userDao;

	/**
	 * ����ȫ���û���Ϣ.
	 */
	@Override
	public List<User> finAllService() {
		return userDao.findAll();
	}
}
