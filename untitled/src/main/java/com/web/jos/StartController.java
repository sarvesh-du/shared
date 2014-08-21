/**
 * 
 */
package com.web.jos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Deepak
 *
 */
@Controller
public class StartController {

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public ModelAndView showLogin() {
		return new ModelAndView("login");
	}
}
