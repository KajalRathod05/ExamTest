package com.Spring_Project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Spring_Project.demo.model.Task;
import com.Spring_Project.demo.serviceI.ServiceI;

@Controller
public class HomeController {

	@Autowired
	ServiceI si;
	
	
	
	@RequestMapping("/")
	public String getUI()
	{
		return "home";
	}
	
	
	@RequestMapping("/homeData")
	public String addtask(@ModelAttribute Task ts)
	{
		si.addTask(ts);
		return "home";
	}
	
	
	
	
	
}
