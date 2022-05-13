package app.review.dstp.list;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import app.review.dstp.vo.StoreVo;

@Mapper
public interface ChickenListMapper 
{
	int insertUser(StoreVo vo);
	int addAndGetKey(StoreVo vo);
	StoreVo  getUserById(int num);
	List<StoreVo> getChickenList(String area);
	int updateUser(StoreVo vo);
	int deleteUser(int num);
	StoreVo  findWithoutId(StoreVo vo);
	List<StoreVo> getChickenList2(String area);
	List<StoreVo> getDetailList(); 
}
