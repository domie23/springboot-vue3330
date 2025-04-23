package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyitongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyitongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyitongzhiView;


/**
 * 会议通知
 *
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface HuiyitongzhiService extends IService<HuiyitongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyitongzhiVO> selectListVO(Wrapper<HuiyitongzhiEntity> wrapper);
   	
   	HuiyitongzhiVO selectVO(@Param("ew") Wrapper<HuiyitongzhiEntity> wrapper);
   	
   	List<HuiyitongzhiView> selectListView(Wrapper<HuiyitongzhiEntity> wrapper);
   	
   	HuiyitongzhiView selectView(@Param("ew") Wrapper<HuiyitongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyitongzhiEntity> wrapper);
   	

}

