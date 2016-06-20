package com.weichat.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {
	/**
	 * 
	 * ��ӭ�û��ķ���
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcomeUser(HttpServletRequest request) {
		ModelAndView view = new ModelAndView("welcome");
		view.addObject("name", "My First Spring MVC Enterprise Application.");
		System.out.println("������ -- ��ӭҳ�� -- �ķ�������ͼΪftl��");
		return view;
	}

	/**
	 * �û���֤�ķ���
	 * 
	 * @return
	 */
	@RequestMapping(value = "/checked", method = RequestMethod.GET)
	public String checkedUser() {
		System.out.println("������ --�û���֤ -- �ķ�������ͼΪjsp��");
		return "checked";
	}
}