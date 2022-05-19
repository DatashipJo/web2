package app.review.dstp.list;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import app.review.dstp.vo.DateVo;
import app.review.dstp.vo.StoreVo;
import app.review.dstp.vo.WordVo;

@Mapper
public interface ChickenListMapper 
{

	
	List<StoreVo> getChickenList();
	List<StoreVo> getChickenList2(String groupedArea);
	List<StoreVo> getStore(int num);
	List<WordVo> getChickenWord(int num);
	List<StoreVo> getDetailList(StoreVo paramVo);
	List<DateVo> getChickenDate(int num);
	

}
