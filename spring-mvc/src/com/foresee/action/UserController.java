package com.foresee.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foresee.entity.User;

	@Controller // 一个类使用了@Controller进行标记的都是Controller
	@RequestMapping("/user") // 请求url地址映射
	public class UserController  {
		@RequestMapping("/register.do")
		public String register() {  
			return "/register";
		}
	 @RequestMapping("/cs.do")
	 public ModelAndView createUser(User user){
	  ModelAndView mav = new ModelAndView();
	  mav.setViewName("/createSuccess");
	  mav.addObject("user", user);
	  return mav;
	 }
}
