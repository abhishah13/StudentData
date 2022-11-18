package com.studentmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentControl {
	
	
	@GetMapping("/showStudent")
	public String showStudentList()
	{
		return "student-list.jsp";
	}
	

}
