package app.review.dstp.svc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.review.dstp.list.chicken_list_dao;
import app.review.dstp.vo.StoreIdxVo;
import app.review.dstp.vo.StoreVo;

@Service
public class chicken_svc {

    @Autowired
    private chicken_list_dao dao;

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
    
    

}