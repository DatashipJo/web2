package app.review.dstp.list;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import app.review.dstp.vo.StoreVo;

@Mapper
public interface ChickenListMapper 
{
	List<StoreVo> getDetailList(StoreVo paramVo);
	List<StoreVo> getDetailList2(int num);
	List<StoreVo> getChickenList();
	List<StoreVo> getChickenList2();
	List<StoreVo> getChickenMore(int num);
	List<StoreVo> getChickenList2(String groupedArea);
	List<StoreVo> getStore(int num);
	List<StoreVo> getMoreView(int num);
}
