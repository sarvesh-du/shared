/**
 * 
 */
package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Deepak
 *
 */
@Controller
@RequestMapping("/")
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public ModelAndView loginFailed() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("error", "true");
		return mav;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout() {
		return new ModelAndView("login");

	}
}
