package com.weichat.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.weichat.dao.BaseDao;

/**
 * DAO����ӿڵ�ʵ����
 * 
 * 
 * ��Ŀ���ƣ�WeiChat �����ƣ�BaseDaoImpl.java ��������TODO �����ˣ����� ����ʱ�䣺2016-6-20 ����11:30:04
 * �޸��ˣ����� �޸�ʱ�䣺2016-6-20 ����11:30:04 �޸ı�ע��
 * 
 * FreeHuman Soft Team
 * 
 * @version 1.0 Beta
 */
public class BaseDaoImpl implements BaseDao {
	@Resource
	protected HibernateTemplate hibernateTemplate;
}
