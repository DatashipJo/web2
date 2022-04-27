package app.review.dstp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class test 
{

	@GetMapping("/dataship")
	public String datashipjo() {
		return "test";
	}

	@GetMapping("/board")
	public String boardMain(@PathVariable("area") String area){

		return "board";
	}
	@GetMapping("/board/{area}")
	public String board(@PathVariable("area") String area){

		return "board";
	}

	@GetMapping("/3/{aera}")
	public String boardMain2(@PathVariable("area") String area){

		return "seoul2";
	}

}
