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
	
	public List<chicken_list_vo> getChickenList() {
		return clm.getChickenList();
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


}