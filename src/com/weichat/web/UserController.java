package com.weichat.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weichat.service.UserService;

/**
 * �û�Controller
 * 
 * 
 * ��Ŀ���ƣ�WeiChat �����ƣ�BaseDaoImpl.java ��������TODO �����ˣ����� ����ʱ�䣺2016-6-20 ����11:30:04
 * �޸��ˣ����� �޸�ʱ�䣺2016-6-20 ����11:30:04 �޸ı�ע��
 * 
 * FreeHuman Soft Team
 * 
 * @version 1.0 Beta
 */
@Controller("userController")
public class UserController {

	@Resource(name = "userServiceImpl")
	private UserService userService;

	/**
	 * ע��.
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/user/reg", method = RequestMethod.GET)
	public String reg(ModelMap modelMap) {
		System.out.println("----------------------����������----------------------");
		modelMap.addAttribute("usersList", userService.findAllService());
		return "/home/index";
	}
}