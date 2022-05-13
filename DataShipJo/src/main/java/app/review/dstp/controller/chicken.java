package app.review.dstp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import app.review.dstp.list.StoreDao;
import app.review.dstp.service.StoreService;
import app.review.dstp.vo.StoreVo;

@Controller
@RequestMapping("/")
public class chicken 
{

	@Autowired
	private StoreService svc;

	@Autowired
	private StoreDao dao;
	
	@GetMapping("/")
	public String main() {
		return "thymeleaf/seoul";
	}
	
	@GetMapping("/boot")
	public String boot() {
		return "thymeleaf/bootstrap/boot";
	} 
	
	@GetMapping("/board/{area}")
    public String board(@PathVariable("area") String area, Model m){
        m.addAttribute("tableList", svc.getChickenList2(area));
        return "thymeleaf/list_copy";
    }
	
    @GetMapping("detail/{num}")
    public String go_post(@PathVariable("num") int num, Model m){
    	m.addAttribute("tableList", dao.getDetailList2(num));
    	m.addAttribute("store", dao.getStore(num));
        return "thymeleaf/list_copy4";
    }

    @GetMapping("/test")
    public String test(Model m) {
    	m.addAttribute("tableList", dao.getChickenList2());
    	return "thymeleaf/list_copy2";
    }
    
//    @PostMapping(value="/selectAll")
//    @ResponseBody
//    public List<StoreVo> selectAll(StoreVo vo) {
//    	return dao.getChickenList("종로구");
//    }
    
    @PostMapping(value="/selectAll")
    @ResponseBody
    public List<StoreVo> MoreView(@PathVariable("num") int num) {
    	return dao.getMoreView(num);
    }
    
    @GetMapping("/page2")
    public String page2(Model m) {
    	m.addAttribute("tableList", dao.getChickenList2());
    	return "thymeleaf/list_copy3";
    }
}