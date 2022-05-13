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
	/*
	@GetMapping("/pagepage")
	public String pagepage(Model m) {
		m.addAttribute("tableList",dao.getChickenList2());
		return "thymeleaf/pagepage";
	}
	*/
	
	@GetMapping("/pagepage/{area}")
	public String pagepage(Model m) {
		m.addAttribute("tableList",dao.getDetailList());
		return "thymeleaf/pagepage";
	}
	
	
	@GetMapping("/list_copy/{area}")
	public String list_copy(@PathVariable("area") String area, Model m){
		m.addAttribute("tableList",svc.getChickenList(area));
		return "thymeleaf/list_copy";
	}
	
	@RequestMapping("moreList")
    public String moreList(Model m) throws Exception {
 
        return "/pagepage/moreList";
    }
	
	/*
	@GetMapping("/pagepage")
	public String link(Model m) {
		m.addAttribute("list.num","list.num");
		return "list_copy/pagepage";
	}
	
	/*
	@GetMapping("/hello")
	public String hello(Model m) {
		m.addAttribute("tableList",dao.getChickenList2());
		return "thymeleaf/hello";
	}
	
	/*
	@GetMapping("/pagepage/{area}")
	public String pagepage() {
		return"thymeleaf/pagepage";
	}
	
	// 더보기 요청
	@RequestMapping(value = "/member/searchMoreNotify.do", produces = "application/text;charset=UTF-8", method=RequestMethod.POST)
	@ResponseBody
	public String searchMoreNotify(@RequestParam Map<String,String> param) throws Exception {
		Map<String, String> searchParam = new HashMap<String, String>();	// search 파라미터 생성
		searchParam.put("startIndex", param.get("startIndex"));	
		searchParam.put("endIndex", param.get("endIndex"));
		searchParam.put("m_id", param.get("m_id"));
		// startIndex ~ endIndex 범위에 해당하는 list 조회 
		List<MemberP005VO> addList = memberP005_d001Service.searchOldNotifyList(searchParam);
		for(MemberP005VO vo : addList) {	// 날짜 포맷 변경
			vo.setN_time(Common.formatTimeString(vo.getN_time(), commonService));
		}
		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = mapper.writeValueAsString(addList);
		return jsonStr;
	}
	
*/
 
}