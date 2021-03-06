package app.review.dstp.svc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.review.dstp.list.StoreDao;
import app.review.dstp.vo.StoreIdxVo;
import app.review.dstp.vo.StoreVo;

@Service
public class chicken_svc {

    @Autowired
    private StoreDao dao;
    
    public List<StoreIdxVo> getChickenList(String area ){
        List<StoreVo> dbList = dao.getChickenList(area);
        List<StoreIdxVo> newList = new ArrayList<StoreIdxVo>();
        for ( int i=0 ; i < dbList.size(); i++ ) {
            StoreIdxVo newVo = new StoreIdxVo();
            newVo.setIdx(i+1);
            newVo.setNum(dbList.get(i).getNum());
            newVo.setStore(dbList.get(i).getStore());
            newVo.setImg(dbList.get(i).getImg());
            newVo.setAdress(dbList.get(i).getAdress());
            newVo.setS_rating(dbList.get(i).getS_rating());
            newList.add(newVo);
        }
        return newList;
    }
    
    public List<StoreVo> getChickenList2(String area){

       String groupedArea = null;
        switch (area){
            case "jongno":  groupedArea = "%종로구%' or adress Like '%중구%";
                break;
            case "dongdaemoon":  groupedArea = "%동대문구%' or adress Like '%성동구%";
                break;
            case "kangseo":  groupedArea = "%강서구%' or adress Like '%양천구%";
                break;
            case "seodaemoon": groupedArea = "%서대문구%' or adress Like '%마포구%' or adress Like '%은평구%";
               break;
            case "kangbook": groupedArea = "%도봉구%' or adress Like '%노원구%";
               break;
            case "yungdeungpo": groupedArea = "%영등포구' or adress Like '%동작구%' or adress Like '%관악구%' or adress Like '%금천구%";
               break;
            case "kangnam": groupedArea = "%강남구' or adress Like '%서초구%";
               break;
            case "kangdong": groupedArea = "%강동구' or adress Like '%송파구%";
               break;
        }
        return dao.getChickenList_area2(groupedArea);
    }
    
    public List<StoreIdxVo> reviewWord(String word){
        List<StoreVo> dbList = dao.reviewWord(word);
        List<StoreIdxVo> newList = new ArrayList<StoreIdxVo>();
        for ( int i=0 ; i < dbList.size(); i++ ) {
            StoreIdxVo newVo = new StoreIdxVo();
            newVo.setIdx(i+1);
            newVo.setNum(dbList.get(i).getNum());
            newVo.setStore(dbList.get(i).getStore());
            newVo.setImg(dbList.get(i).getImg());
            newVo.setAdress(dbList.get(i).getAdress());
            newVo.setS_rating(dbList.get(i).getS_rating());
            newList.add(newVo);
        }
        return newList;
    }
}