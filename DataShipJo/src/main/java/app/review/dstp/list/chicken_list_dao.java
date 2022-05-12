package app.review.dstp.list;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.review.dstp.vo.chicken_list_vo;

@Repository
public class chicken_list_dao {

	@Autowired
	private ChickenListMapper clm;
	
	public int insert(chicken_list_vo vo) {
		return clm.insertUser(vo);
	}
	
	public int addAndGetKey(chicken_list_vo vo) {
		return clm.addAndGetKey(vo);
	}
	
	public chicken_list_vo selectById(int num) {
		return clm.getUserById(num);
	}
	
	public List<chicken_list_vo> getChickenList(String area) {
		String res = "";
		if (area == "jongno"){
			res = "종로구";
		}
		return clm.getChickenList(res);
	}
	
	public int update(chicken_list_vo vo) {
		return clm.updateUser(vo);
	}
	
	public int delete(int num) {
		return clm.deleteUser(num);
	}
	
	public chicken_list_vo findWithoutId(chicken_list_vo vo) {
		return clm.findWithoutId(vo);
	}
	
	
	public List<chicken_list_vo> getChickenList2() {
		
		return clm.getChickenList2();
	}

    public List<chicken_list_vo> getChickenList_area(String groupedArea) {
		return  clm.getChickenList_area();
    }
}