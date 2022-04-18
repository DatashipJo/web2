package app.review.dstp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class test 
{

	@GetMapping("/dataship")
	public String datashipjo() {
		return "test";
	}
}
