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
	 * 用户业务接口
	 */
	@Resource(name = "userServiceImpl")
	private UserService userService;

	/**
	 * 
	 * 获取所有用户信息.
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String welcomeUser(HttpServletRequest request, ModelMap model) {
		// ModelAndView view = new ModelAndView("welcome");
		// view.addObject("name",
		// "My First Spring MVC Enterprise Application.");
		// System.out.println("调用了 -- 欢迎页面 -- 的方法，视图为ftl。");
		model.addAttribute("usersList", userService.finAllService());
		return "../WEB-INF/view/checked.jsp";
	}

	/**
	 * 用户验证的方法
	 * 
	 * @return
	 */
	@RequestMapping(value = "/checked", method = RequestMethod.GET)
	public String checkedUser() {
		System.out.println("调用了 --用户验证 -- 的方法，视图为jsp。");
		return "checked";
	}
}
