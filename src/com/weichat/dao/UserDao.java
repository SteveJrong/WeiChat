package com.weichat.dao;

import java.util.List;

import com.weichat.model.User;

/**
 * �û��ӿ�
 * 
 * ��Ŀ���ƣ�WeiChat �����ƣ�UserDao.java ��������TODO �����ˣ����� ����ʱ�䣺2016-6-20 ����11:33:18
 * �޸��ˣ����� �޸�ʱ�䣺2016-6-20 ����11:33:18 �޸ı�ע��
 * 
 * KangAndWang Soft Team
 * 
 * @version 1.0 Beta
 */
public interface UserDao extends BaseDao {
	/**
	 * ����ȫ���û���Ϣ.
	 * 
	 * @return
	 */
	List<User> findAll();
}
