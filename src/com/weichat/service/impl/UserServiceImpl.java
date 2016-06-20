package com.weichat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.weichat.dao.UserDao;
import com.weichat.model.User;
import com.weichat.service.UserService;

/**
 * �û�ҵ��ӿڵ�ʵ����
 * 
 * 
 * ��Ŀ���ƣ�WeiChat �����ƣ�BaseDaoImpl.java ��������TODO �����ˣ����� ����ʱ�䣺2016-6-20 ����11:30:04
 * �޸��ˣ����� �޸�ʱ�䣺2016-6-20 ����11:30:04 �޸ı�ע��
 * 
 * FreeHuman Soft Team
 * 
 * @version 1.0 Beta
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	@Resource(name = "userDaoImpl")
	private UserDao userDao;

	@Override
	public List<User> findAllService() {
		return userDao.findAll();
	}
}
