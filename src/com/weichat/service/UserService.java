package com.weichat.service;

import java.util.List;

import com.weichat.model.User;

/**
 * �û�ҵ��ӿ�
 * 
 * ��Ŀ���ƣ�WeiChat �����ƣ�UserService.java ��������TODO �����ˣ����� ����ʱ�䣺2016-6-20 ����12:10:03
 * �޸��ˣ����� �޸�ʱ�䣺2016-6-20 ����12:10:03 �޸ı�ע��
 * 
 * KangAndWang Soft Team
 * 
 * @version 1.0 Beta
 */
public interface UserService extends BaseService {
	/**
	 * ����ȫ���û���Ϣ.
	 * 
	 * @return
	 */
	List<User> finAllService();
}
