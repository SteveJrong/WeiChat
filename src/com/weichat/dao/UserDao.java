package com.weichat.dao;

import java.util.List;

import com.weichat.model.User;

/**
 * �û��ӿ�
 * 
 * 
 * ��Ŀ���ƣ�WeiChat �����ƣ�BaseDaoImpl.java ��������TODO �����ˣ����� ����ʱ�䣺2016-6-20 ����11:30:04
 * �޸��ˣ����� �޸�ʱ�䣺2016-6-20 ����11:30:04 �޸ı�ע��
 * 
 * FreeHuman Soft Team
 * 
 * @version 1.0 Beta
 */
public interface UserDao {
	List<User> findAll();
}
