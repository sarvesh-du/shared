package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class NavigationController {

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("dashboard");
	}
	
	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public ModelAndView questions() {
		return new ModelAndView("questions");
	}
	
	@RequestMapping(value = "/tests", method = RequestMethod.GET)
	public ModelAndView tests() {
		return new ModelAndView("tests");
	}
	
	@RequestMapping(value = "/mytests", method = RequestMethod.GET)
	public ModelAndView myTests() {
		return new ModelAndView("mytests");
	}
}
