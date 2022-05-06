package app.review.dstp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import app.review.dstp.list.chicken_list_dao;

@Controller
@RequestMapping("/")
public class chicken 
{
	
	@Autowired
	private chicken_list_dao dao;

	@GetMapping("/dataship")
	public String datashipjo() {
		return "test";
	}

	@GetMapping("/board/{area}")
	public String board(@PathVariable("area") String area, Model m){
		m.addAttribute("tableList", dao.getChickenList(area));
		return "thymeleaf/list";
	}
	

	@GetMapping("/boot")
	public String boot() {
		return "thymeleaf/bootstrap/boot";
	} 
	
	@GetMapping("/")
	public String main() {
		return "thymeleaf/seoul";
	}
	
	
//	@GetMapping("/board/{area}")
//	public String board(@PathVariable("area") String area , Model m){
//		// forwardin area 2 view in thymeleaf use ex <span th:text="${hello}">message</span> ---->>> 종로구 
//		// 같은 방법으로 치킨도 중국집이나 다른걸로 확장가능하나 불필요
//		m.addAttribute("area", area);
//		
//		// use path req from db
//		// List<~~~~~~VO> = svc.~~~method~~~~~(area)
//		// m.addAttribte~~~~~~~~
//		
//		// 리텅도 리다이렉트가 아니라 뷰주소로 변경~!
//		return "redirect:/";
//	}
}