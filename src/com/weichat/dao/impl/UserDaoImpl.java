package com.weichat.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.weichat.dao.UserDao;
import com.weichat.model.User;

/**
 * �û��ӿڵ�ʵ����
 * 
 * ��Ŀ���ƣ�WeiChat �����ƣ�UserDaoImpl.java ��������TODO �����ˣ����� ����ʱ�䣺2016-6-20 ����12:09:01
 * �޸��ˣ����� �޸�ʱ�䣺2016-6-20 ����12:09:01 �޸ı�ע��
 * 
 * KangAndWang Soft Team
 * 
 * @version 1.0 Beta
 */
@Repository("userDaoImpl")
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

	/**
	 * ����ȫ���û���Ϣ.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		return entityManager.createQuery("from User user").getResultList();
	}
}
