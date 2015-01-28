package org.bugkillers.back.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mangofactory.swagger.plugin.EnableSwagger;
@EnableSwagger
@Controller
public class IndexController {
	@RequestMapping(value = "/api/index", method = RequestMethod.GET)
	public String api() {
		return "/api/index";
	}
}