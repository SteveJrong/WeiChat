package com.weichat.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weichat.service.UserService;

@Controller("userController")
@RequestMapping("/user")
public class UserController {

	private static Logger LOGGER = LoggerFactory
			.getLogger(UserController.class);

	/**
	 * �û�ҵ��ӿ�
	 */
	@Resource(name = "userServiceImpl")
	private UserService userService;

	/**
	 * 
	 * ��ȡ�����û���Ϣ.
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String welcomeUser(HttpServletRequest request, ModelMap model) {
		// ModelAndView view = new ModelAndView("welcome");
		// view.addObject("name",
		// "My First Spring MVC Enterprise Application.");
		// System.out.println("������ -- ��ӭҳ�� -- �ķ�������ͼΪftl��");
		model.addAttribute("usersList", userService.finAllService());
		return "../WEB-INF/view/checked.jsp";
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
