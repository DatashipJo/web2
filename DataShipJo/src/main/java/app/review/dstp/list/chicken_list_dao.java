package app.review.dstp.list;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.review.dstp.vo.StoreVo;

@Repository
public class chicken_list_dao {

	@Autowired
	private ChickenListMapper clm;
	
	/*
	public StoreVo selectById(int num) {
		return clm.getUserById(num);
	}
	*/
	
	public List<StoreVo> getChickenList(String area) {
		String res = "";
		if (area == "jongno"){
			res = "종로구";
		}
		return clm.getChickenList();
	}
	

	/*
	public StoreVo  findWithoutId(StoreVo vo) {
		return clm.findWithoutId(vo);
	}
	
	*/ 
	public List<StoreVo> getDetailList() {
		return clm.getDetailList();
	}

}