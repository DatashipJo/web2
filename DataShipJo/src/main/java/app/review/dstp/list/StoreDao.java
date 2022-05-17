package app.review.dstp.list;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.review.dstp.vo.DateVo;
import app.review.dstp.vo.StoreVo;

@Repository
public class StoreDao {

	@Autowired
	private ChickenListMapper clm;
	
	@Autowired
	private WordMapper wm;
	
	public List<StoreVo> getDetailList(StoreVo paramVo) {
		return clm.getDetailList(paramVo);
	}
	
	public List<StoreVo> getChickenList() {
		return clm.getChickenList();
	}

	public List<StoreVo> getChickenList2() {
		return clm.getChickenList2();
	}
	
	public List<StoreVo> getChickenMore(int num){
		return clm.getChickenMore(num);
	}

	public List<StoreVo> getChickenList_area2(String groupedArea) {
		return clm.getChickenList2(groupedArea);
	}
	
	public List<StoreVo> getMoreView(int num){
		return clm.getMoreView(num);
	}

	public List<StoreVo> getChickenList(String string) {
		return clm.getChickenList();
	}

	public List<StoreVo> getDetailList2(int num) {

		return clm.getDetailList2(num);
	}
	
	public List<DateVo> getChickenDate(int num){
		return clm.getChickenDate(num);
	}
	
	public List<StoreVo> getWord(int num){
		return wm.getChickenWord(num);
	}
	
	/*
	public String getMapStore(int num){
		return clm.getMapStore(num);
	}
	
	public String getMapAdress(int num){
		return clm.getMapAdress(num);
	}
	*/
	
	public List<StoreVo> getStore(int num){
		return clm.getStore(num);
	}
	
	public List<StoreVo> reviewWord(String word){
		return wm.reviewWord(word);
	}
}