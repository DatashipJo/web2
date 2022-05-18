package app.review.dstp.list;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import app.review.dstp.vo.StoreVo;

@Mapper
public interface WordMapper 
{
	List<StoreVo> getChickenWord(int num);
	List<StoreVo> reviewWord(String word);
	List<StoreVo> wordList(String tags);
}
