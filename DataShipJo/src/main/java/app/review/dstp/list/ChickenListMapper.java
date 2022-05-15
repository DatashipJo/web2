package app.review.dstp.list;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import app.review.dstp.vo.StoreVo;

@Mapper
public interface ChickenListMapper 
{
/* <<<<<<< HEAD
	int insertUser(StoreVo vo);
	int addAndGetKey(StoreVo vo);
	StoreVo  getUserById(int num);
	List<StoreVo> getChickenList(String area);
	int updateUser(StoreVo vo);
	int deleteUser(int num);
	StoreVo  findWithoutId(StoreVo vo);
	List<StoreVo> getChickenList2(String area);
	List<StoreVo> getDetailList(); 
=======

*/
	List<StoreVo> getDetailList();
	List<StoreVo> getDetailList2(int num);
	List<StoreVo> getChickenList();
	List<StoreVo> getChickenList2();
	List<StoreVo> getChickenMore(int num);
	List<StoreVo> getChickenList2(String groupedArea);
	List<StoreVo> getStore(int num);
	List<StoreVo> getMoreView(int num);
	List<StoreVo> getDetailList(StoreVo paramVo);

}
