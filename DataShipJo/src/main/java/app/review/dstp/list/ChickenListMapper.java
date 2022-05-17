package app.review.dstp.list;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import app.review.dstp.vo.DateVo;
import app.review.dstp.vo.StoreVo;
import app.review.dstp.vo.WordVo;

@Mapper
public interface ChickenListMapper 
{

	List<StoreVo> getDetailList();
	List<StoreVo> getDetailList2(int num);
	List<StoreVo> getChickenList();
	List<StoreVo> getChickenList2();
	List<StoreVo> getChickenMore(int num);
	List<StoreVo> getChickenList2(String groupedArea);
	List<StoreVo> getStore(int num);
	List<WordVo> getChickenWord(int num);
	List<StoreVo> getMoreView(int num);
	List<StoreVo> getDetailList(StoreVo paramVo);
	List<DateVo> getChickenDate(int num);
	//String getMapStore(int num);
	//String getMapAdress(int num);
	

}
