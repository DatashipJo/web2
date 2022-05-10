package app.review.dstp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.review.dstp.list.chicken_list_dao;
import app.review.dstp.svc.chicken_svc;
import app.review.dstp.vo.chicken_list_vo;

@Controller
@RequestMapping("/")
public class chicken 
{
	
	@Autowired
	private chicken_svc svc;
	
	@Autowired
	private chicken_list_dao dao;

	@GetMapping("/dataship")
	public String datashipjo() {
		return "test";
	}

	@GetMapping("/board/{area}")
	public String board(@PathVariable("area") String area){
		return "redirect:/";
	}
	

	@GetMapping("/boot")
	public String boot() {
		return "thymeleaf/bootstrap/boot";
	} 
	
	@GetMapping("/")
	public String main() {
		return "thymeleaf/seoul";
	}
	
	@GetMapping("/pagepage/{area}")
	public String pagepage(@PathVariable("area")String area, Model m) {
		m.addAttribute("tableList",svc.getChickenList(area));
		return "thymeleaf/pagepage";
	}

 
}