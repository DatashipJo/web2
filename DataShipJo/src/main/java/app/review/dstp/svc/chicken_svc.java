package app.review.dstp.svc;

import app.review.dstp.list.chicken_list_dao;
import app.review.dstp.vo.chicken_list_vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;



public class chicken_svc {

	@Autowired
	private chicken_list_dao dao;
	public List<chicken_list_vo> getChickenList(String area ){
		String groupedArea = null;
		switch (area){
			case "jongno":  groupedArea = "WHERE adress LIKE '%종로구%' or adress LIKE '%중구%' ";
				break;
			case "jongn2":  groupedArea = "WHERE adress LIKE '%종로구%' or adress LIKE '%중구%' ";
				break;
			case "jongn3":  groupedArea = "WHERE adress LIKE '%종로구%' or adress LIKE '%중구%' ";
				break;
		}
		return dao.getChickenList_area(groupedArea);
		}
		return groupedList;

	@SpringBootApplication(scanBasePackages = {"app.review.dstp.svc.chicken_svc"})

	@Autowired
	private chicken_list_dao dao;
}

