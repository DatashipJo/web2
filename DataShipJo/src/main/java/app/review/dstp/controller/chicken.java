package app.review.dstp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import app.review.dstp.list.StoreDao;
import app.review.dstp.service.StoreService;
import app.review.dstp.vo.StoreVo;
import app.review.dstp.vo.DateVo;

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
		m.addAttribute("area", svc.getGroupedArea(area));
		return "thymeleaf/chicken_list";
	}

	@GetMapping("detail/{num}")
	public String go_post(@PathVariable("num") int num, Model m){
//       m.addAttribute("tableList", dao.getDetailList2(num));
		m.addAttribute("store", dao.getStore(num));
		m.addAttribute("num", num);
		m.addAttribute("months", dao.getChickenDate(num));
		return "thymeleaf/chicken_detail";
	}

	@PostMapping(value="/selectAll")
	@ResponseBody
	public List<StoreVo> MoreView(StoreVo paramVo) {
		return dao.getDetailList(paramVo);
	}

//    @PostMapping(value="/click")
//    @ResponseBody
//    public List<DateVo> dateReview(DateVo paramVo){
//       return dao.getChickenDate(paramVo);
//    }

}