package app.review.dstp.list;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import app.review.dstp.vo.chicken_list_vo;

@Mapper
public interface ChickenListMapper 
{
	int insertUser(chicken_list_vo vo);
	int addAndGetKey(chicken_list_vo vo);
	chicken_list_vo getUserById(int num);
	List<chicken_list_vo> getChickenList(String area);
	int updateUser(chicken_list_vo vo);
	int deleteUser(int num);
	chicken_list_vo findWithoutId(chicken_list_vo vo);
	List<chicken_list_vo> getChickenList2(); 
}
