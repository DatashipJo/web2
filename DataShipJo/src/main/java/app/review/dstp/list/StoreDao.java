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
	

	
	public List<StoreVo> getChickenList() {
		return clm.getChickenList();
	}
	
	public List<StoreVo> getChickenList(String string) {
		return clm.getChickenList();
	}

	public List<StoreVo> getChickenList_area2(String groupedArea) {
		return clm.getChickenList2(groupedArea);
	}
	
	public List<StoreVo> getDetailList(StoreVo paramVo) {
		return clm.getDetailList(paramVo);
	}
	
	public List<DateVo> getChickenDate(int num){
		return clm.getChickenDate(num);
	}
	
	public List<StoreVo> getWord(int num){
		return wm.getChickenWord(num);
	}
	
	public List<StoreVo> getStore(int num){
		return clm.getStore(num);
	}
	
	public List<StoreVo> reviewWord(String word){
		return wm.reviewWord(word);
	}
	
	public List<StoreVo> wordList(String tags){
		return wm.wordList(tags);
	}

	public List<StoreVo> getBanner(int num) {
		return wm.bannerList(num);
	}
}