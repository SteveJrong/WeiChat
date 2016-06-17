package com.sj.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mvc")
public class SpringMVCController {

	// @RequestMapping("/welcome")
	// public ModelAndView getFirstPage(HttpServletRequest request) {
	// ModelAndView view = new ModelAndView("welcome");
	// view.addObject("name", "My First Spring MVC Enterprise Application.");
	// return view;
	// }

	/**
	 * 
	 * 欢迎用户的方法
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcomeUser(HttpServletRequest request) {
		ModelAndView view = new ModelAndView("welcome");
		view.addObject("name", "My First Spring MVC Enterprise Application.");
		System.out.println("调用了 -- 欢迎页面 -- 的方法，视图为ftl。");
		return view;
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
